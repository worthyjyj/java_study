package New;

import java.util.Random;

public class Homework05_04 {
    public static void main(String[] args) {
        Random rd = new Random();

        int[] dice = new int[6]; //0~5

        for (int i = 0; i < 10000; i++) {
            dice[rd.nextInt(6)] ++;
        }

        for (int i = 0; i < 6 ; i++) {
            System.out.println(i+1+ "=" + dice[i]);
        }
    }
}
