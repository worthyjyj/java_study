package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int v = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i=1; i<=n;i++){
            int value = Integer.parseInt(st.nextToken());
            if (value==v){
                sb.append(value);
            }
        }
        br.close();
        System.out.println(sb.length());
    }
}

//이거 왜 백준에 제출하면 오류 뜨는 거임???? 작동은 잘 됌.