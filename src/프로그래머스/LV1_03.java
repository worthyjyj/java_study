package 프로그래머스;

import java.util.ArrayList;
import java.util.List;

public class LV1_03 {

    public static int solution(int[] numbers) {
        int answer = 0;

        //정렬 후 비교할 것
//        int max = numbers[0];

        List<Integer> numList = new ArrayList<Integer>();

        for(int i=0 ; i< numbers.length; i++){
            numList.add(numbers[i]);
        }

        for(int i=0; i < numList.size() ; i++){
            for(int j=0 ; j < numList.size() ; j++){
                if(numList.get(i) < numList.get(j)){
                    int temp = numList.get(i);
                    numList.set(i,numList.get(j));
                    numList.set(j,temp);
                }
            }
        }

        // 만약 갯수가 9개가 안된다면 나머지 인덱스는 0으로 채우겠다!!
        if(numList.size() <= 10){
            for (int i = numList.size(); i < 10 ; i++){
                numList.add(0);
            }
        }

        System.out.println("숫자 오름차순으로 정렬되니? "  + numList.toString());

//        int[] num = {0,1,2,3,4,5,6,7,8,9};

        for(int i=0 ; i < numList.size() ; i++){
            for(int j=0 ; j < numList.size() ; j++){
                if(numList.get(i) != j){
                    System.out.println(i);
                    answer += i;
                }
                answer = 45 - answer;
            }
        }


        return answer;

    //아아아아악
        // numbers_len은 배열 numbers의 길이입니다.
        /*int solution(int numbers[], size_t numbers_len) {
            int answer = 0;
            int temp[10] = { 0, };

            for(int i = 0; i < numbers_len; i++){
                switch (numbers[i]){
                    case 0: temp[0]++; break;
                    case 1: temp[1]++; break;
                    case 2: temp[2]++; break;
                    case 3: temp[3]++; break;
                    case 4: temp[4]++; break;
                    case 5: temp[5]++; break;
                    case 6: temp[6]++; break;
                    case 7: temp[7]++; break;
                    case 8: temp[8]++; break;
                    case 9: temp[9]++; break;
                }
            }

            for(int i = 0; i < 10; i++){
                if(temp[i] == 0){
                    answer += i;
                }
            }

            return answer;
        }*/
    }

    public static void main(String[] args) {
       int result = solution(new int[]{5, 8, 4, 0, 6, 7, 9});
        System.out.println(result);
    }
}
