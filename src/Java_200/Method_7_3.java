package Java_200;

import java.util.Scanner;

public class Method_7_3 {
    //3개의 int형 인수 a,b,c에서 중간값을 구하는 med메서드를 작성하라
    static int med (int a, int b, int c){
     if (b>a && b>c){ //b가 제일 클 때
         if (a>c){
             return a;
         } else if (c>a) {
             return c;
         }
     }
     if (a>b && a>c){
         if (b>c){
             return b;
         } else if (b<c) {
             return c;
         }
     }
     if (c>a && c>b){
         if (a>b){
             return a;
         } else if (a<b) {
             return b;
         }
     }
     return 0;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 a:");
        int a = sc.nextInt();
        System.out.print("정수 b:");
        int b = sc.nextInt();
        System.out.print("정수 c:");
        int c = sc.nextInt();
        System.out.println("중간값은 " + med(a,b,c) + "입니다.");
    }

}
