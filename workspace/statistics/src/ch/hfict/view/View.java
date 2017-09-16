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
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class View extends Application{
  
  private Statistics stat = new Statistics();
  
  public View() {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Pleas enter one or more digits: ");
    stat.read(r);
  }
  
  public void start(Stage stage) throws Exception {

    TextField textfld = new TextField("Enter more digits");
    textfld.setPrefColumnCount(8);
    TextField resultfld = new TextField();
    resultfld.setPrefColumnCount(8);

    Button calcbtn = new Button("Calculate");
    calcbtn.setOnAction(new EventHandler<ActionEvent>() {
        @Override
		public void handle(ActionEvent e) {
		  //System.out.println("TEST TEXTBLT");
		  stat.addNumber(textfld.getText());
		  resultfld.clear();
		  resultfld.setText(String.valueOf(stat.getAverage()));
		}
    });
    Button clearbtn = new Button("Clear");
    clearbtn.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
          resultfld.clear();
          textfld.clear();
        }
    });

    // create hbox + vbox  and add nodes to it alike QT-Stack
    HBox hb1 = new HBox();
    HBox hb2 = new HBox();
    VBox vb1 = new VBox();
    
    hb1.getChildren().add(textfld);
    hb1.getChildren().add(calcbtn);
    hb2.getChildren().add(resultfld);
    hb2.getChildren().add(clearbtn);
    vb1.getChildren().add(hb1);
    vb1.getChildren().add(hb2);
    
    /* (FLOWPANE)
    // create pane (layout) and set properties
    FlowPane flowRoot = new FlowPane();
    flowRoot.setPadding(new Insets(2));
    
    //add nodes (->Widgets) to pane (->layout)
    flowRoot.getChildren().add(textfld);
    flowRoot.getChildren().add(calcbtn);
    flowRoot.getChildren().add(resultfld);
    flowRoot.getChildren().add(clearbtn);
    */
    
    //set pane on the scene (->layout on the widget (or mainwindow))
    stage.setScene(new Scene(vb1, 300, 150));
    stage.setTitle("HFICT STATISTICS");
    stage.show();
    
  }
  
  public static void main(String[] args) {
    //new View();
    launch(args);
  }

}
