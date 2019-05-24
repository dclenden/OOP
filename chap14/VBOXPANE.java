package chap14;
import javafx.application.Application;
import javafx.beans.property.Property;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.beans.property.DoubleProperty;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
public class VBOXPANE extends Application{
	public static void main(String[] args){
         launch(args);
    }
    
    public void start(Stage primaryStage) {
    	Circle circle1 = new Circle(100,100,50);
    	Circle circle2 = new Circle(80,80,40);
    	Circle circle3 = new Circle(60,60,30);
    	Circle circle4 = new Circle(40,40,20);
    	Circle circle5 = new Circle(20,20,10);
    	circle1.setStroke(Color.BLUE);
        circle1.setFill(null);
    	circle2.setStroke(Color.ORANGE);
        circle2.setFill(null);
        circle3.setStroke(Color.RED);
        circle3.setFill(null);
        circle4.setStroke(Color.GREEN);
        circle4.setFill(null);
        circle5.setStroke(Color.VIOLET);
        circle5.setFill(null);
        
        
        VBox pane = new VBox();
        pane.getChildren().add(circle1);
        pane.getChildren().add(circle2);
        pane.getChildren().add(circle3);
        pane.getChildren().add(circle4);
        pane.getChildren().add(circle5);
        pane.getChildren();
        
        
        
        
        Scene scene = new Scene(pane, 200, 350);
        
        primaryStage.setTitle("ShowCircle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
