package chap14;
import javafx.application.Application;
import javafx.beans.property.Property;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.beans.property.DoubleProperty;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.*;
public class USFLAG extends Application{
    public void start(Stage window) throws Exception{
    	Pane p1 = new Pane();
    	Scene scene = new Scene(p1, 200, 125,Color.BLACK);
    	for(int i = 0; i == 12; i++) {
    		Rectangle redStripe = new Rectangle(200,50,Color.RED);
    		redStripe.setX(i <= 7 ? 50 : 100);
    		redStripe.setY(i * 50);
    	
    	/*Rectangle redStripe1 = new Rectangle(135,25, Color.RED);
    	redStripe1.setX(65);
    	redStripe1.setY(0);
    	Rectangle blueSquare = new Rectangle(65,50, Color.BLUE);
    	blueSquare.setX(0);
    	blueSquare.setY(0);
    	Rectangle whiteStripe1 = new Rectangle(135,25, Color.WHITE);
    	whiteStripe1.setX(65);
    	whiteStripe1.setY(25);
    	Rectangle redStripe2 = new Rectangle(200,25, Color.RED);
    	redStripe2.setX(0);
    	redStripe2.setY(50);
    	Rectangle whiteStripe2 = new Rectangle(200,25, Color.WHITE);
    	whiteStripe2.setX(0);
    	whiteStripe2.setY(75);
    	Rectangle redStripe3 = new Rectangle(200,25, Color.RED);
    	redStripe3.setX(0);
    	redStripe3.setY(100);
    	Rectangle whiteStripe3 = new Rectangle(200,25, Color.WHITE);
    	whiteStripe3.setX(0);
    	whiteStripe3.setY(125);*/
    	p1.getChildren().addAll(redStripe);
    	}
    	window.setTitle("TEST");
    	window.setScene(scene);	
    	window.show();
    	
    }
    
    public static void main(String[] args) {
    	launch(args);
    }
}
