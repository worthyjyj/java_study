package New;

import java.util.Arrays;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        //숫자 3개를 입력받아 내림차순으로 정렬하시오

        Scanner sc = new Scanner(System.in);

        int[] a = new int [3];

        System.out.print("숫자 3개 입력 >> ");
        for (int i = 0 ; i < a.length ; i++){
            a[i] = sc.nextInt();
        }

       // a[0] a[1] a[2] 원래 이렇게 출력!! 근데 내림차순으로 정렬하고 싶어 그러면
        if (a[0] < a[1]){
            int temp = a[0];
            a[0] = a[1];
            a[1] = temp;
        }if (a[0] < a[2]) {
            int temp = a[0];
            a[0] = a[2];
            a[2] = temp;
        }if (a[1] < a[2]) {
            int temp = a[1];
            a[1] = a[2];
            a[2] = temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
