package com.aastu.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Fraol on 8/19/2017.
 */

@Entity
@Table(name="student")
public class student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "stud_id")
    private int stud_id;

    @Column(name="stud_name")
    private String stud_name;

    @Column(name="stud_idno")
    private String stud_idno;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinTable(name = "stud_dep", joinColumns = @JoinColumn(name = "stud_id"), inverseJoinColumns = @JoinColumn(name = "dep_id"))
//    private Set<Department> department;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinTable(name = "stud_dorm", joinColumns = @JoinColumn(name = "stud_id"), inverseJoinColumns = @JoinColumn(name = "dorm_id"))
//    private Set<Dormitory> dormitory;

    public int getStud_id() {
        return stud_id;
    }

    public void setStud_id(int stud_id) {
        this.stud_id = stud_id;
    }

    public String getStud_name() {
        return stud_name;
    }

    public void setStud_name(String stud_name) {
        this.stud_name = stud_name;
    }

    public String getStud_idno() {
        return stud_idno;
    }

    public void setStud_idno(String stud_idno) {
        this.stud_idno = stud_idno;
    }


}
