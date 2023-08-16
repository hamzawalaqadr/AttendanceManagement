package com.example.AttendanceMangement.AttendanceManagement.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="intern_department")
public class Department {
    @Id
    private int department_id;
    private String name;
    @OneToOne
    @JoinColumn(name="head_id")
    private User user;
    public Department(int department_id, String name) {
        this.department_id = department_id;
        this.name = name;
    }
    public Department() {}

    @Override
    public String toString() {
        return "Department{" +
                "department_id=" + department_id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getDepartment_id() {
        return department_id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
