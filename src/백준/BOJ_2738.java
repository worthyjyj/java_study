package 백준;

import java.util.Scanner;

public class BOJ_2738 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //행
        int M = sc.nextInt(); //열
        int count=0; // 열 별로 줄바꿈 될 때 값이 초기화 되는 걸 막기 위함

        int[] A = new int[N * M];
        int[] B = new int[N * M];

        for (int i = 1; i <= M*N; i++) {
                A[i - 1] = sc.nextInt(); //A배열에 입력값을 담았다.
            }
        for (int i = 1; i <= M*N; i++) {
            B[i - 1] = sc.nextInt(); //B배열에 입력값을 담았다.
        }
        for (int k=1;k<=M;k++) { // 열 개수만큼 반복
            for (int i = 0; i <N; i++) { //행 개수 만큼 반복
                int R = A[count] + B[count];
                count++; //반복할 때 값이 초기화 되지 않고 계속 1씩 늘어나도록
                System.out.print(R+" ");
            }
            System.out.println(); // 1행이 끝날 때 마다 반복문 탈출하여 줄바꿈
            sc.close();
        }
    }
}
