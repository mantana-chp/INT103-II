package FinalExam;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class Exam6 extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Label LS = new Label("Student ID: ");
        TextField TS = new TextField();
        Label LN = new Label("Name: ");
        TextField TN = new TextField();
        Label LA = new Label("Age: ");
        TextField TA = new TextField();
        Label LH = new Label("Height: ");
        TextField TH = new TextField();
        Button BS = new Button("Save");

        BS.setOnAction(actionEvent -> {
                    try {
                        PrintWriter pw = new PrintWriter(new FileOutputStream("Exam6.txt"));
                        pw.println(TS.getText());
                        pw.println(TN.getText());
                        pw.println(TA.getText());
                        pw.println(TH.getText());
                        pw.close();
                    }
                    catch (Exception e) {
                        System.out.println("Exception: " + e);
                    }
                }
        );
        stage.setTitle("Student Information");
        GridPane.setHalignment(BS, HPos.RIGHT);
        GridPane GP = new GridPane();
        GP.setAlignment(Pos.CENTER);
        GP.setHgap(10);
        GP.setVgap(10);
        GP.add(LS, 0, 0);
        GP.add(TS, 1, 0);
        GP.add(LN, 0, 1);
        GP.add(TN, 1, 1);
        GP.add(LA, 0, 2);
        GP.add(TA, 1, 2);
        GP.add(LH, 0, 3);
        GP.add(TH, 1, 3);
        GP.add(BS, 1, 4);

        Scene S = new Scene(GP);
        stage.setWidth(400);
        stage.setHeight(300);
        stage.setScene(S);
        stage.show();
    }

}
