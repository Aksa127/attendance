package model;

import java.util.ArrayList;
import java.util.HashMap;

public class Employee {
	private String employeeID;
	private String employeeName;
	private String employeeType;
	private String employeeGender;
	private Double hourlyRate;
	private Double monthlySalary;
	
	private Supervisor supervisor;
	/*  +----------+ 1..*       1 +------------+
        | Employee |--------------| Supervisor |
        +----------+              +------------+  */
	
	private ArrayList<Attendance> attendanceList;
	/*  +----------+ 1       1..* +------------+
        | Employee |--------------| Attendance |
        +----------+              +------------+  */
	
	private ArrayList<Salary> salaryList;
	/*  +----------+ 1       1..* +--------+
        | Employee |--------------| Salary |
        +----------+              +--------+  */

	public Employee(String employeeID, String employeeName, String employeeType, String employeeGender,
			Double hourlyRate, Double monthlySalary, Supervisor supervisor, ArrayList<Attendance> attendanceList,
			ArrayList<Salary> salaryList) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.employeeType = employeeType;
		this.employeeGender = employeeGender;
		this.hourlyRate = hourlyRate;
		this.monthlySalary = monthlySalary;
		this.supervisor = supervisor;
		this.attendanceList = attendanceList;
		this.salaryList = salaryList;
	}
	
//	attendanceList
	public ArrayList<Attendance> getAttendanceList() {
		return attendanceList;
	}

	public void setAttendanceList(ArrayList<Attendance> attendanceList) {
		this.attendanceList = attendanceList;
	}

//	salaryList
	public ArrayList<Salary> getSalaryList() {
		return salaryList;
	}

	public void setSalaryList(ArrayList<Salary> salaryList) {
		this.salaryList = salaryList;
	}

//	employeeID
	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

//	employeeName
	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

//	employeeType
	public String getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

//	employeeGender
	public String getEmployeeGender() {
		return employeeGender;
	}

	public void setEmployeeGender(String employeeGender) {
		this.employeeGender = employeeGender;
	}

//	hourlyRate
	public Double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(Double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

//	monthlySalary
	public Double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(Double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

//	supervisor
	public Supervisor getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Supervisor supervisor) {
		this.supervisor = supervisor;
	}
	
//	Methods
	
	
}
