package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import controller.EmployeeManagementController;
import controller.AttendanceVerificationController;
import model.Attendance;
import model.Employee;
import model.Supervisor;
import javafx.scene.control.ListView;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Supervisor supervisor = new Supervisor(1, "John Supervisor");

        // Create a ListView for displaying employees
        ListView<Employee> employeeListView = new ListView<>();
        EmployeeManagementController empController = new EmployeeManagementController(supervisor);
        empController.setupEmployeeListView(employeeListView);

        // Create a ListView for displaying attendance
        ListView<Attendance> attendanceListView = new ListView<>();
        AttendanceVerificationController attController = new AttendanceVerificationController(supervisor);
        attController.setupAttendanceListView(attendanceListView);

        StackPane root = new StackPane();
        root.getChildren().add(employeeListView);

        Scene scene = new Scene(root, 600, 400);
        primaryStage.setTitle("Employee Management");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}