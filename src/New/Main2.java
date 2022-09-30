package New;

import java.util.Random;

    public class Main2 {
        public static void main(String[] args) {

            Random rnd = new Random();
            int[] aaa = { 1, 2, 3, 4, 5 };
            int input = rnd.nextInt(20) + 1;

            for (int i = 0; i < aaa.length; i++) {
                System.out.println();
                System.out.print(aaa[i] + ":");
                for (int j = 0; j < input; j++) {
                    System.out.print("*");

                }
                System.out.println(" " + input);
                input = rnd.nextInt(20) + 1;
            }

        }
    }

