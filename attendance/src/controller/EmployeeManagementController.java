package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import model.Employee;
import model.Supervisor;

public class EmployeeManagementController {

    private Supervisor supervisor;
    private ObservableList<Employee> employeeList;

    // Constructor with a reference to Supervisor
    public EmployeeManagementController(Supervisor supervisor) {
        this.supervisor = supervisor;
        this.employeeList = FXCollections.observableArrayList(supervisor.getEmployees());
    }

    // Method to set up and display the employee list
    public void setupEmployeeListView(ListView<Employee> listView) {
        listView.setItems(employeeList);
        
        // Handle selection events for employee list
        listView.setOnMouseClicked(this::onEmployeeSelected);
    }

    // Handle employee selection
    private void onEmployeeSelected(MouseEvent event) {
        Employee selectedEmployee = supervisor.getEmployees().get(event.getPickResult().getIntersectedPoint().getY());
        // Handle the employee selection here (e.g., display details)
        System.out.println("Selected Employee: " + selectedEmployee.getEmployeeName());
    }

    // Method to add a new employee
    public void addEmployee(Employee employee) {
        supervisor.addEmployee(employee);
        employeeList.add(employee);
    }

    // Method to delete an employee
    public void deleteEmployee(Employee employee) {
        supervisor.deleteEmployee(employee.getEmployeeID());
        employeeList.remove(employee);
    }

    // Method to update an employee
    public void updateEmployee(Employee oldEmployee, Employee newEmployee) {
        supervisor.updateEmployee(oldEmployee.getEmployeeID(), newEmployee);
        int index = employeeList.indexOf(oldEmployee);
        if (index != -1) {
            employeeList.set(index, newEmployee);
        }
    }
}
