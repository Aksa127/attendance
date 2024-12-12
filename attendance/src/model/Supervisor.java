package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Supervisor {
	private String supervisorID;
	private String supervisorName;
	private boolean verified;
	
	private ArrayList<Employee> employeeList;
	private HashMap<String, Employee> employeeMap = new HashMap<>();
	/*  +------------+ 1      1..* +----------+
        | Supervisor |-------------| Employee |
        +------------+              +----------+  */
	
	private ArrayList<Attendance> attendanceList;
	private HashMap<String, Attendance> attendanceMap = new HashMap<>();
	/*  +------------+ 1      1..* +------------+
        | Supervisor |-------------| Attendance |
        +------------+             +------------+  */

	public Supervisor(String supervisorID, String supervisorName, ArrayList<Employee> employeeList,
			ArrayList<Attendance> attendanceList) {
		super();
		this.supervisorID = supervisorID;
		this.supervisorName = supervisorName;
		this.employeeList = employeeList;
		this.attendanceList = attendanceList;
	}

//	Employee getter, setter, deleter, and updater and adder
	public List<Employee> getEmployee() {
		return Collections.unmodifiableList(employeeList);
	}

	public void setEmployee(Collection<Employee> employeeList) {
		if (employeeList == null) {
			throw new NullPointerException("List can't be empty");
		}
		
		Iterator<Employee> iterator = employeeList.iterator();
		while (iterator.hasNext()) {
			employeeMap.put(iterator.next().getEmployeeID(), iterator.next());
		}
		
		this.employeeList = new ArrayList<Employee>(employeeList);
	}
	
	public void deleteEmployee(String employeeID) {
		employeeList.remove(employeeMap.get(employeeID));
		employeeMap.remove(employeeID);
	}
	
	public void deleteEmployeeList() {
		employeeList.clear();
		employeeMap.clear();
	}
	
	public void updateEmployee(String oldEmployeeID, Employee newEmployee) {
		employeeList.set(employeeList.indexOf(employeeMap.get(oldEmployeeID)), newEmployee);
		employeeMap.remove(oldEmployeeID);
		employeeMap.put(newEmployee.getEmployeeID(), newEmployee);
	}
	
	public void addEmployee(Employee employee) {
		this.employeeList.add(employee);
		employeeMap.put(employee.getEmployeeID(), employee);
	}
	
	public void addAllEmployee(Collection<Employee> employees) {
		this.employeeList.addAll(employees);
		
		Iterator<Employee> iterator = employees.iterator();
		while (iterator.hasNext()) {
			employeeMap.put(iterator.next().getEmployeeID(), iterator.next());
		}
	}
	
//	Attendance getter, setter and adder
	public List<Attendance> getAttendance() {
		return Collections.unmodifiableList(attendanceList);
	}
	
	public void setAttendance(Collection<Attendance> attendanceList) {
		if (attendanceList == null) {
			throw new NullPointerException("List can't be empty");
		}
		
		Iterator<Attendance> iterator = attendanceList.iterator();
		while (iterator.hasNext()) {
			attendanceMap.put(iterator.next().getAttendanceID(), iterator.next());
		}
		
		this.attendanceList = new ArrayList<Attendance>(attendanceList);
	}
	
	public void addAttendance(Attendance attendance) {
		this.attendanceList.add(attendance);
		attendanceMap.put(attendance.getAttendanceID(), attendance);
	}
	
	public void addAllAttendance(Collection<Attendance> attendances) {
		this.attendanceList.addAll(attendances);
		
		Iterator<Attendance> iterator = attendanceList.iterator();
		while (iterator.hasNext()) {
			attendanceMap.put(iterator.next().getAttendanceID(), iterator.next());
		}
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
		verified = false;
		
		if ((attendanceFlag == true) && (employeeMap.get(employeeID).getSupervisor().supervisorID == supervisorID)) {
			verified = attendanceFlag;
			return verified;
		}
		
		return verified;
	}
}
