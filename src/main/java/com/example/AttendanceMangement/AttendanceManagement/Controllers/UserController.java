package com.example.AttendanceMangement.AttendanceManagement.Controllers;
import com.example.AttendanceMangement.AttendanceManagement.Models.Department;
import com.example.AttendanceMangement.AttendanceManagement.Models.User;
import com.example.AttendanceMangement.AttendanceManagement.Repositories.DepartmentInterface;
import com.example.AttendanceMangement.AttendanceManagement.Repositories.UserInterface;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {
    private final UserInterface userInterface;
    private final DepartmentInterface departmentInterface;
    public UserController(UserInterface userInterface,DepartmentInterface departmentInterface) {
        this.userInterface = userInterface;
        this.departmentInterface = departmentInterface;
    }
    record UserRecord(String fullName, String userName, String passcode, int department_id, int is_approver){}
    record loginDetails(String passcode, int id){}
    @GetMapping("/")
    public String data(){
        return userInterface.findAll().toString();
    }
    @PostMapping("/login")
    public String login(@RequestBody loginDetails request){
        String passcode = userInterface.findById(request.id).get().getPassCode();
        if (request.passcode == passcode){
            return userInterface.findById(request.id).get().toString();
        }
        else {
            return "400";
        }
    }

    @PostMapping("/user")
    public void signupUser(@RequestBody UserRecord request) {
        User user = new User();
        user.setDepartment(departmentInterface.findById(request.department_id).get());
        user.setUserName(request.userName);
        user.setPassCode(request.passcode);
        user.setFullName(request.fullName);
        user.setIs_Approver(request.is_approver);
        try {
            userInterface.save(user);
        } catch (Exception e) {
            System.out.println(user.toString());
        }
    }



    }
