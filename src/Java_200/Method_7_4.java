package Java_200;

import java.util.Scanner;

public class Method_7_4 {
    //1부터 n까지의 정수의 합을 구하는 메서드를 작성해보자.
    //int sumUp(int n)

    static int sumUp(int x){
        int sum = 0;
        for (int i =1; i<=x; i++){
            sum = sum+i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1부터 x까지의 합을 구하자.");
        System.out.print("x의 값:");
        int x= sc.nextInt();
        System.out.println("1부터 "+ x +"까지의 합은 "+ sumUp(x) +"입니다.");
    }
}
