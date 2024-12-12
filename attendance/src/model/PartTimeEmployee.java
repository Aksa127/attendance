package model;

import java.util.ArrayList;

public class PartTimeEmployee extends Employee {
	private double hourlyRate;

	public PartTimeEmployee(String employeeID, String employeeName, String employeeType, String employeeGender, Supervisor supervisor, ArrayList<Attendance> attendanceList,
			ArrayList<Salary> salaryList) {
		super(employeeID, employeeName, employeeType, employeeGender, supervisor, attendanceList, salaryList);
	}
	
//	hourlyRate
	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	
}
