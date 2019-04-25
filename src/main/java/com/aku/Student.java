package com.aku;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stud")
public class Student {
    @Id @GeneratedValue
    private int stdId;
    @Column(name = "student_name")
    private String stdName;
    @Column(name = "student_add")
    private String stdAddress;

    Student(String stdName, String stdAddress) {
        this.stdName = stdName;
        this.stdAddress = stdAddress;
    }

    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public String getStdAddress() {
        return stdAddress;
    }

    public void setStdAddress(String stdAddress) {
        this.stdAddress = stdAddress;
    }
}
