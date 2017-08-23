package com.aastu.service;

import com.aastu.model.Role;
import com.aastu.model.Users;
import com.aastu.repository.RoleRepository;
import com.aastu.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;

/**
 * Created by Fraol on 8/17/2017.
 */
@Service("userService")
public class UserServiceImpl implements UserService,UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public Users findUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public void delete(Integer id) {
//        Long idd = Long.valueOf(id);
//        Integer i = id;
        userRepository.delete(id);

    }

    @Override
    public void saveUser(Users users) {
        users.setPassword(bCryptPasswordEncoder.encode(users.getPassword()));
        users.setActive(1);
        Role role=roleRepository.findByRole("ADMIN");
        users.setRoles(new HashSet<Role>(Arrays.asList(role)));
        userRepository.save(users);
    }

    private List<GrantedAuthority> getUserAuthority(Set<Role> userRoles)
    {
        Set<GrantedAuthority> roles=new HashSet<GrantedAuthority>();
        for (Role role: userRoles){
            roles.add(new SimpleGrantedAuthority(role.getRole()));
        }
        List<GrantedAuthority> grantedAuthorities=new ArrayList<>(roles);
        return grantedAuthorities;
    }

    @Override
    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Users users = userRepository.findByUsername(userName);
        List<GrantedAuthority> authorities = getUserAuthority(users.getRoles());
        return buildUserForAuthentication(users,authorities);
    }

    private UserDetails buildUserForAuthentication(Users user, List<GrantedAuthority> authorities)
    {
        return new org.springframework.security.core.userdetails.User(user.getUsername(),user.getPassword(),true,true,true,true,authorities);
    }
}
