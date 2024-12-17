package view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Login {
	
	private Scene scene;
    private BorderPane bp;
    private GridPane gp;
    private Label loginlbl, idlbl, passwordlbl;
    private TextField idTF;
    private PasswordField passPF;
    private Button submitButton;

	public Login(Stage primaryStage) {
		createLoginPage(primaryStage);
	}
	
	private void createLoginPage(Stage primaryStage) {
        bp = new BorderPane();
        gp = new GridPane();
        
        loginlbl = new Label("Login");
        loginlbl.setStyle("-fx-font-size: 32px; -fx-font-weight: bold; -fx-text-fill: #2c3e50;");
      
        idlbl = new Label("ID Number");
        idlbl.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");
        passwordlbl = new Label("Password");
        passwordlbl.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");
      
        idTF = new TextField();
        idTF.setPromptText("Enter your ID");
        idTF.setStyle("-fx-padding: 10px; -fx-border-radius: 5px; -fx-border-color: #ccc; -fx-background-color: #f9f9f9;");

        passPF = new PasswordField();
        passPF.setPromptText("Enter your Password");
        passPF.setStyle("-fx-padding: 10px; -fx-border-radius: 5px; -fx-border-color: #ccc; -fx-background-color: #f9f9f9;");
       
        submitButton = new Button("Log In");
        submitButton.setStyle("-fx-background-color: #808080; -fx-text-fill: white; -fx-font-size: 14px; -fx-font-weight: bold; -fx-border-radius: 5px;");
        submitButton.setPrefWidth(300);
        submitButton.setOnMouseEntered(e -> submitButton.setStyle("-fx-background-color: #6e6e6e; -fx-text-fill: white; -fx-font-size: 14px; -fx-font-weight: bold; -fx-border-radius: 5px;"));
        submitButton.setOnMouseExited(e -> submitButton.setStyle("-fx-background-color: #808080; -fx-text-fill: white; -fx-font-size: 14px; -fx-font-weight: bold; -fx-border-radius: 5px;"));
        
        // redirect
        submitButton.setOnAction(e -> {
            EmployeeForm employeeForm = new EmployeeForm(primaryStage); 
            primaryStage.setScene(employeeForm.getScene());
            SupervisorForm supervisorForm = new SupervisorForm(primaryStage); 
            primaryStage.setScene(supervisorForm.getScene()); 
        });
        
        gp.add(idlbl, 0, 0);
        gp.add(idTF, 0, 1);
        gp.add(passwordlbl, 0, 2);
        gp.add(passPF, 0, 3);
        gp.add(submitButton, 0, 4);
        gp.setVgap(15);
        gp.setAlignment(Pos.CENTER);
        
        VBox vb = new VBox(20);
        vb.setAlignment(Pos.CENTER);
        vb.getChildren().addAll(loginlbl, gp);

        bp.setCenter(vb);
       
        scene = new Scene(bp, 600, 400);
        bp.setStyle("-fx-background-color: #f4f4f9;");
    }

    public Scene getScene() {
        return scene;
    }

}
