package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class calculator extends Application {
	
	Label Label1;
	Button button1;
	int i = 1;
		
	@Override
	public void start(Stage stage) throws Exception{
		stage.setTitle("Questo è un bel titolo");
		Label1 = new Label("Questo è un Label carino");
		VBox root = new VBox();
		
		
		//creating Text 
		Text text = new Text();
		
		String bellastringa = "Questa è una stringa bella";
		text.setText(bellastringa);
		
		Scene scene = new Scene(root, 600, 450);
		stage.setScene(scene);
		
		//Creating a button 
		button1 = new Button("Questo è un bel button");
		
		button1.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle (ActionEvent event) {
				System.out.println("Hello World!");
				Label1.setText("Try"+ i);
				i++;
			}	
		});
		
		root.getChildren().addAll(Label1, button1);
		stage.show(); 
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
