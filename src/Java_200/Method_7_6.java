package Java_200;

import java.util.Scanner;

public class Method_7_6 {
    static String seasonOf(int m) {
        if (m >= 3 && m <= 5) {
            return "봄";
        } else if (m >= 6 && m <= 8) {
            return "여름";
        } else if (m >= 9 && m <= 11) {
            return "가을";
        } else if (m == 12) {
            return "겨울";
        } else if (m>0 && m<3) {
            return "겨울";
        }
        return ""; //주어진 범위내로 m값을 받지 못할경우 공백
    }
        // switch문을 이용하여 더 간단하게 코드를 짤 수 있음.
        // switch(m){
        // case 3: case 4: case 5 return "봄"; .... 이런식으로! 간단히~

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 월입니까(1~12): ");
        int m = sc.nextInt();
        System.out.println("해당 월의 계절은 "+ seasonOf(m) + "입니다.");
    }
}
