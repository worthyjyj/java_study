package New;

import java.util.Random;
import java.util.Scanner;

public class Homework05_03 {
    public static void main(String[] args) {
        //인공지능 컴퓨터와 게이머(사람)가 가위바위보 게임을 할 수 있도록 프로그램을 작성하시오.

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        String[] a = {"가위", "바위", "보"};

        System.out.print("가위 바위 보를 입력하세요: ");
        String gamer = sc.nextLine();
        System.out.print("게이머: ");
        System.out.println(gamer);
        System.out.print("인공지능 컴퓨터: ");
        String ai = a[rnd.nextInt(2)];
        System.out.print(ai);
        System.out.println();

        switch (gamer) {
            case "가위" :
                if (ai.equals("가위")){
                    System.out.println("결과: 비김");
                } else if (ai.equals("바위")) {
                    System.out.println("결과: 인공지능 컴퓨터 승리!");
                }else {
                    System.out.println("결과: 게이머 승리!");
                }
                break;

            case "바위" :
                if (ai.equals("가위")){
                    System.out.println("결과: 게이머 승리!");
                } else if (ai.equals("바위")) {
                    System.out.println("결과: 비김");
                }else {
                    System.out.println("결과: 인공지능 컴퓨터 승리!");
                }
                break;

            case "보" :
                if (ai.equals("가위")){
                    System.out.println("결과: 인공지능 컴퓨터 승리!");
                } else if (ai.equals("바위")) {
                    System.out.println("결과: 게이머 승리!");
                }else {
                    System.out.println("결과: 비김");
                }
                break;
        }

    }
}
