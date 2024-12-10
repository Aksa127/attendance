package model;

import java.util.ArrayList;
import java.util.Date;

public class Salary {
	private String salaryID;
	private Date month;
	private Date totalHours;
	private Date overtimeHours;
	private double deductions;
	private double finalSalary;
	
	private Employee employee;
	/*  +--------+ 1..*       1 +----------+
        | Salary |--------------| Employee |
        +--------+              +----------+  */
	
	private ArrayList<Attendance> attendanceList;
	/*  +--------+ 1       1..* +------------+
        | Salary |--------------| Attendance |
        +--------+              +------------+  */
	
	public Salary(String salaryID, Date month, Date totalHours, Date overtimeHours, double deductions,
			double finalSalary, Employee employee, ArrayList<Attendance> attendanceList) {
		super();
		this.salaryID = salaryID;
		this.month = month;
		this.totalHours = totalHours;
		this.overtimeHours = overtimeHours;
		this.deductions = deductions;
		this.finalSalary = finalSalary;
		this.employee = employee;
		this.attendanceList = attendanceList;
	}

//	salaryID
	public String getSalaryID() {
		return salaryID;
	}

	public void setSalaryID(String salaryID) {
		this.salaryID = salaryID;
	}
	
//	month
	public Date getMonth() {
		return month;
	}

	public void setMonth(Date month) {
		this.month = month;
	}
	
//	totalHours
	public Date getTotalHours() {
		return totalHours;
	}

	public void setTotalHours(Date totalHours) {
		this.totalHours = totalHours;
	}

//	overtimeHours
	public Date getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(Date overtimeHours) {
		this.overtimeHours = overtimeHours;
	}

//	deductions
	public double getDeductions() {
		return deductions;
	}

	public void setDeductions(double deductions) {
		this.deductions = deductions;
	}

//	finalSalary
	public double getFinalSalary() {
		return finalSalary;
	}

	public void setFinalSalary(double finalSalary) {
		this.finalSalary = finalSalary;
	}

//	employee
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

//	attendanceList
	public ArrayList<Attendance> getAttendance() {
		return attendanceList;
	}

	public void setAttendance(ArrayList<Attendance> attendanceList) {
		this.attendanceList = attendanceList;
	}
	
//	Methods
}
