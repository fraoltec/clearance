package com.aastu.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Fraol on 8/19/2017.
 */

@Entity
@Table(name="Clearance_Info")
public class Clearance_Info {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "clr_info_id")
    private int clr_info_id;

    @Column(name="date_cleared")
    private Date date_cleared;


    public int getClr_info_id() {
        return clr_info_id;
    }

    public void setClr_info_id(int clr_info_id) {
        this.clr_info_id = clr_info_id;
    }

    public Date getDate_cleared() {
        return date_cleared;
    }

    public void setDate_cleared(Date date_cleared) {
        this.date_cleared = date_cleared;
    }
}
