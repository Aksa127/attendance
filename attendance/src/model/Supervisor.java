package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Supervisor {
	private String supervisorID;
	private String supervisorName;
	
	private ArrayList<Employee> employeeList;
	/*  +------------+ 1      1..* +----------+
        | Supervisor |-------------| Employee |
        +------------+              +----------+  */
	
	private ArrayList<Attendance> attendanceList;
	/*  +------------+ 1      1..* +------------+
        | Supervisor |-------------| Attendance |
        +------------+             +------------+  */
	
	HashMap<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();
	HashMap<Integer, Attendance> attendanceMap = new HashMap<Integer, Attendance>();

	public Supervisor(String supervisorID, String supervisorName, ArrayList<Employee> employeeList,
			ArrayList<Attendance> attendanceList) {
		super();
		this.supervisorID = supervisorID;
		this.supervisorName = supervisorName;
		this.employeeList = employeeList;
		this.attendanceList = attendanceList;
	}

//	Employee getter, setter and adder
	public List<Employee> getEmployee() {
		return Collections.unmodifiableList(employeeList);
	}

	public void setEmployee(Collection<Employee> employeeList) {
		if (employeeList == null) {
			throw new NullPointerException("List can't be empty");
		}
		
		while (employeeList.iterator().hasNext()) {
			employeeMap.put(employeeList.get, employeeList.get);
		}
		
		this.employeeList = new ArrayList<Employee>(employeeList);
	}
	
	public void addEmployee(Employee employee) {
		this.employeeList.add(employee);
	}
	
	public void addAllEmployee(Collection<Employee> employee) {
		this.employeeList.addAll(employee);
	}
	
//	Attendance getter, setter and adder
	public List<Attendance> getAttendance() {
		return Collections.unmodifiableList(attendanceList);
	}
	
	public void setAttendance(Collection<Attendance> attendanceList) {
		if (attendanceList == null) {
			throw new NullPointerException("List can't be empty");
		}
		
		this.attendanceList = new ArrayList<Attendance>(attendanceList);
	}
	
	public void addAttendance(Attendance attendance) {
		this.attendanceList.add(attendance);
	}
	
	public void addAllAttendance(Collection<Attendance> attendance) {
		this.attendanceList.addAll(attendance);
	}
	

//	supervisorID
	public String getSupervisorID() {
		return supervisorID;
	}

	public void setSupervisorID(String supervisorID) {
		this.supervisorID = supervisorID;
	}

//	supervisorName
	public String getSupervisorName() {
		return supervisorName;
	}

	public void setSupervisorName(String supervisorName) {
		this.supervisorName = supervisorName;
	}
	
//	Methods
	public boolean verifyAttendance(boolean attendanceFlag, String employeeID, String supervisorID) {
		boolean flag = false;

		 	
		
		if (attendanceFlag == true && ) {
			
		}
		
		return flag;
	}
}
