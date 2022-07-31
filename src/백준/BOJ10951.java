package 백준;

import java.util.Scanner;

public class BOJ10951 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()){ // 정확히 언제 멈춰야할지 명시되어 있지 않기 때문에 T/F로만 반환할 수 있는 while문 사용
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A+B);
        }
        sc.close(); // while문 조건으로 정수값이외 값이면(즉, False라면) sc.close() 메소드로 입력 종료 반환함
    }
}
