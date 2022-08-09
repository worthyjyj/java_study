package Java_200;

import java.util.Scanner;

public class Method_7_1 {
    //입력한 int형 정숫값이 음수이면 -1을, 0이면 0을, 양수이면 1을 반환하는 signof 메서드를 작성하자
    static int signOf(int n) { //3개의 가능한 리턴값이 모두 정수이기 때문에 메소드 하나에 리턴값을 모두 출력가능하도록
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) { //입력값 n을 주는 역할
        System.out.print("정수 x: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("signOf(x)는 " + signOf(i)  + " 입니다");
    }
}
