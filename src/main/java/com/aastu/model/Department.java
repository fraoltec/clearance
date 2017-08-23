package com.aastu.model;

import javax.persistence.*;

/**
 * Created by Fraol on 8/19/2017.
 */

@Entity
@Table (name="Department")

public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "dep_id")
    private int dep_id;

    @Column(name = "dep_name")
    private String dep_name;

    public int getDep_id() {
        return dep_id;
    }

    public void setDep_id(int dep_id) {
        this.dep_id = dep_id;
    }

    public String getDep_name() {
        return dep_name;
    }

    public void setDep_name(String dep_name) {
        this.dep_name = dep_name;
    }
}
