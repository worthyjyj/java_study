package 백준;

import java.util.Scanner;

public class Metropolis {
    //인구가 800만명이상인 (and) 수도이거나 (or) 부자가 100만명 이상이면 메트로폴리스로 분류해주는 코드를 짰다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean result;

        System.out.print("수도입니까?(수도: 1 수도아님: 0)");
        int a = sc.nextInt();
        System.out.print("인구(단위:만) ");
        int b = sc.nextInt();
        System.out.print("부자의 수(단위:만) ");
        int c = sc.nextInt();
        System.out.print("메트로폴리스 여부: ");

        result = (a == 1 && b>=800) ? true : (c>=100) ? true : false;

        System.out.println(result);
    }
}
