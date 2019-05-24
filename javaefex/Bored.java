package javaefex;
//import javafx.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
//eventhandler<actionevent> used to handle events (button clicks etc..)
public class Bored extends Application {
	
	//window is stage
	//content in the stage is the scene (buttons, widgets, etc..)
	//
	Stage window;
	Scene scene1, scene2;
	Button button;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) throws Exception {
	    window = primaryStage;
	    window.setTitle("reeeee");
	    
	    button = new Button("Click");
	    button.setOnAction(e -> {
	    	boolean result = ConfirmBox.display("Title", "What do you want to say? yes or no?");
	    	System.out.println(result);
	    });
	    
	    StackPane layout = new StackPane();
	    layout.getChildren().add(button);
	    Scene scene = new Scene(layout, 300, 250);
	    window.setScene(scene);
	    window.show();
	}
	
}
