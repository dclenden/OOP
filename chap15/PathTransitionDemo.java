package chap15;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class PathTransitionDemo extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a pane 
    Pane pane = new Pane();
    
    // Create a rectangle
    Rectangle rectangle = new Rectangle (0, 0, 25, 50);
    rectangle.setFill(Color.ORANGE);
    Rectangle rectangle2 = new Rectangle(0,0, 7, 13);
    rectangle2.setFill(Color.PURPLE);
    
    // Create a circle
    Circle circle = new Circle(125, 100, 50);
    circle.setFill(Color.WHITE);
    circle.setStroke(Color.BLACK);
    Circle circle2 = new Circle(75, 50, 25);
    circle2.setFill(Color.BLUE);
    circle2.setStroke(Color.RED);
    circle2.setCenterX(125);
    circle2.setCenterY(100);
    
    // Add circle and rectangle to the pane
    pane.getChildren().addAll(circle,rectangle,circle2,rectangle2);
    
    // Create a path transition 
    PathTransition pt1 = new PathTransition();
    pt1.setDuration(Duration.millis(2000));
    pt1.setPath(circle2);
    pt1.setNode(rectangle2);
    pt1.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
    pt1.setCycleCount(Timeline.INDEFINITE);
    pt1.setAutoReverse(true);
    PathTransition pt = new PathTransition();
    pt.setDuration(Duration.millis(4000));
    pt.setPath(circle);
    pt.setNode(rectangle);
    pt.setOrientation(
      PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
    pt.setCycleCount(Timeline.INDEFINITE);
    pt.setAutoReverse(true);
    //pt.setRate(1.0);
    pt.play(); // Start animation
    pt1.play();
    
    circle.setOnMousePressed(e -> pt.pause());
    circle.setOnMouseReleased(e -> pt.play());
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 250, 200);
    primaryStage.setTitle("PathTransitionDemo"); // Set the stage title
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

