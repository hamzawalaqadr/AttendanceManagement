package com.example.AttendanceMangement.AttendanceManagement.Repositories;

import com.example.AttendanceMangement.AttendanceManagement.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInterface extends JpaRepository <User,Integer> {

}

