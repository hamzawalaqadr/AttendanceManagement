package Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class User {
    @Id
    private int user_Id;
    private String fullName;
    private String userName;
    private String passCode;
    private int is_Approver;

    @OneToOne
    @JoinColumn(name="department_id")
    private Department department;

    public User() {
    }
    public User(String fullName, String userName, String passCode, int department_Id, int is_Approver) {
        this.fullName = fullName;
        this.userName = userName;
        this.passCode = passCode;
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
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassCode() {
        return passCode;
    }

    public void setPassCode(String passCode) {
        this.passCode = passCode;
    }

    public int getIs_Approver() {
        return is_Approver;
    }

    public void setIs_Approver(int is_Approver) {

        this.is_Approver = is_Approver;
    }
}
