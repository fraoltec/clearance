package com.aastu.model;

import javax.persistence.*;

/**
 * Created by Fraol on 8/19/2017.
 */

@Entity
@Table(name="Dormitory")
public class Dormitory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "dorm_id")
    private int dorm_id;

    @Column (name="dorm_no")
    private int dorm_no;

    @Column (name = "block_no")
    private int block_no;

    public int getDorm_id() {
        return dorm_id;
    }

    public void setDorm_id(int dorm_id) {
        this.dorm_id = dorm_id;
    }

    public int getDorm_no() {
        return dorm_no;
    }

    public void setDorm_no(int dorm_no) {
        this.dorm_no = dorm_no;
    }

    public int getBlock_no() {
        return block_no;
    }

    public void setBlock_no(int block_no) {
        this.block_no = block_no;
    }
}
