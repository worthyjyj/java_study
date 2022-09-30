package New;

import java.util.Scanner;

public class TV1 {

    private boolean power; // 전원 상태
    private int channel; // 채널
    private int volume; // 음량

    private final int MIN_CHANNEL = 1;
    private final int MAX_CHANNEL = 100;
    private final int MIN_VOLUME = 0;
    private final int MAX_VOLUME = 10;
    // ctrl + shift + x : 대문자
    // ctrl + shift + y : 소문자

    public TV1() {
        this.power = false;
        this.channel = this.MIN_CHANNEL;
        this.volume = this.MIN_VOLUME;
    }

//	while (true) {
//
//		System.out.println("리모콘: 1. 전원 2. 채널변경 3. 채널업 4. 채널다운");
//
//		System.out.println("5. 볼륨업 6. 볼륨다운 7. 현재정보 0. 종료");
//
//		System.out.println("메뉴를 선택해주세요");
//
//		int input=ScanUtil.nextInt();
//
//		switch (input) {
//
//		case 1:
//
//			tv.togglePower();
//
//			break;
//
//		case 2:
//
//			tv.movechannel();
//
//			break;
//
//		case 3:
//
//			tv.channelup();
//
//			break;
//
//		case 4:
//
//			tv.volumedown();
//
//			break;
//
//		case 5:
//
//			tv.volumeUp();
//
//			break;
//
//		case 6:
//
//			tv.volumedown();
//
//			break;
//
//		case 7:
//
//			tv.showInfo();
//
//			break;
//
//		case 0:
//
//			System.exit(0);
//
//			break;
//
//		default:
//
//			System.out.println("잘못 누르셨습니다");
//
//				}
//
//
//
//				}

    public void togglePower() {
        this.power = !this.power;
        System.out.println(this.power ? "전원이 켜졌습니다." : "전원이 꺼졌습니다.");
    }


    public void showInfo() {
        if(this.power) {
            System.out.println("---------------");
//			System.out.println("현재 채널 : " + this.channel);
            showChannel();
//			System.out.println("현재 볼륨 : " + this.volume);
            showVolume();
            System.out.println("---------------");
        }else { // 꺼져있다면..
        }
    }

    public void volumeUp() {
        if(this.power) {
            this.volume++;
            if(this.volume > MAX_VOLUME) {
                this.volume = MAX_VOLUME;
            }
            showVolume();
        }else { // 꺼져있다면..
        }
    }

    public void volumeDown() {
        if(this.power) {
            this.volume--;
            if(this.volume < MIN_VOLUME) {
                this.volume = MIN_VOLUME;
            }
            showVolume();
        }else { // 꺼져있다면..
        }
    }

    private void showVolume() {
        System.out.print("현재 볼륨 : ");
        for(int i = 0; i < this.volume; i++) {
            System.out.print("■");
        }
        for(int i = 0; i < this.MAX_VOLUME - this.volume; i++) {
            System.out.print("□");
        }
        System.out.println(" " + this.volume);
    }

    public void channelUp() {
        if(this.power) {
            this.channel++;
            if(this.channel > this.MAX_CHANNEL) {
                this.channel = this.MIN_CHANNEL;
            }
            showChannel();
        }else { // 꺼져있다면..
        }
    }

    public void channelDown() {
        if(this.power) {
            this.channel--;
            if(this.channel < this.MIN_CHANNEL) {
                this.channel = this.MAX_CHANNEL;
            }
            showChannel();
        }else { // 꺼져있다면..
        }
    }

    private void showChannel() {
        System.out.println("현재 채널 : " + this.channel);
    }

    public void moveChannel() {
        // tv 종류 1. 허용되지 않는 채널을 입력하면 현재 채널에 머무르는 tv
//		if(this.power) {
//			System.out.print("채널 입력 >> ");
//			int channel = ScanUtil.nextInt();
//			if(channel < this.MIN_CHANNEL || channel > this.MAX_CHANNEL) {
//				System.out.println(channel + "번은 없습니다.");
//			}else {
//				this.channel = channel;
//			}
//			showChannel();
//		}else { // 꺼져있다면..
//		}
        // tv 종류 2. 허용되지 않는 채널을 입력하면 앞 숫자부터 허용되는 범위로 이동하기
        // 6876452 -> 68, 10857516 -> 10
        if(this.power) {
            System.out.print("채널 입력 >> ");
            Scanner sc = new Scanner(System.in);
            int channel = sc.nextInt();
            while(channel > this.MAX_CHANNEL) {
                channel /= 10;
            }
            this.channel = channel;
            showChannel();
        }else { // 꺼져있다면..
        }
    }
}
