  
import java.util.Collections;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.shape.Rectangle;

public class ShowRectangle extends Application {
  @Override
  public void start(Stage primaryStage) {    
    Pane pane = new Pane();
    for (int i = 0; i < 4; i++) {
      Circle r = new  Circle(150,150,150);
      r.setRotate(i/ 45);
      r.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
      r.setFill(Color.WHITE);
      //r.setHeight(10);
      //r.setWidth(20);
      pane.getChildren().add(r);
    }
    Button b = new Button ("sing");
    pane.getChildren().add(b);
       b.setOnAction(new EventHandler<ActionEvent>(){
             @Override
       public void handle (ActionEvent t ) {
        primaryStage.close();
       }
            }
            );
    Scene scene = new Scene(pane, 250, 150);
    primaryStage.setTitle("ShowRectangle"); 
    primaryStage.setScene(scene); 
    primaryStage.show(); 
  }
 
  public static void main(String[] args) {
    launch(args);
  }
}