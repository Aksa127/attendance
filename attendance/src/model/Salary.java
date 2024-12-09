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
	private ArrayList<Attendance> attendance;
	
	public Salary(String salaryID, Date month, Date totalHours, Date overtimeHours, double deductions,
			double finalSalary, Employee employee, ArrayList<Attendance> attendance) {
		super();
		this.salaryID = salaryID;
		this.month = month;
		this.totalHours = totalHours;
		this.overtimeHours = overtimeHours;
		this.deductions = deductions;
		this.finalSalary = finalSalary;
		this.employee = employee;
		this.attendance = attendance;
	}

	public String getSalaryID() {
		return salaryID;
	}

	public void setSalaryID(String salaryID) {
		this.salaryID = salaryID;
	}

	public Date getMonth() {
		return month;
	}

	public void setMonth(Date month) {
		this.month = month;
	}

	public Date getTotalHours() {
		return totalHours;
	}

	public void setTotalHours(Date totalHours) {
		this.totalHours = totalHours;
	}

	public Date getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(Date overtimeHours) {
		this.overtimeHours = overtimeHours;
	}

	public double getDeductions() {
		return deductions;
	}

	public void setDeductions(double deductions) {
		this.deductions = deductions;
	}

	public double getFinalSalary() {
		return finalSalary;
	}

	public void setFinalSalary(double finalSalary) {
		this.finalSalary = finalSalary;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public ArrayList<Attendance> getAttendance() {
		return attendance;
	}

	public void setAttendance(ArrayList<Attendance> attendance) {
		this.attendance = attendance;
	}
}
