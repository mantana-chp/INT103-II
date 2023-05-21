package FinalExam;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Exam3 {
    public static void main(String[] args) {
        try{
            DataInputStream input = new DataInputStream(new FileInputStream("Exam2.dat"));
            System.out.println(input.readUTF());
            System.out.println(input.readUTF());
            System.out.println(input.readChar());
            System.out.println(input.readInt());
            System.out.println(input.readFloat());
            input.close();
        }
        catch (IOException e){
            System.out.println(e.toString());
        }
    }
}
