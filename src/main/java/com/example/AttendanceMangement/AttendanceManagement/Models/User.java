package com.example.AttendanceMangement.AttendanceManagement.Models;

import jakarta.persistence.*;

import java.util.Optional;

@Table(name="intern_users")
@Entity
public class User {
    @Id
    private int user_Id;
    private String fullname;
    private String username;
    private String passcode;
    private int is_Approver;

    @OneToOne
    @JoinColumn(name="department_id")
    private Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public User() {
    }
    public User(String fullName, String userName, String passCode, int department_Id, int is_Approver) {
        this.fullname = fullName;
        this.username = userName;
        this.passcode = passCode;
//        this.department_Id = department_Id;
        this.is_Approver = is_Approver;
    }

    public int getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(int user_Id) {
        this.user_Id = user_Id;
    }

    public String getFullName() {
        return fullname;
    }

    public void setFullName(String fullName) {
        this.fullname = fullName;
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String userName) {
        this.username = userName;
    }

    public String getPassCode() {
        return passcode;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_Id=" + user_Id +
                ", fullName='" + fullname + '\'' +
                ", userName='" + username + '\'' +
                ", passCode='" + passcode + '\'' +
                ", is_Approver=" + is_Approver +
                ", department=" + department +
                '}';
    }

    public void setPassCode(String passCode) {
        this.passcode = passCode;
    }

    public int getIs_Approver() {
        return is_Approver;
    }

    public void setIs_Approver(int is_Approver) {

        this.is_Approver = is_Approver;
    }

}
