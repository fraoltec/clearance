package com.aastu.model;

import javax.persistence.*;

/**
 * Created by Fraol on 8/19/2017.
 */

@Entity
@Table (name="Issue")
public class Issue {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "issue_id")
    private int issue_id;

    @Column(name="issue_type")
    private String issue_type;

    @Column(name="issue_desc")
    private String issue_desc;

    @Column(name="issue_quatity")
    private int issue_quatity;

    @Column(name="issue_remark")
    private String issue_remark;


    public int getIssue_id() {
        return issue_id;
    }

    public void setIssue_id(int issue_id) {
        this.issue_id = issue_id;
    }

    public String getIssue_type() {
        return issue_type;
    }

    public void setIssue_type(String issue_type) {
        this.issue_type = issue_type;
    }

    public String getIssue_desc() {
        return issue_desc;
    }

    public void setIssue_desc(String issue_desc) {
        this.issue_desc = issue_desc;
    }

    public int getIssue_quatity() {
        return issue_quatity;
    }

    public void setIssue_quatity(int issue_quatity) {
        this.issue_quatity = issue_quatity;
    }

    public String getIssue_notes() {
        return issue_remark;
    }

    public void setIssue_notes(String issue_notes) {
        this.issue_remark = issue_notes;
    }
}
