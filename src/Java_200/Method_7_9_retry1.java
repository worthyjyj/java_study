package Java_200;

import java.util.Scanner;

public class Method_7_9_retry1 {
    static Scanner stdIn = new Scanner(System.in);

    static int readPlusInt() {
        int x;
        do {
            System.out.print("양의 정수값: ");
            x=stdIn.nextInt();
        }while (x <= 0);
        return x; //반복문돌리다가 정상적인 양수값받으면 그 값 반환
    }

    public static void main(String[] args) {
        int x;
        do{
            int n = readPlusInt(); //일단 메소드 실행. 사용자 입력값받을 수 있음.

            System.out.print("반대로 읽으면"); //리턴 x값 받을 경우 실행
            while (n>0){ //여기서 while문은 숫자를 거꾸로 읽을 수 있는 로직을 위함.
                System.out.print(n%10);
                n /=10;
            }
            System.out.println("입니다");

            do {
                System.out.print("다시 한 번?<Yes...1/No...0>:"); //반대로 읽은 숫자 출력 후 다시한번?
                x=stdIn.nextInt(); //사용자가 입력
            }while (x!=0 && x!=1); // 사용자가 0 그리고 1을 입력하지 않을 경우 반복
        }while(x==1); //사용자가 1을 입력할 경우 해당 do-while문 반복
    }
}
