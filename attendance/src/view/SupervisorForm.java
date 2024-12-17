package view;

import java.time.LocalDate;
import java.time.LocalTime;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
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
import model.Supervisor;

public class SupervisorForm extends HBox {
	
	private Scene scene;
	private VBox form;
	private HBox buttonbox;
	private TableView<Supervisor> table;
	private TextField supervisorID, dateTF;
	private RadioButton clockInTimeRB, clockOutTimeRB;
	private Button submitbtn, verifybtn, logoutbtn;
	private ToggleGroup tg;
	
	public SupervisorForm(Stage primaryStage) {
		init();
		setLayout();
		scene = new Scene(this, 700, 700);
	}
	
	public void init() {
		table = new TableView<>();		
		supervisorID = new TextField();
		supervisorID.setPromptText("Supervisor ID");						
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
		
		verifybtn = new Button("Verify");
		
		verifybtn.setOnAction(e -> {
			
		});
		
		buttonbox = new HBox(10, submitbtn, verifybtn);
		
		logoutbtn = new Button("Log Out");
		
		logoutbtn.setOnAction(e -> {
			
		});
	}
	
	private void setLayout() {
		setPadding(new Insets(10));		
		setSpacing(20);
		
		form = new VBox(10, supervisorID, dateTF, clockInTimeRB, clockOutTimeRB, buttonbox, logoutbtn);
		getChildren().addAll(table, form);
		
		buttonbox.setAlignment(Pos.CENTER_LEFT);
		VBox.setVgrow(buttonbox, javafx.scene.layout.Priority.NEVER);
		VBox.setMargin(logoutbtn, new Insets(50,0,0,0));
		
		TableColumn<Supervisor, String>
		idCol = new TableColumn<>("ID");
		idCol.setCellValueFactory(new PropertyValueFactory<>("supervisorID"));
		
		TableColumn<Supervisor, String>
		namaCol = new TableColumn<>("Name");
		namaCol.setCellValueFactory(new PropertyValueFactory<>("supervisorName"));
		
		TableColumn<Supervisor, LocalTime>
		clockInCol = new TableColumn<>("Clock In Time");
		clockInCol.setCellValueFactory(new PropertyValueFactory<>("clockInTime"));
		
		TableColumn<Supervisor, LocalTime>
		clockOutCol = new TableColumn<>("Clock Out Time");
		clockOutCol.setCellValueFactory(new PropertyValueFactory<>("clockOutTime"));
		
		TableColumn<Supervisor, LocalDate>
		dateCol = new TableColumn<>("Date");
		dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));		
		
		table.getColumns().addAll(idCol, namaCol, clockInCol, clockOutCol, dateCol);
	}

}
