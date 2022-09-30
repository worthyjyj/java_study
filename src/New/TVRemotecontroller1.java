package New;

import java.util.Scanner;

public class TVRemotecontroller1 {
    public static void main(String[] args) {
        /*
         * 채널 및 볼륨과 관련된 동작들을 메서드로 만들어 주세요.
         *
         * 리모콘 모양 (메뉴)
         *
         * -------------------------------------
         * 1.전원 2.채널변경 3.채널업 4.채널다운
         * 5.볼륨업 6.볼륨다운 7.현재정보 0.종료 <- 프로그램종료
         * -------------------------------------
         * */

        TV1 tv = new TV1();

        main:
        while(true) {
            System.out.println("-------------- 리 모 콘 --------------");
            System.out.println("1.전원 2.채널변경 3.채널업 4.채널다운");
            System.out.println("5.볼륨업 6.볼륨다운 7.현재정보 0.종료");
            System.out.println("-------------------------------------");
            System.out.print("메뉴를 선택해 주세요 >> ");
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            switch(input) {
                case 1:
                    tv.togglePower();
                    break;
                case 2:
                    tv.moveChannel();
                    break;
                case 3:
                    tv.channelUp();
                    break;
                case 4:
                    tv.channelDown();
                    break;
                case 5:
                    tv.volumeUp();
                    break;
                case 6:
                    tv.volumeDown();
                    break;
                case 7:
                    tv.showInfo();
                    break;
                case 0:
                    break main;
                default:
                    System.out.println("잘못 누르셨습니다.");
            }
        }
    }
}
