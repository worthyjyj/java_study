package Java_200;

import java.util.Scanner;

class Car {
    private String name; //이름
    private String number; //번호
    private int width; //폭
    private int height; //높이
    private int length; //길이
    private double x; //현재 위치의 x 좌표
    private double y; //현재 위치의 y 좌표
    private double tankage; //탱크 용량
    private double fuel; //남은 연료
    private double sfc; //연비

    Car (String name, String number, int width, int height,
         int length, double tankage, double fuel, double sfc){
        this.name=name; this.number=number; this.width=width; this.height=height;
        this.length=length; this.tankage=tankage;
        this.sfc=sfc;
        this.fuel = (fuel>tankage) ? tankage : fuel; //생성자 안에 조건문 생성(삼항연산자로) //this.fuel 지우기
        x=y=0.0;
    }

    //값이 변할 수 있는 것들은 메소드로 만들어서 외부클래스 변한 겂을 호출 할 수 있도록 함.
    double getx(){
        return x;
    }

    double gety(){
        return y;
    }

    double getfuel(){
        return fuel;
    }

    //사양표시하는 메소드
    void putSpec(){
        System.out.println("이름: "+name);
        System.out.println("번호: "+number);
        System.out.println("전폭: "+width+"mm");
        System.out.println("전고: "+height+"mm");
        System.out.println("전장: "+length+"mm");
        System.out.println("탱크: "+tankage+"리터");
        System.out.println("연비: "+sfc+"km/리터");
    }

    //x방향으로 dx, y방향으로 dy이동 가능한지 여부와 이동한 만큼의 좌표 나타내는 메소드
    boolean move(double dx, double dy){
        double dist = Math.sqrt(dx*dx+dy*dy); //이동거리
        double f = dist / sfc; //이동에 필요한 연료

        if (f > fuel)
            return false;
        else {
            fuel=fuel-f;
            x=dx+x;
            y=dy+y;
            return true;
        }
    }

    //df 리터 급유
    void refuel(double df){
        if (df>0) {
            fuel = fuel + df;
        }if (fuel>tankage){
            fuel=tankage;
        }
    }

    boolean fuelmax(){
        if (fuel == tankage){
            fuel=tankage;
        return false;}
        else{
            return true;
        }
    }
}


