package ch.hfict.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import ch.hfict.math.Statistics;
//todo imports für action handler
import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class View extends Application{
  Statistics stat = new Statistics();
  
  public View() {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    stat.read(r);
  }
  
  public void start(Stage stage) throws Exception {

    
    Button calcbtn = new Button("Calculate");
    calcbtn.setOnAction(new EventHandler<ActionEvent>() {
      // todo: implementatiion for eventhandler ctrl+shift+o
    });
    TextField textfld = new TextField();
    textfld.setPrefColumnCount(8);
    textfld.setText(new Double(stat.getAverage()).toString());
    
    StackPane root = new StackPane();
    root.getChildren().add(textfld);
    
    stage.setScene(new Scene(root, 300, 150));
    stage.show();
    
  }
  
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    new View();
    launch(args);
  }

}
