package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Employee {
	private String attendanceID;
	private String employeeName;
	private String employeeType;
	private String employeeGender;
	
	private Supervisor supervisor;
	/*  +----------+ 1..*       1 +------------+
        | Employee |--------------| Supervisor |
        +----------+              +------------+  */
	
	private ArrayList<Attendance> attendanceList;
	private HashMap<String, Attendance> attendanceMap = new HashMap<String, Attendance>();
	/*  +----------+ 1       1..* +------------+
        | Employee |--------------| Attendance |
        +----------+              +------------+  */
	
	private ArrayList<Salary> salaryList;
	private HashMap<String, Salary> salaryMap = new HashMap<String, Salary>();
	/*  +----------+ 1       1..* +--------+
        | Employee |--------------| Salary |
        +----------+              +--------+  */

	public Employee(String employeeID, String employeeName, String employeeType, String employeeGender, Supervisor supervisor, ArrayList<Attendance> attendanceList,
			ArrayList<Salary> salaryList) {
		super();
		this.attendanceID = employeeID;
		this.employeeName = employeeName;
		this.employeeType = employeeType;
		this.employeeGender = employeeGender;
		this.supervisor = supervisor;
		this.attendanceList = attendanceList;
		this.salaryList = salaryList;
	}
	
//	attendanceList getter, setter, deleter, and updater and adder
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
	
	public void deleteAttendance(String attendanceID) {
		attendanceList.remove(attendanceMap.get(attendanceID));
		attendanceMap.remove(attendanceID);
	}
	
	public void deleteAttendanceList() {
		attendanceList.clear();
		attendanceMap.clear();
	}
	
	public void updateAttendance(String oldAttendanceID, Attendance newAttendance) {
		attendanceList.set(attendanceList.indexOf(attendanceMap.get(oldAttendanceID)), newAttendance);
		attendanceMap.remove(oldAttendanceID);
		attendanceMap.put(newAttendance.getAttendanceID(), newAttendance);
	}
	
	public void addEmployee(Attendance attendance) {
		this.attendanceList.add(attendance);
		attendanceMap.put(attendance.getAttendanceID(), attendance);
	}
	
	public void addAllEmployee(Collection<Attendance> attendance) {
		this.attendanceList.addAll(attendance);
		
		Iterator<Attendance> iterator = attendance.iterator();
		while (iterator.hasNext()) {
			attendanceMap.put(iterator.next().getAttendanceID(), iterator.next());
		}
	}

//	salaryList getter, setter, deleter, and updater and adder
	public List<Attendance> getSalary() {
		return Collections.unmodifiableList(attendanceList);
	}

	public void setSalary(Collection<Salary> salaryList) {
		if (salaryList == null) {
			throw new NullPointerException("List can't be empty");
		}
		
		Iterator<Salary> iterator = salaryList.iterator();
		while (iterator.hasNext()) {
			salaryMap.put(iterator.next().getSalaryID(), iterator.next());
		}
		
		this.salaryList = new ArrayList<Salary>(salaryList);
	}
	
	public void deleteSalary(String salaryID) {
		salaryList.remove(salaryMap.get(salaryID));
		salaryMap.remove(salaryID);
	}
	
	public void deleteSalaryList() {
		attendanceList.clear();
		attendanceMap.clear();
	}
	
	public void updateSalary(String oldSalaryID, Salary newSalary) {
		salaryList.set(salaryList.indexOf(salaryMap.get(oldSalaryID)), newSalary);
		salaryMap.remove(oldSalaryID);
		salaryMap.put(newSalary.getSalaryID(), newSalary);
	}
	
	public void addSalary(Salary salary) {
		this.salaryList.add(salary);
		salaryMap.put(salary.getSalaryID(), salary);
	}
	
	public void addAllSalary(Collection<Salary> salary) {
		this.salaryList.addAll(salary);
		
		Iterator<Salary> iterator = salary.iterator();
		while (iterator.hasNext()) {
			salaryMap.put(iterator.next().getSalaryID(), iterator.next());
		}
	}

//	employeeID
	public String getEmployeeID() {
		return attendanceID;
	}

	public void setEmployeeID(String employeeID) {
		this.attendanceID = employeeID;
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

//	supervisor
	public Supervisor getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Supervisor supervisor) {
		this.supervisor = supervisor;
	}
	
//	Methods
	
	
}
