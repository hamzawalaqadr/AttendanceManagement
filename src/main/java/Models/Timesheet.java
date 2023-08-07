package Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Timesheet {
    @Id
    private int timesheet_id;
    private int week;
    private int year_of;
    private int is_approved;
    private int hours_reported;

    public Timesheet(int week, int year_of, int is_approved, int hours_reported) {
        this.week = week;
        this.year_of = year_of;
        this.is_approved = is_approved;
        this.hours_reported = hours_reported;
    }
    public Timesheet() {}

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;
    public int getTimesheet_id() {
        return timesheet_id;
    }
    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public int getYear_of() {
        return year_of;
    }

    public void setYear_of(int year_of) {
        this.year_of = year_of;
    }

    public int getIs_approved() {
        return is_approved;
    }

    public void setIs_approved(int is_approved) {
        this.is_approved = is_approved;
    }

    public int getHours_reported() {
        return hours_reported;
    }

    public void setHours_reported(int hours_reported) {
        this.hours_reported = hours_reported;
    }

}
