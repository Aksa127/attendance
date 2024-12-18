package controller;

import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class MainController {

    private Stage primaryStage;

    public MainController(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    // Open the employee management scene
    public void openEmployeeManagement() {
        try {
            EmployeeManagementController employeeController = new EmployeeManagementController();
            Scene employeeScene = new Scene(employeeController.createEmployeeManagementScene(), 600, 400);
            primaryStage.setScene(employeeScene);
            primaryStage.show();
        } catch (Exception e) {
            showError("Error", "Could not open employee management scene.");
        }
    }

    // Open the attendance verification scene
    public void openAttendanceVerification() {
        try {
            AttendanceVerificationController attendanceController = new AttendanceVerificationController();
            Scene attendanceScene = new Scene(attendanceController.createAttendanceVerificationScene(), 600, 400);
            primaryStage.setScene(attendanceScene);
            primaryStage.show();
        } catch (Exception e) {
            showError("Error", "Could not open attendance verification scene.");
        }
    }

    // Error handling method
    private void showError(String title, String message) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
