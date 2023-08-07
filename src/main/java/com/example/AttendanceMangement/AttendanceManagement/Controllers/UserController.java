package com.example.AttendanceMangement.AttendanceManagement.Controllers;
import com.example.AttendanceMangement.AttendanceManagement.Repositories.UserInterface;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {
    private final UserInterface userInterface;

    public UserController(UserInterface userInterface) {
        this.userInterface = userInterface;
    }
//    record UserRecord(String fullName, String userName, String passcode, int department_id, int is_approver){}
    @GetMapping("/")
    public String data(){
        return userInterface.findAll().toString();
    }


}
