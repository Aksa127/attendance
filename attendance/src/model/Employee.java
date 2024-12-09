package model;

import java.util.ArrayList;

public class Employee {
	private String employeeID;
	private String employeeName;
	private String employeeType;
	private String employeeGender;
	private Double hourlyRate;
	private Double monthlySalary;
	
	private Supervisor supervisor;
	private ArrayList<Attendance> attendanceList;
	private ArrayList<Salary> salaryList;
	
	

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
	
	public ArrayList<Attendance> getAttendanceList() {
		return attendanceList;
	}

	public void setAttendanceList(ArrayList<Attendance> attendanceList) {
		this.attendanceList = attendanceList;
	}

	public ArrayList<Salary> getSalaryList() {
		return salaryList;
	}

	public void setSalaryList(ArrayList<Salary> salaryList) {
		this.salaryList = salaryList;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	public String getEmployeeGender() {
		return employeeGender;
	}

	public void setEmployeeGender(String employeeGender) {
		this.employeeGender = employeeGender;
	}

	public Double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(Double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public Double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(Double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public Supervisor getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Supervisor supervisor) {
		this.supervisor = supervisor;
	}	
	
}
