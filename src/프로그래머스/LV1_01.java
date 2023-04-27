package 프로그래머스;

public class LV1_01 {
    public static long solution(int a, int b) {
        long answer = 0;

        if((a-b)>0){
            //a가 더 큰 경우
            for(long i = b ; i <= a ; i++){
                answer += i;
            }
            return answer;
        }else{
            //b가 더 크거나 a,b값이 동일할 경우
            for(long i = a ; i <= b ; i++){
                answer += i;
            }
            return answer;
        }
    }

    public static void main(String[] args) {

        long result = solution(3,3);
        System.out.println(result);
    }
}

