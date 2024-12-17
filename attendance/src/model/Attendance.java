package model;

import java.util.Date;
import java.util.HashMap;

public class Attendance {
	private String attendanceID;
	private Date ClockInTime;
	private Date ClockOutTime;
	private Date date;
	private String attendanceStatus;
	
	private Supervisor supervisor;
	/*  +------------+ 1..*       1 +------------+
        | Attendance |--------------| Supervisor |
        +------------+              +------------+  */
	
	private Salary salary;
	/*  +------------+ 1..*       1 +--------+
        | Attendance |--------------| Salary |
        +------------+              +--------+  */
	
	private Employee employee;
	/*  +------------+ 1..*       1 +----------+
        | Attendance |--------------| Employee |
        +------------+              +----------+  */
	
	public Attendance(String attendanceID, Date clockInTime, Date clockOutTime, Date date, String attendanceStatus,
			Supervisor supervisor, Salary salary, Employee employee) {
		super();
		this.attendanceID = attendanceID;
		ClockInTime = clockInTime;
		ClockOutTime = clockOutTime;
		this.date = date;
		this.attendanceStatus = attendanceStatus;
		this.supervisor = supervisor;
		this.salary = salary;
		this.employee = employee;
	}
	
//	attendanceID
	public String getAttendanceID() {
		return attendanceID;
	}

	public void setAttendanceID(String attendanceID) {
		this.attendanceID = attendanceID;
	}

//	clockInTime
	public Date getClockInTime() {
		return ClockInTime;
	}

	public void setClockInTime(Date clockInTime) {
		ClockInTime = clockInTime;
	}

//	clockOutTime
	public Date getClockOutTime() {
		return ClockOutTime;
	}

	public void setClockOutTime(Date clockOutTime) {
		ClockOutTime = clockOutTime;
	}

//	clockOutTime
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

//	attendanceStatus
	public String getAttendanceStatus() {
		return attendanceStatus;
	}

	public void setAttendanceStatus(String attendanceStatus) {
		this.attendanceStatus = attendanceStatus;
	}

//	supervisor
	public Supervisor getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Supervisor supervisor) {
		this.supervisor = supervisor;
	}

//	salary
	public Salary getSalary() {
		return salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
	}

//	employee
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
//	Methods
	
}
