package Java_200;

import java.util.Scanner;

public class Method_7_9 {
    static int readPlustInt(int x) {
        int reverse = 0;
        while (x != 0) {
            int remainder = x % 10;
            reverse = reverse * 10 + remainder;
            x = x / 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i > 0; i++) { //x의 값을 입력하는것은 무한 반복하되, 특정 조건에 걸리면 출력. 그외에는 무한반복하도록.
            System.out.print("양의 정숫값: ");
            int x = sc.nextInt();
            if (x != 0 && x > 0) {
                System.out.println("반대로 읽으면 " + readPlustInt(x) + "입니다.");
                System.out.print("다시한번?<Yes...1/No...0> : "); //여기서 반복문을 다시 위로 돌릴 수 없다는것이 한계임...
                int y = sc.nextInt();
                if (y == 0) {
                    break;
                }
            }
        }
    }
}
