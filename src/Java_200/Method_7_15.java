package Java_200;

import java.util.Scanner;

public class Method_7_15 {
    // 배열 a가 가진 모든 요소의 합을 구하는 sumOf()메소드를 작성하자.
    static int sumOf(int[] a){
        int result=0;

        for (int i=0; i< a.length;i++){
            result=result+a[i]; //합계변수
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소 수: ");
        int x = sc.nextInt();
        int [] b = new int[x];

        for (int i=0; i<x; i++){
            System.out.print("x["+i+"] : ");
            b[i]= sc.nextInt();
        }
        System.out.println("모든 요소의 합은 "+ sumOf(b) +"입니다.");
    }
}
