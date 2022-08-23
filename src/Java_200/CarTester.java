package Java_200;

import java.util.Scanner;

class CarTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        double z;
        double r;
        double u;
        Car k3 = new Car("k3", "서울999-88", 1660, 1500, 3640, 40.0, 10.0, 12);

        System.out.println("차량 데이터를 입력하세요.");
        k3.putSpec();
        System.out.println("현재 위치: " + "(" + k3.getx() + "," + k3.gety() + ")");
        System.out.println("남은 연료: " + k3.getfuel());
        while (t == 1) { //(괄호값)이 true 일 경우 계속 반복실행
            System.out.print("이동하시겠습니까? [0...No/1...Yes] : ");
            t = sc.nextInt();
            if (t == 0) { //사용자가 0을 선택할 경우 반복문 탈출
                break;
            }
            System.out.print("X 방향으로의 이동 거리: ");
            z = sc.nextDouble();
            System.out.print("Y 방향으로의 이동 거리: ");
            r = sc.nextDouble();
            if (k3.move(z, r) == false) {
                System.out.print("연료부족!! 연료를 넣으시겠습니까? [2...No/3...Yes] : "); //연료 부족 관련 반복문 실행을 위해 선택사항 생성
                t = sc.nextInt();
            }

            if (t == 3) {
                while (k3.move(z, r) == false) {
                    System.out.print("얼마나 넣으시겠습니까? :  ");
                    u = sc.nextDouble();
                    k3.refuel(u);
                    if (k3.fuelmax() == false) {
                        if (k3.fuelmax() == k3.move(z, r)) { //연료가 full인 상태이지만, 이동이 불가능하며 false값으로 맞췄기 때문에 이동변수에 합계 중복 막음.
                            System.out.println("연료량을 꽉 채웠음에도 요청하신 거리는 이동하기 어렵습니다.");
                            break;
                        }else{ //연료를 풀로 넣은 상태에서, 이동이 가능할 때. true값으로 반환되며, 이동좌표에 합산됨.
                            break;
                        }
                    }
                    if (k3.move(z, r) == false) { //이동은 가능하지만 연료가 부족한 상태. 연료량이 채워질 때 까지 반복.
                        System.out.println("연료가 아직 부족합니다. 더 넣어주세요.");
                    }
                }
            }
            //이동가능 할 때 이동한 좌표와 남은 연료
            System.out.println("현재 위치: " + "(" + k3.getx() + "," + k3.gety() + ")");
            System.out.println("남은 연료: " + k3.getfuel());
            t = 1; //이동여부를 묻는 실행문으로 자동 반복하도록 변수값 설정
        }
    }
}