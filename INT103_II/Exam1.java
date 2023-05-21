package FinalExam;

import java.util.Random;

public class Exam1 {
    public static void main(String[] args) {
        try {
            Random rand = new Random();
            int[] arr;
            arr = new int[5];
            arr[5] = 20 / rand.nextInt(2);
        }
        catch (RuntimeException e){
            System.out.println(e.toString());
        }
    }
}
