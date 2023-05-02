package 프로그래머스;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class LV1_05 {

    public static int[] solution(int[] numbers) {
//        ArrayList list = new ArrayList();


        // TreeSet을 사용하여 중복제거 및 오름차순이 자동정렬되도록 함
        Set<Integer> list2 = new TreeSet();

        for (int i=0; i<numbers.length; i++){
            for(int j=i+1 ; j<numbers.length ; j++){
                list2.add(numbers[i]+numbers[j]);
            }
        }

        System.out.println(list2.toString());

        //배열 생성
        int[] answer = new int[list2.size()];

        Iterator<Integer> iterSet = list2.iterator();
        int count = 0;
        while(iterSet.hasNext()) {
            answer[count] = iterSet.next();
            count++;
        }

        return answer;

        //오늘은 첫출근을 했다.
    }

    public static void main(String[] args) {
        int[] result = solution(new int[]{2,1,3,4,1});
        System.out.println(Arrays.toString(result));
    }



}
