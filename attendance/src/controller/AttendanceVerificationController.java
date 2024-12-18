package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import model.Attendance;
import model.Supervisor;

public class AttendanceVerificationController {

    private Supervisor supervisor;
    private ObservableList<Attendance> attendanceList;

    // Constructor with a reference to Supervisor
    public AttendanceVerificationController(Supervisor supervisor) {
        this.supervisor = supervisor;
        this.attendanceList = FXCollections.observableArrayList(supervisor.getAttendances());
    }

    // Method to set up and display the attendance list
    public void setupAttendanceListView(ListView<Attendance> listView) {
        listView.setItems(attendanceList);
        
        // Handle selection events for attendance list
        listView.setOnMouseClicked(this::onAttendanceSelected);
    }

    // Handle attendance selection
    private void onAttendanceSelected(MouseEvent event) {
        Attendance selectedAttendance = supervisor.getAttendances().get(event.getPickResult().getIntersectedPoint().getY());
        // Handle the attendance selection here (e.g., display details)
        System.out.println("Selected Attendance: " + selectedAttendance.getDate());
    }

    // Method to verify attendance
    public void verifyAttendance(Attendance attendance, boolean isVerified) {
        // Logic to verify attendance
        attendance.setVerified(isVerified);
        // Update the attendance list or database if necessary
    }
}
