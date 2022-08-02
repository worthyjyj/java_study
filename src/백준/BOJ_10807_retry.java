package 백준;

import java.util.Scanner;

public class BOJ_10807_retry {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int cnt =0; //갯수세는 변수

        int n = sc.nextInt();

        int [] a = new int [n];
        for (int i =0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int v = sc.nextInt();

        for (int i=0;i<n;i++){
            if (a[i]==v){
                cnt++; //갯수 변수에 계속 더하기!
            }
        }
        System.out.println(cnt); //출력은 반복문 빠져나와서!
    }
}
