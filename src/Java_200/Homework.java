package Java_200;

public class Homework {
    public static void main(String[] args) {
        //1광년
        double speed = (double) 60*60*24*365*300000; // 기본적으로 숫자 값은 int타입으로 설정되는데, 그 값을 초과하므로 범위가 더 넓은 double로 형변환을 시켜줌.
        double distance = 40e12; //10의 12승을 e12로 표현가능. 이건 자동으로 double 타입으로 바뀜
        System.out.println("빛의 속도로 프록시마 센타우리 별까지 가는데 걸리는 시간은" + distance/speed + "이다."); //거리/속도
        System.out.printf("빛의 속도로 프록시마 센타우리 별까지 가는데 걸리는 시간은 %s광년이다.", 40e12/speed); //%f는 float. 7자리수까지만 표현가능해서 %s로 바꿔야함.
    }
}
