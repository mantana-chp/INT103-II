package FinalExam;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Exam5 {
    public static void main(String[] args) {
        try{
            ObjectInputStream input = new ObjectInputStream(Files.newInputStream(Path.of("Exam5.dat")));
            Student S1 =(Student) input.readObject();
            System.out.print(S1.studentID + " ");
            System.out.print(S1.Name + " ");
            System.out.println(S1.score + " ");
            Student S2 =(Student) input.readObject();
            System.out.print(S2.studentID + " ");
            System.out.print(S2.Name + " ");
            System.out.println(S2.score + " ");
            Student S3 =(Student) input.readObject();
            System.out.print(S3.studentID + " ");
            System.out.print(S3.Name + " ");
            System.out.println(S3.score + " ");

            System.out.println("Average Score = " + (S1.score + S2.score + S3.score)/3);
            input.close();

        }
        catch (IOException | ClassNotFoundException e){
            System.out.println(e.toString());
        }
    }
}
