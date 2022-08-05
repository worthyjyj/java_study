package 백준;

import java.util.Scanner;

public class BOJ_5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = new int[31]; // []여기에 직접 입력값을 담을 건데, 여기서 31은 length를 나타내므로 a[30] 인덱스까지 나타내기 위해 31을 적어주었음.

        for (int i=1;i<=28;i++){ // 30개중에 28개 입력값을 받기 위한 반복
            a[sc.nextInt()]=1;  // 입력값 준 인덱스만 값을 1로 주고 나머지(입력없는값)는 0으로 자동 인덱스값 설정됨
        }
        for (int i=1;i<=30;i++){
            if (a[i]!=1){ // 인덱스 값 '0'인 입력 하지 않은 겂들을 잡기위한 조건
                System.out.println(i);
            }
        }
        sc.close();
        }
    }






    //와씨 나는 입력값을 인덱스 값으로 줬기 때문에 인덱스를 하나 하나 비교(배열끼리 비교)하는게 불가능했었는데
// 이 사람은 지금 빠진 입력값을 구하는거에 초점을 맞췄고 인덱스값이 아니라 인덱스[] 에 입력값을 주었다.
