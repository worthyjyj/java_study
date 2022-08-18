package Java_200;

import java.util.Random;
import java.util.Scanner;

public class Method_7_10_retry1 {
    static void form (){ //식 출력이랑 그에 대한 정답 변수 생성
        Random rd1 = new Random();
        Scanner sc = new Scanner(System.in);
        int x = rd1.nextInt(900)+100;
        int y = rd1.nextInt(900)+100;
        int z = rd1.nextInt(900)+100;
        int pattern = rd1.nextInt(4)+1;
        int answer = 0;
        int input;

        //정답찾기용 //answer 변수 생김
        do {
            switch (pattern) {
                case 1:
                    answer = x + y + z;
                    break;
                case 2:
                    answer = x - y + z;
                    break;
                case 3:
                    answer = x + y - z;
                    break;
                case 4:
                    answer = x - y - z;
                    break;
            }

            //생성한 랜덤값으로 4개 패턴 중 하나 출력 //3항연산자로도 만들 수 있음(false값에 조건 넣어서 계속 이어지게)
            if (pattern == 1) {
                System.out.print(x + "+" + y + "+" + z + "=");
                input = sc.nextInt();
            } else if (pattern == 2) {
                System.out.print(x + "-" + y + "+" + z + "=");
                input = sc.nextInt();
            } else if (pattern == 3) {
                System.out.print(x + "+" + y + "-" + z + "=");
                input = sc.nextInt();
            } else { //패턴값이 4일 때!
                System.out.print(x + "-" + y + "-" + z + "=");
                input = sc.nextInt();
            }
            if (answer!=input){
                System.out.println("틀렸습니다.");
            }
        }while(answer!=input);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;

        System.out.println("암산왕 도전하시죠!!");
        do {
            form();
            System.out.print("정답입니당~! 다음 문제로 고? <Yes...1/No...0> : ");
            input= sc.nextInt();
        }while(input==1);
    }
}
