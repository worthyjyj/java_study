package 백준;

import java.util.Scanner;

public class BOJ_10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();
        int A [] = new int[N];
        for (int k=1;k<=N;k++){
            A[k-1]=k;
            continue;
        }
        //A의 배열의 요소를 범위를 정할 수 있다면
        for (int i=0;i<N;i++) {
            System.out.print(A[i]+" ");
        }
        System.out.println("\n");

        for (int i=0; i<X;i++)
            if (i<X){
                System.out.print(A[i]+" ");
            }
        }
    }

