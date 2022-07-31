package 백준;


import java.io.*;

public class BOJ_15552 {
    public static void main(String[] args) throws IOException { //예외는 필수로 생성해야함
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //입력 생성자
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //출력 생성자
        int T = Integer.parseInt(bf.readLine()); //  출력 케이스 범위 지정, int로 형변환

        for (int i =1; i<=T; i++){
            String s = bf.readLine(); // 문자열의 형태로 입력되는 케이스들을 String 변수에 담음
            int a = Integer.parseInt(s.split(" ")[0]); // 문자열의 케이스들을 일일이 split하여 나눠줌. 그 기준은 공백
            int b = Integer.parseInt(s.split(" ")[1]);
            bw.write(a+b+"\n"); // 출력값을 줄바꿈과 함께 버퍼 메모리에 저장
        }
        bw.flush(); // 콘솔에 출력
    }
}
