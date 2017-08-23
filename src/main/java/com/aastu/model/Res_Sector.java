package com.aastu.model;

import javax.persistence.*;

/**
 * Created by Fraol on 8/19/2017.
 */

@Entity
@Table (name="Res_Sector")
public class Res_Sector {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "res_id")
    private int res_id;

    @Column (name="res_sector_name")
    private String res_sector_name;

    public int getRes_id() {
        return res_id;
    }

    public void setRes_id(int res_id) {
        this.res_id = res_id;
    }

    public String getRes_sector_name() {
        return res_sector_name;
    }

    public void setRes_sector_name(String res_sector_name) {
        this.res_sector_name = res_sector_name;
    }
}
