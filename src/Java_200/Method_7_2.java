package Java_200;

import java.util.Scanner;

public class Method_7_2 {
    static int min(int a, int b, int c){
        if (a<b && a<c){ //a를 먼저 점검.
            return a;
        } else if (b<a && b<c) { //a는 중간값이거나 젤 값이 큰 상태 확정. b 점검. b가 중간값이거나 제일 큰 값. 그럼 2가지 경우의 수라도 나머지는 c가 제일 클 수밖에 없음
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("정수 a: " );
        int a = sc.nextInt();
        System.out.print("정수 b: " );
        int b= sc.nextInt();
        System.out.print("정수 c: " );
        int c= sc.nextInt();

        System.out.println("최솟값은" + min(a,b,c)+"입니다.");
    }
}
