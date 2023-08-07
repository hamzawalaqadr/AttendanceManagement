package com.example.AttendanceMangement.AttendanceManagement.Repositories;

import com.example.AttendanceMangement.AttendanceManagement.Models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentInterface extends JpaRepository<Department,Integer> {
}
