package model;

public class Employee {
    private String employeeID;
    private String employeeName;
    private String employeeRole;

    public Employee(String employeeID, String employeeName, String employeeRole) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeRole = employeeRole;
    }

    // Getters and setters for employee properties
    public String getEmployeeID() {
        return employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeRole() {
        return employeeRole;
    }
}
