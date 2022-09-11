package New;

import java.util.Arrays;
import java.util.Random;

public class Homework05_02 {
    public static void main(String[] args) {
        // 로또번호를 생성하는 프로그램을 작성하시오.
//		(로또 번호는 1 ~ 45번까지 있으며 이 중에서 중복되지 않는 6개의 숫자를 추출하여 결과를 출력한다.)

        Random rnd = new Random();
        int[] lotto = new int[6];

        for (int i = 0; i < 6; i++) {
            lotto[i] = rnd.nextInt(45) + 1; // 로또 6개 추출
        }



        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if(i != j) {
                    if (lotto[i] == lotto[j]) {
                        lotto[i] = rnd.nextInt(45) + 1;
                    }
                }
            }
        }

        Arrays.sort(lotto);
        System.out.println(Arrays.toString(lotto));
    }
}
