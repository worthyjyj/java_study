package Java_200;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int b = a>10 ? 100 : 0; //삼항연산자는 할당식이므로 변수에 담을 때 쓸 수 있음. 실행식이면 쓸 수 없음.
        System.out.println(b);
    }
}
