package chap15;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ControlCircle extends Application {
  private CirclePane circlePane = new CirclePane();

  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Hold two buttons in an HBox
    HBox hBox = new HBox();
    hBox.setSpacing(10);
    hBox.setAlignment(Pos.CENTER);
    Button btEnlarge = new Button("Enlarge");
    Button btShrink = new Button("Shrink");
    Button btBlue = new Button("Blue");
    Button btGreen = new Button("Green");
    Button btRed = new Button("Red");
    Button btReset = new Button("Reset");
    hBox.getChildren().addAll(btEnlarge, btShrink, btBlue, btGreen, btRed, btReset);
    
    btBlue.setOnAction(new BlueHandler());
    btGreen.setOnAction(new GreenHandler());
    btRed.setOnAction(new RedHandler());
    btReset.setOnAction(new ResetHandler());
    // Create and register the handler
    btEnlarge.setOnAction(new EnlargeHandler());

 // Create and register the handler
    btShrink.setOnAction(new ShrinkHandler());			// added per the author
    
    BorderPane borderPane = new BorderPane();
    borderPane.setCenter(circlePane);
    borderPane.setBottom(hBox);
    BorderPane.setAlignment(hBox, Pos.CENTER);
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(borderPane, 500, 450);
    primaryStage.setTitle("ControlCircle"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  
  class EnlargeHandler implements EventHandler<ActionEvent> {
    @Override // Override the handle method
    public void handle(ActionEvent e) {
      circlePane.enlarge();
    	}
    }
    
  class ShrinkHandler implements EventHandler<ActionEvent> {	// added per the author
    @Override // Override the handle method
    public void handle(ActionEvent e) {
      circlePane.shrink();
    }
  }
  class BlueHandler implements EventHandler<ActionEvent> {	// added per the author
	    @Override // Override the handle method
	    public void handle(ActionEvent e) {
	      circlePane.blue();
	      
	    }
  }
  class GreenHandler implements EventHandler<ActionEvent> {	// added per the author
	    @Override // Override the handle method
	    public void handle(ActionEvent e) {
	      circlePane.green();
	      
	    }
}
  class RedHandler implements EventHandler<ActionEvent> {	// added per the author
	    @Override // Override the handle method
	    public void handle(ActionEvent e) {
	      circlePane.red();
	      
	    }
}
  class ResetHandler implements EventHandler<ActionEvent> {	// added per the author
	    @Override // Override the handle method
	    public void handle(ActionEvent e) {
	      circlePane.reset();
	      
	    }
}
  
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}

class CirclePane extends StackPane {
  private Circle circle = new Circle(50); 
  
  public CirclePane() {
    getChildren().add(circle);
    circle.setStroke(Color.BLACK);
    circle.setFill(Color.WHITE);
  }
  
  public void enlarge() {
    circle.setRadius(circle.getRadius() + 2);
  }
  
  public void shrink() {
    circle.setRadius(circle.getRadius() > 2 ? 
      circle.getRadius() - 2 : circle.getRadius());
  }
  public void blue() {
	  circle.setFill(Color.BLUE);
  }
  public void green() {
	  circle.setFill(Color.GREEN);
  }
  public void red() {
	  circle.setFill(Color.RED);
  }
  public void reset() {
	  circle.setFill(Color.WHITE);
	  circle.setRadius(50);
  }
}