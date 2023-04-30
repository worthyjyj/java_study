package 프로그래머스;

public class LV1_04 {
    public static String solution(String s) {
        String answer = "";

        int a = s.length()/2;

        if(s.length() % 2 == 0){
            answer = s.substring(a-1,a+1);
        }else{
            answer = s.substring(a,a+1);
        }
        return answer;
    }

    public static void main(String[] args) {

        System.out.println(solution("abcdeg"));

    }

}
