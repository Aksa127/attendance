package main;

import javafx.application.Application;
import javafx.stage.Stage;
import model.Supervisor;
import view.Login;

public class Main extends Application {

	public static void main(String[] args) {
		
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Login loginPage  = new Login(primaryStage);
		
		primaryStage.setTitle("Clocky");
		primaryStage.setScene(loginPage.getScene());
		primaryStage.show();
	}
		
}

