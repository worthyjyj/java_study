package 프로그래머스;

public class LV1_02 {
//숫자 문자열과 영단어
    public static int solution(String s) {
        int answer = 0;

        //replace함수 사용
//        String str = s.replace("zero","0");
//        str = str.replace("one", "1");
//        str = str.replace("two", "2");
//        str = str.replace("three", "3");
//        str = str.replace("four", "4");
//        str = str.replace("five", "5");
//        str = str.replace("six", "6");
//        str = str.replace("seven", "7");
//        str = str.replace("eight", "8");
//        str = str.replace("nine", "9");

        String str = s;

        //문자열 배열과 반복문, replace함수를 사용하여 코드 간소화
        String[] alphabet = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        for (int i=0; i < alphabet.length ; i++){
            str = str.replace(alphabet[i], String.valueOf(i));
        }

        answer = Integer.parseInt(str);


        return answer;
    }

    public static void main(String[] args) {
    int result = solution("23zerosix5six7");
        System.out.println(result);
    }
}
