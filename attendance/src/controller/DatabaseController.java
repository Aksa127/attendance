package controller;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import model.Attendance;
import model.Employee;

public class DatabaseController {
    private static final String URL = "jdbc:mysql://localhost:3306/clocky"; // Replace with your DB name
    private static final String USER = "root"; // Replace with your username
    private static final String PASSWORD = "password"; // Replace with your password

    // Establish a new database connection
    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Add a new employee
    public void addEmployee(Employee employee) {
        String sql = "INSERT INTO msemployee (employeeName, employeeType, employeeGender) VALUES (?, ?, ?)";
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, employee.getEmployeeName());
            stmt.setString(2, employee.getEmployeeType());
            stmt.setString(3, employee.getEmployeeGender());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error adding employee: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Add attendance record
    public void addAttendance(Attendance attendance) {
        String sql = "INSERT INTO attendance (employeeID, clockInTime, clockOutTime, date, status, verifiedBy, comment) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, attendance.getEmployeeID());
            stmt.setTimestamp(2, Timestamp.valueOf(attendance.getClockInTime()));
            stmt.setTimestamp(3, Timestamp.valueOf(attendance.getClockOutTime()));
            stmt.setDate(4, Date.valueOf(attendance.getDate()));
            stmt.setString(5, attendance.getStatus());
            stmt.setObject(6, attendance.getVerifiedBy(), Types.INTEGER);
            stmt.setString(7, attendance.getComment());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error adding attendance: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Fetch attendance for a specific employee
    public List<Attendance> getAttendanceByEmployee(int employeeID) {
        List<Attendance> attendanceList = new ArrayList<>();
        String sql = "SELECT * FROM attendance WHERE employeeID = ?";
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, employeeID);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Attendance attendance = new Attendance(
                            rs.getInt("attendanceID"),
                            rs.getInt("employeeID"),
                            rs.getTimestamp("clockInTime").toLocalDateTime(),
                            rs.getTimestamp("clockOutTime").toLocalDateTime(),
                            rs.getDate("date").toLocalDate(),
                            rs.getString("status"),
                            rs.getInt("verifiedBy"),
                            rs.getString("comment")
                    );
                    attendanceList.add(attendance);
                }
            }
        } catch (SQLException e) {
            System.err.println("Error fetching attendance: " + e.getMessage());
            e.printStackTrace();
        }
        return attendanceList;
    }

    // Close resources explicitly if needed
    public void closeResources(AutoCloseable resource) {
        try {
            if (resource != null) {
                resource.close();
            }
        } catch (Exception e) {
            System.err.println("Error closing resource: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
