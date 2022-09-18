package New;

import java.util.Arrays;

public class 재시험 {
    public static void main(String[] args) {
        // 문제 1
        // 학생들의 이름을 Student 변수에 넣고,
        // 학생들의 이름이 잘 들어갔는지 확인하기 위해
        // 출력해주세요.
        // 학생들_
        // 김소민 선새롬 오윤균 이보름
        // 이태영 이효미 정수영 박지은
        // 정준석 이영진

        String[] student = {"김소민", "선새롬", "오윤균", "이보름", "이태영", "이효미", "정수영", "박지은", "정준석", "이영진"};

        System.out.println(Arrays.toString(student));
        System.out.println();

        // 문제 2
        // 학생들의 입실 시간에 따라 완료, 지각을 표시해주세요.
        // 9시까지 입실하여야 하며, 9시 01분부터 지각입니다.
        // 시간이 9시 01분이면 9.01로 표시합니다.
        // 시간이 8시 57분이면 8.57로 표시합니다.
        // [입실 시간 현황]
        // 김소민 8:50 선새롬 8:55 오윤균 9:01 이보름 9:05
        // 이태영 9:06 이효미 9:14 정수영 8:45 박지은 8:47
        // 정준석 8:56 이영진 8:37
        //
        // 출력 예)
        // 김소민 선새롬 오윤균 이보름
        // 완료 완료 지각 지각
        // 이태영 이효미 정수영 박지은
        // 지각 지각 완료 완료
        // 정준석 이영진
        // 완료 완료

        double[] time = {8.50, 8.55, 9.01, 9.05, 9.06, 9.14, 8.45, 8.47, 8.56, 8.37};
        //하씨 Math.round 해결하기
        System.out.println(Math.round( 67.45638 * 100) / 100.0);

//				for(int i=0; i < student.length ; i++) {
//					if(time[i] > 9.00) {
//						student[i] += " 지각";
//					}else { student[i] += " 완료";}
//					System.out.println((student[i]));
//				}

        String[] arr = new String[student.length];

        System.out.println();
        System.out.println("==========================================");
        for (int i = 0; i < student.length; i++) {
            if (time[i] > 9.00) {
                arr[i] = "지각  ";
            } else {
                arr[i] = "완료  ";
            }
        }

        int p;
        int t = 4;
        int u = 0;

        for (int i = 0; i < 3; i++) { //총 3줄
            if (i == 2) {//마지막줄 출력
                for (int k = 8; k < 10; k++) {
                    System.out.print(student[k] + " ");
                }
                System.out.println();
                for (int k = 8; k < 10; k++) {
                    System.out.print(arr[k] + " ");
                }
                break; //반복문 탈출
            }
            for (p = u; p < t; p++) {
                System.out.print(student[p] + " ");
            }
            System.out.println();
            for (p = u; p < t; p++) {
                System.out.print(arr[p] + " ");
            }
            t = 8;
            u = 4;
            //p는 이미 반복문 안에서 p++으로 4가 되어서 나오기 때문에 굳이 초기화하지 않아도 됨.
            System.out.println();

        }
    }
}


