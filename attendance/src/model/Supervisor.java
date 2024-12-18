package model;

import java.util.ArrayList;
import java.util.List;

public class Supervisor {
    private int supervisorID;
    private String supervisorName;
    
    private List<Employee> employeeList = new ArrayList<>();
    private List<Attendance> attendanceList = new ArrayList<>();

    public Supervisor(int supervisorID, String supervisorName) {
        this.supervisorID = supervisorID;
        this.supervisorName = supervisorName;
    }

    // Getter for employees
    public List<Employee> getEmployees() {
        return employeeList;
    }

    // Getter for attendance records
    public List<Attendance> getAttendances() {
        return attendanceList;
    }

    // Add an employee
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    // Delete an employee
    public void deleteEmployee(String employeeID) {
        employeeList.removeIf(emp -> emp.getEmployeeID().equals(employeeID));
    }

    // Update an employee
    public void updateEmployee(String oldEmployeeID, Employee newEmployee) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getEmployeeID().equals(oldEmployeeID)) {
                employeeList.set(i, newEmployee);
                break;
            }
        }
    }

    // Add attendance
    public void addAttendance(Attendance attendance) {
        attendanceList.add(attendance);
    }

    // Remove attendance
    public void removeAttendance(String attendanceID) {
        attendanceList.removeIf(att -> att.getAttendanceID().equals(attendanceID));
    }
}
