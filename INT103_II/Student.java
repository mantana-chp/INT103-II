package FinalExam;

import java.io.Serializable;

public class Student implements Serializable {
    String studentID;
    String Name;
    double score;

    public Student(String studentID, String Name, double score) {
        this.studentID = studentID;
        this.Name = Name;
        this.score = score;
    }
}
