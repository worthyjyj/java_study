package 백준;

import java.util.Scanner;

public class BOJ_10871_retry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();
        int A [] = new int[N];

        for (int i=0;i<N;i++){
            A[i]=sc.nextInt(); //입력값을 배열 요소로 주는 방법(인덱스)
        }
        sc.close();

        for (int i=0; i<N;i++)
            if (A[i]<X){
                System.out.print(A[i]+" ");
            }
    }
}

