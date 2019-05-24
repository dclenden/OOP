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

public class ControlCircleLambda extends Application {
  private CirclePane circlePane = new CirclePane();

  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Hold two buttons in an HBox
    HBox hBox = new HBox();
    hBox.setSpacing(10);
    hBox.setAlignment(Pos.CENTER);
    Button btEnlarge = new Button("Enlarge"), btShrink = new Button("Shrink")
    ,btBlue = new Button("Blue")
    ,btGreen = new Button("Green")
    ,btRed = new Button("Red")
    ,btReset = new Button("Reset");
    hBox.getChildren().addAll(btEnlarge, btShrink, btBlue, btGreen, btRed, btReset);
    
    btBlue.setOnAction(e -> {
    	circlePane.blue();
    });
    btGreen.setOnAction(e -> {
    	circlePane.green();
    });
    btRed.setOnAction(e -> {
    	circlePane.red();
    });
    btReset.setOnAction(e -> {
    	circlePane.reset();
    });
    // Create and register the handler
    btEnlarge.setOnAction(e -> {
    	circlePane.enlarge();
    });

 // Create and register the handler
    btShrink.setOnAction(e -> {
    	circlePane.shrink();
    });			// added per the author
    
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
  
  

  
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}

class CirclePaneL extends StackPane {
  private Circle circle = new Circle(50); 
  
  public CirclePaneL() {
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