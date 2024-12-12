package model;

import java.util.ArrayList;

public class FullTimeEmployee extends Employee {
	private double monthlySalary;

	public FullTimeEmployee(String employeeID, String employeeName, String employeeType, String employeeGender, Supervisor supervisor, ArrayList<Attendance> attendanceList,
			ArrayList<Salary> salaryList) {
		super(employeeID, employeeName, employeeType, employeeGender, supervisor, attendanceList, salaryList);
	}

//	monthlySalary
	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	

}
