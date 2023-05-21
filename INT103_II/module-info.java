module exam.finalexam {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires jdk.internal.vm.compiler;


    opens FinalExam to javafx.fxml;
    exports FinalExam;
}