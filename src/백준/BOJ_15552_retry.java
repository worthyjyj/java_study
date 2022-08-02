package 백준;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_15552_retry {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()); //엔터로 라인 구분됨

        for (int i = 0; i<T;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " "); //String 클래스의 스플릿메소드를 사용하거나 sting tokenizer를 사용하여 데이터를 공백으로 구분
            bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())+ "\n"); //Buffered 메모리에 데이터 저장
        }
        br.close(); //Buffered 클래스 입력 종료
        bw.flush(); //Buffered 클래스 출력
        bw.close(); //Buffered 클래스 출력 종료
    }
}
