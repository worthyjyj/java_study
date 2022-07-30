package 백준;

import java.util.Scanner;

public class BOJ2438_별찍기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i= 1; i<=N;i++) { //첫번째 값이 참일 경우, 그 값으로 아래 반복문 실행
            for (int j = 1; j <= i; j++) { // 첫번째 값을 기준으로 False 나오기 전까지 반복문 실행
                System.out.print("*");
            }
            System.out.println();// 두번째 반복문 false인 경우 탈출해서 줄바꿈 시행. 다시 첫번째 반복문의 두번째 값 적용
        }
    }
}
