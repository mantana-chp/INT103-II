package FinalExam;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exam2 {
    public static void main(String[] args) {
        try{
            DataOutputStream output = new DataOutputStream(new FileOutputStream("Exam2.dat"));
            output.writeUTF("64130500999");
            output.writeUTF("SuSu KubNong");
            output.writeChar('M');
            output.writeInt(19);
            output.writeFloat(167.0f);
            output.close();
        }
        catch (IOException e ){
            System.out.println(e.toString());
        }
    }
}
