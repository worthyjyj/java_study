package New;

import java.util.Random;

public class Homework05_04 {
    public static void main(String[] args) {
        Random rd = new Random();

        int[] dice = new int[6];
        for (int i = 0; i < 10000; i++) {
            dice[rd.nextInt(6)] ++; //0~5
        }

        int n = 1;
        for (int i:dice) {
            System.out.println(n++ + "번 : " + i);
        }
    }
}
