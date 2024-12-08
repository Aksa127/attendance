package model;

import java.util.Vector;

public class Supervisor {
	private String supervisorID;
	private String supervisorName;
	
	private Vector<Employee> employee;
	/*  +------------+ 1      1..* +----------+
        | Supervisor |-------------| Employee |
        +------------+              +----------+  */
	
	private Vector<Attendance> attendance;
	/*  +------------+ 1      1..* +------------+
        | Supervisor |-------------| Attendance |
        +------------+             +------------+  */
	
	public Supervisor(String supervisorID, String supervisorName) {
		super();
		this.supervisorID = supervisorID;
		this.supervisorName = supervisorName;
	}

	public String getSupervisorID() {
		return supervisorID;
	}

	public void setSupervisorID(String supervisorID) {
		this.supervisorID = supervisorID;
	}

	public String getSupervisorName() {
		return supervisorName;
	}

	public void setSupervisorName(String supervisorName) {
		this.supervisorName = supervisorName;
	}
	
	public boolean verifyAttendance(boolean attendanceFlag) {
		boolean flag = false;
		flag = attendanceFlag;
		
		return flag;
	}
}
