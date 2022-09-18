package New;

import java.util.*;

public class Array {
    //숫자 3개를 입력 받아 내림차순으로 정렬하기!!

    public static void main(String[] args) {
        int[] a = {7,4,9,0,33,77};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        List list = new ArrayList<>();

        list.add(7);
        list.add(4);
        list.add(9);
        list.add(0);
        list.add(33);
        list.add(77);

        list.get(0);

        list.remove(list.get(0));

        Collections.sort(list);

        for (Object i : list) {
            System.out.println(i);
        }
    }
}
