package model;

import java.time.LocalDate;

public class Attendance {
    private String attendanceID;
    private String employeeID;
    private LocalDate date;
    private boolean verified;

    public Attendance(String attendanceID, String employeeID, LocalDate date) {
        this.attendanceID = attendanceID;
        this.employeeID = employeeID;
        this.date = date;
        this.verified = false;
    }

    // Getters and setters
    public String getAttendanceID() {
        return attendanceID;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public LocalDate getDate() {
        return date;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }
}
