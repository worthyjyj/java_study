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
    }

    public static void main(String[] args) {
       int result = solution(new int[]{5, 8, 4, 0, 6, 7, 9});
        System.out.println(result);
    }
}
