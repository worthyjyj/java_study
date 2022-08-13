package Java_200;

import java.util.Scanner;

public class Method_7_9_retry2 {
    static int readPlusInt(int x){
        int reverse = 0;
        while (x>0){
            int i = x%10; //입력값 맨 뒷자리 추출
            reverse = reverse*10+i; //위에서 추출한 숫자 순서대로 배치하는 역할(x10단위로 숫자자릿수가 커지기 때문)
            x= x/10; //입력값 맨 뒷자리 없애기
        }
        return reverse;
    }

    public static void main(String[] args) {
        //do-while구문 활용. while(조건)을 만족할 경우 do 실행문 반복. 조건에 만족하지 않아도 무조건 1번은 실행
        Scanner sc = new Scanner(System.in);
        int x; //입력값을 범위설정 해주기 위해 미리 변수 선언
        do { //마지막 입력값이 1일 경우 반복 실행하도록 크게 묶기
            do { //범위에 맞는 값을 입력할 때 까지 반복하기 위해 do-while문 사용, 그리고 do문은 무조건 한번은 출력하기 때문에 x값을 미리 줄 필요 없음.
                System.out.print("양의 정숫값: ");
                x = sc.nextInt();
            }while(x<=0); //입력값이 0포함 음수일 경우 반복

                System.out.println("반대로 읽으면 " + readPlusInt(x) + "입니다."); //입력값이 양수인 경우 위에 반복문 빠져나와서 이 부분 실행, 이후 나와서 밑 실행문으로 이동

            do {
                System.out.print("다시 한 번?<Yes...1/No...0> : ");
                x = sc.nextInt();
            }while (x!=0 && x!=1); //입력값이 한번 입력할 때 0도 아니고(and &&) 1도 아닌경우 계속 반복함.

            if (x==0){ //x값이 0인경우 반복문 빠져나감. 큰 do문 빠져나가는 것이므로 실행 종료됨. // 사실 이 실행문은 없어도 됨. 어짜피 0이면 반복문 나가면서 종료되기 때문.
                break;
            }
        }while (x==1); //마지막 x값이 1인경우 밖에 없으므로 큰 do문 다시 돌아가서 반복.
    }
}
