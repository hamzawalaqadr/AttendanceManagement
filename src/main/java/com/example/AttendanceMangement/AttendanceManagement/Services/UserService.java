package com.example.AttendanceMangement.AttendanceManagement.Services;

import com.example.AttendanceMangement.AttendanceManagement.Entity.User;

public interface UserService {

    public User saveUser(User user);

    public void removeSessionMessage();
}
