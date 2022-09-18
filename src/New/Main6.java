package New;

import java.util.Random;

public class Main6 {
    public static void main(String[] args) {


        Random rd = new Random();

        for (int i = 0; i <1000 ; i++){
            int a = rd.nextInt(6); //0~5
            System.out.println(a);
        }
    }
}
