package view;

import java.time.LocalDate;
import java.time.LocalTime;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Employee;

public class EmployeeForm extends HBox {
	
	private Scene scene;
	private VBox form;
	private TableView<Employee> table;
	private TextField employeeID, dateTF;
	private RadioButton clockInTimeRB, clockOutTimeRB;
	private Button submitbtn, logoutbtn;
	private ToggleGroup tg;
	
	public EmployeeForm(Stage primaryStage) {
		init();
		setLayout();
		scene = new Scene(this, 700, 700);
	}
	
	public void init() {
		table = new TableView<>();		
		employeeID = new TextField();
		employeeID.setPromptText("Employee ID");						
		dateTF = new TextField();
		dateTF.setPromptText("Date");
		
		tg = new ToggleGroup();		
		clockInTimeRB = new RadioButton("Clock In Time");
		clockInTimeRB.setToggleGroup(tg);		
		clockOutTimeRB = new RadioButton("Clock Out Time");
		clockOutTimeRB.setToggleGroup(tg);
		
		tg.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
			if (newValue != null) {
	            RadioButton selectedRadioButton = (RadioButton) tg.getSelectedToggle();
	        } else {
	            System.out.println("No option selected");
	        }
		});
		
		submitbtn = new Button("Submit");
		
		submitbtn.setOnAction(e -> {
			
		});
		
		logoutbtn = new Button("Log Out");
		
		logoutbtn.setOnAction(e -> {
			
		});
	}
	
	private void setLayout() {
		setPadding(new Insets(10));		
		setSpacing(20);
		
		form = new VBox(10, employeeID, dateTF, clockInTimeRB, clockOutTimeRB, submitbtn, logoutbtn);
		getChildren().addAll(table, form);
		
		VBox.setVgrow(submitbtn, javafx.scene.layout.Priority.ALWAYS);
		VBox.setMargin(logoutbtn, new Insets(50,0,0,0));
		
		TableColumn<Employee, String>
		idcol = new TableColumn<>("ID");
		idcol.setCellValueFactory(new PropertyValueFactory<>("employeeID"));
		
		TableColumn<Employee, String>
		namacol = new TableColumn<>("Name");
		namacol.setCellValueFactory(new PropertyValueFactory<>("employeeName"));
		
		TableColumn<Employee, LocalTime>
		clockInCol = new TableColumn<>("Clock In Time");
		clockInCol.setCellValueFactory(new PropertyValueFactory<>("clockInTime"));
		
		TableColumn<Employee, LocalTime>
		clockOutCol = new TableColumn<>("Clock Out Time");
		clockOutCol.setCellValueFactory(new PropertyValueFactory<>("clockOutTime"));
		
		TableColumn<Employee, LocalDate>
		dateCol = new TableColumn<>("Date");
		dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));		
		
		table.getColumns().addAll(idcol, namacol, clockInCol, clockOutCol, dateCol);
	}
	
	public EmployeeForm() {
		init();
		setLayout();
	}

}
