package com.example.AttendanceMangement.AttendanceManagement.config;

import com.example.AttendanceMangement.AttendanceManagement.Entity.User;
import com.example.AttendanceMangement.AttendanceManagement.Repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Component;

@Component
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepo.findByEmail(username);

        if (user == null){
            throw new UsernameNotFoundException("User not found");
        }else{
            return new CustomUser(user);
        }
    }
}
