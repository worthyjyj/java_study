package New;

import java.util.*;

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
                if (i != j) {
                    if (lotto[i] == lotto[j]) {
                        lotto[i] = rnd.nextInt(45) + 1;
                    }
                }
            }
        }
        Arrays.sort(lotto);
        System.out.println(Arrays.toString(lotto));


      /*  Set set = new HashSet();
        Random rd = new Random();

        do {
            set.add(rd.nextInt(45)); //set을 통해 랜덤값을 추출할 때 중복값 없이 나오도록,,
        }
        while(set.size()!=6);

        Iterator iterator = set.iterator();

        while (iterator.hasNext()) { //iterator는 값을 하나씩 출력하는 역할
            System.out.println(iterator.next());
        }*/
    }
}
