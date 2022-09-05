package Java_200;

import java.util.Scanner;

public class CoordinateTester1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("좌표 p를 입력하세요.");
        System.out.print("X좌표:"); double x = sc.nextDouble();
        System.out.println("Y좌표:"); double y = sc.nextDouble();
        //생성자에 x, y 좌표 전달

        Coordinate p = new Coordinate(x,y);
        System.out.println("p = (" + p.getX() + "," + p.getY() + ")");
        Coordinate q = p; //참조 대상을 복사하는 것이므로 초기화
        q.set(9.9, 9.9);
        System.out.println("p = (" + p.getX() + "," + p.getY() + ")");
        System.out.println("q = (" + q.getX() + "," + q.getY() + ")");
    }
}
