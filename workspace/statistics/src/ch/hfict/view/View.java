package ch.hfict.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import ch.hfict.math.Statistics;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class View extends Application{
  
  private Statistics stat = new Statistics();
  
  public View() {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    stat.read(r);
    System.out.println("Con finished boot up gui");
  }
  
  public void start(Stage stage) throws Exception {

    TextField textfld = new TextField("enter values");
    textfld.setPrefColumnCount(8);
    TextField resultfld = new TextField();
    resultfld.setPrefColumnCount(8);

    Button calcbtn = new Button("Calculate");
    calcbtn.setOnAction(new EventHandler<ActionEvent>() {
        @Override
		public void handle(ActionEvent e) {
		  //if (e.isConsumed()) {
		    System.out.println("TEST TEXTBLT");
		    stat.addNumber(textfld.getText());
		    resultfld.clear();
		    resultfld.setText(String.valueOf(stat.getAverage()));

		    //textfld.clear();
		    //e.consume();
		  //}
		}
    });
    Button clearbtn = new Button("Clear");
    calcbtn.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
          if (e.isConsumed()) {
            resultfld.clear();
            textfld.clear();
            e.consume();
          }
        }
    });
    
    // create pane (layout) and set properties
    FlowPane flowRoot = new FlowPane();
    flowRoot.setPadding(new Insets(2));
    
    //add nodes (->Widgets) to pane (->layout)
    flowRoot.getChildren().add(textfld);
    flowRoot.getChildren().add(calcbtn);
    flowRoot.getChildren().add(resultfld);
    flowRoot.getChildren().add(clearbtn);
    
    //set pane on the scene (->layout on the widget (or mainwindow))
    stage.setScene(new Scene(flowRoot, 300, 150));
    stage.setTitle("HFICT STATISTICS");
    stage.show();
    
  }
  
  public static void main(String[] args) {
    //new View();
    launch(args);
  }

}
