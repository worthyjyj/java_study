package Java_200;

import java.util.Scanner;

public class Method_7_16_retry {
    static int minOf(int[] a){
        int min = a[0]; // 초기값 설정

        for (int i=0; i<a.length ; i++){
            if (min>a[i]){
                min=a[i]; //배열 돌리면서 초기값보다 작은게 나타나면 그 값을 초기값으로 만듬.
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("사람 수는 : ");
        int x = sc.nextInt();
        int [] a = new int[x]; //신장 데이터 배열
        int [] b = new int[x]; //체중 데이터 배열
        System.out.println(x+"명의 신장과 체중을 입력하자.");

        for (int i=0; i<x; i++){
            System.out.print(i+1+"번의 신장: ");
            a[i] = sc.nextInt();
            System.out.print(i+1+"번의 체중: ");
            b[i] = sc.nextInt();
        }
        System.out.println("가장 키가 작은 사람의 신장 : "+minOf(a)+"cm");
        System.out.println("가장 마른 사람의 체중 : "+minOf(b)+"kg");
    }
}
