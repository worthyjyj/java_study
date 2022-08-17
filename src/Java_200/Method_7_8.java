package Java_200;

import java.util.Random;
import java.util.Scanner;

public class Method_7_8 {
    static int random(int a, int b) {
        Random rd = new Random();
        if (b <= a) {
            return a;
        } else {
            int x = rd.nextInt(b) + a; //난수 범위 지정 : random.nextInt(max - min + 1) + min / rd.nextInt(최대값-최솟값+1)+최솟값
                                       // rd.nextint(v)하면 0 ~ v-1 까지의 수가 범위로 지정됨.
            return x;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("난수를 생성합니다");
        System.out.print("하한값: ");
        int a = sc.nextInt();
        System.out.print("상한값: ");
        int b = sc.nextInt();
        System.out.println("생성한 난수는 "+random(a,b)+"입니다.");
    }
}
