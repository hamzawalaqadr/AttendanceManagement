package com.example.AttendanceMangement.AttendanceManagement.Repositories;

import com.example.AttendanceMangement.AttendanceManagement.Entity.Timesheet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimesheetInterface extends JpaRepository<Timesheet,Integer> {
}
