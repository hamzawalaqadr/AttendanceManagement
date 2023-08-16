package com.example.AttendanceMangement.AttendanceManagement.Repositories;

import com.example.AttendanceMangement.AttendanceManagement.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository <User,Integer> {
    public User findByEmail(String email);
}

