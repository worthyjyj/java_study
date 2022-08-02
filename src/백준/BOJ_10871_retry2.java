package 백준;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_10871_retry2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," "); //첫번째 입력: N값과 X값을 할당해주기위해 String builder가 아닌 토크나이저 사용

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine()," "); //두번째 입력: 반복문을 사용하여 N번째 까지 입력한 값 중 조건에 만족하는 값만을 출력하겠다
        for (int i=1; i<=n;i++){
            int value = Integer.parseInt(st.nextToken()); // 입력한 값을 정수로 변환
            if (value<x){
                sb.append(value+" ");
            }
        }
        System.out.print(sb); //반복문을 빠져나와서 sb출력
    }
}

