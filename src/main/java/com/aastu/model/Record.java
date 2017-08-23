package com.aastu.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

/**
 * Created by Fraol on 8/19/2017.
 */
@Entity
@Table(name="Record")
public class Record {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "rec_id")
    private int rec_id;

    @Column(name = "dateRecorded")
    private Date dateRecorded;

    @Column(name = "userRecorded")
    private String userRecorded;

    @Column(name = "iscleared")
    private String iscleared;

}
