import game.ScanUtil;

import java.util.*;

//문제) 호텔 객실을 관리하는 프로그램을 작성하시오.
//
//조건1)  호텔 객식을 나타내는 Room클래스는 방번호(int), 방종류, 투숙객이름 필드로 구성되어 있고
//방번호와 방종류는 다음과 같다.
//- 201~209 : 싱글룸
//- 301~309 : 더블룸
//- 401~409 : 스위트룸
//
//조건2) 전체 객실 관리는 Map을 이용한다.
//(Map의 key값은 방번호로 하고 value값은 Room의 인스턴스로 한다.)
//생성자에서는 Room객체의 방번호와 방종류를 모두 초기화한다.
//
//
//
//
//실행예시)
//
//*********************************************
//호텔문을 열었습니다. 어서오십시요.
//*********************************************
//
//
//-----------------------------------------------------------
//어떤 업무를 하시겠습니까?
//		1. 체크인    2. 체크아웃    3. 객실상태    4. 업무종료
//		-----------------------------------------------------------
//		선택>>	1     <--- 입력
//
//		----------------------------------------------
//		체크인 작업
//		----------------------------------------------
//		* 201~209 : 싱글룸
//		* 301~309 : 더블룸
//		* 401~409 : 스위트룸
//		----------------------------------------------
//		방 번호 입력 >> 101     <--- 입력
//		101호 객실은 존재하지 않습니다.
//
//		-----------------------------------------------------------
//		어떤 업무를 하시겠습니까?
//				1. 체크인    2. 체크아웃    3. 객실상태    4. 업무종료
//				-----------------------------------------------------------
//				선택>>	1     <--- 입력
//
//		----------------------------------------------
//		체크인 작업
//		----------------------------------------------
//		* 201~209 : 싱글룸
//		* 301~309 : 더블룸
//		* 401~409 : 스위트룸
//		----------------------------------------------
//		방 번호 입력 >> 201     <--- 입력
//		누구를 체크인 하시겠습니까?
//				이름 입력 >> 홍길동
//		체크인이 완료되었습니다.
//
//		-----------------------------------------------------------
//		어떤 업무를 하시겠습니까?
//				1. 체크인    2. 체크아웃    3. 객실상태    4. 업무종료
//				-----------------------------------------------------------
//				선택>>	1     <--- 입력
//
//				----------------------------------------------
//				체크인 작업
//				----------------------------------------------
//				* 201~209 : 싱글룸
//				* 301~309 : 더블룸
//				* 401~409 : 스위트룸
//				----------------------------------------------
//				방 번호 입력 >> 201     <--- 입력
//				201호 객실은 이미 손님이 있습니다.
//
//				-----------------------------------------------------------
//				어떤 업무를 하시겠습니까?
//						1. 체크인    2. 체크아웃    3. 객실상태    4. 업무종료
//						-----------------------------------------------------------
//						선택>>	3     <--- 입력
//
//				----------------------------------------------
//				현재 객실 상태
//				----------------------------------------------
//				방 번호	 방 종류	 투숙객 이름
//				----------------------------------------------
//				201	 싱글룸 	홍길동
//				202	 싱글룸 	  -
//				203	 싱글룸 	  -
//				204	 싱글룸 	  -
//				205	 싱글룸 	  -
//				206	 싱글룸 	  -
//				207	 싱글룸 	  -
//				208	 싱글룸 	  -
//				209	 싱글룸 	  -
//				301	 더블룸 	  -
//				302	 더블룸 	  -
//				303	 더블룸 	  -
//				304	 더블룸 	  -
//				305	 더블룸 	  -
//				306	 더블룸 	  -
//				307	 더블룸 	  -
//				308	 더블룸 	  -
//				309	 더블룸 	  -
//				401	스위트룸	  -
//				402	스위트룸	  -
//				403	스위트룸	  -
//				404	스위트룸	  -
//				405	스위트룸	  -
//				406	스위트룸	  -
//				407	스위트룸	  -
//				408	스위트룸	  -
//				409	스위트룸	  -
//				----------------------------------------------
//
//				-----------------------------------------------------------
//				어떤 업무를 하시겠습니까?
//						1. 체크인    2. 체크아웃    3. 객실상태    4. 업무종료
//						-----------------------------------------------------------
//						선택>>	2    <--- 입력
//
//				----------------------------------------------
//				체크아웃 작업
//				----------------------------------------------
//				체크아웃 할 방 번호를 입력하세요.
//				방번호 입력 >> 101    <--- 입력
//				101호 객실은 존재하지 않습니다.
//
//				-----------------------------------------------------------
//				어떤 업무를 하시겠습니까?
//						1. 체크인    2. 체크아웃    3. 객실상태    4. 업무종료
//						-----------------------------------------------------------
//						선택>>	2    <--- 입력
//
//				----------------------------------------------
//				체크아웃 작업
//				----------------------------------------------
//				체크아웃 할 방 번호를 입력하세요.
//				방번호 입력 >> 303    <--- 입력
//				303호 객실에는 체크인 한 사람이 없습니다.
//
//				-----------------------------------------------------------
//				어떤 업무를 하시겠습니까?
//						1. 체크인    2. 체크아웃    3. 객실상태    4. 업무종료
//						-----------------------------------------------------------
//						선택>>	2    <--- 입력
//
//				----------------------------------------------
//				체크아웃 작업
//				----------------------------------------------
//				체크아웃 할 방 번호를 입력하세요.
//				방번호 입력 >> 201    <--- 입력
//				201호 객실의 홍길동님 체크아웃을 완료하였습니다.
//
//				-----------------------------------------------------------
//				어떤 업무를 하시겠습니까?
//						1. 체크인    2. 체크아웃    3. 객실상태    4. 업무종료
//						-----------------------------------------------------------
//						선택>>	3    <--- 입력
//
//
//				----------------------------------------------
//				현재 객실 상태
//				----------------------------------------------
//				방 번호	 방 종류	 투숙객 이름
//				----------------------------------------------
//				201	 싱글룸 	  -
//				202	 싱글룸 	  -
//				203	 싱글룸 	  -
//				204	 싱글룸 	  -
//				205	 싱글룸 	  -
//				206	 싱글룸 	  -
//				207	 싱글룸 	  -
//				208	 싱글룸 	  -
//				209	 싱글룸 	  -
//				301	 더블룸 	  -
//				302	 더블룸 	  -
//				303	 더블룸 	  -
//				304	 더블룸 	  -
//				305	 더블룸 	  -
//				306	 더블룸 	  -
//				307	 더블룸 	  -
//				308	 더블룸 	  -
//				309	 더블룸 	  -
//				401	스위트룸	  -
//				402	스위트룸	  -
//				403	스위트룸	  -
//				404	스위트룸	  -
//				405	스위트룸	  -
//				406	스위트룸	  -
//				407	스위트룸	  -
//				408	스위트룸	  -
//				409	스위트룸	  -
//				----------------------------------------------
//
//
//				-----------------------------------------------------------
//				어떤 업무를 하시겠습니까?
//						1. 체크인    2. 체크아웃    3. 객실상태    4. 업무종료
//						-----------------------------------------------------------
//						선택>>	4    <--- 입력
//
//				*********************************************
//				호텔문을 닫았습니다.
//				*********************************************

public class Hotel {
    Map<Integer,Room> manage = new HashMap<Integer,Room>();



    public static void main(String[] args) {
        Hotel h = new Hotel() {};


        System.out.println("*********************************************\r\n" +
                "             호텔문을 열었습니다. 어서오십시요.\r\n" +
                "*********************************************");


        h.init();
        h.start();
    }

    private void init() {
        //반복문을 돌려서 map에 저장
        for(int i=201; i<210 ;i++) {
            Room rm = new Room(i,"싱글룸","-");
            int key = i;
            manage.put(key,rm);
        }

        for(int i=301; i<310 ;i++) {
            Room rm = new Room(i,"더블룸","-");
            int key = i;
            manage.put(key,rm);
        }

        for(int i=401; i<410 ;i++) {
            Room rm = new Room(i,"스위트룸","-");
            int key = i;
            manage.put(key,rm);
        }
    }

    private void start() {

        System.out.println("-----------------------------------------------------------\r\n" +
                "어떤 업무를 하시겠습니까?\r\n" +
                " 1. 체크인    2. 체크아웃    3. 객실상태    4. 업무종료\r\n" +
                "-----------------------------------------------------------\r\n");

        System.out.print("번호 선택  >> ");

        switch(ScanUtil.nextInt()) {
            case 1: checkin(); break;
		    case 2: checkout(); break;
            case 3: roomstate(); break;
            case 4:
                System.out.println("*********************************************\r\n" +
                        "호텔문을 닫았습니다.\r\n" +
                        "*********************************************");
                return;
            default : System.out.println("존재하지 않는 번호입니다. ");
        }
        start();
    }

    private void checkout() {
        System.out.print("----------------------------------------------\r\n" +
                "체크아웃 작업\r\n" +
                "----------------------------------------------\r\n");
        System.out.println("체크아웃 할 방 번호를 입력하세요.");

        main:
        while (true) {
            System.out.print("방 번호 입력 >> ");
            int input = ScanUtil.nextInt();

            if (!manage.containsKey(input)) {
                System.out.println(input + "호 객실은 존재하지 않습니다.");
            } else if (manage.get(input).getGuest().equals("-")) {
                System.out.println(input + "호 객실에는 체크인 한 사람이 없습니다.");
            } else {
                System.out.println(input + "호 객실의 " + manage.get(input).getGuest() + "님 체크아웃을 완료하였습니다.");
                manage.get(input).setGuest("-");
                break;
            }
        }
    }

    private void roomstate() {

        System.out.println("----------------------------------------------\r\n" +
                "현재 객실 상태\r\n" +
                "----------------------------------------------\r\n" +
                "방 번호	 방 종류	 투숙객 이름\r\n" +
                "----------------------------------------------");

        //정렬하고
        List<String> keyList = new ArrayList(manage.keySet());
        Collections.sort(keyList);


        //출력
        for(int i=0; i < keyList.size() ; i++) {
            System.out.print(manage.get(keyList.get(i)).getRoomnum() +"\t");
            System.out.print(manage.get(keyList.get(i)).getRoomkind() +"\t");
            System.out.println(manage.get(keyList.get(i)).getGuest() +"\t");
        }
    }



    private void checkin() {
        System.out.print("----------------------------------------------\r\n" +
                "체크인 작업\r\n" +
                "----------------------------------------------\r\n" +
                "* 201~209 : 싱글룸\r\n" +
                "* 301~309 : 더블룸\r\n" +
                "* 401~409 : 스위트룸\r\n" +
                "----------------------------------------------\r\n");
        main:
        while (true) {
            System.out.print("방 번호 입력 >> ");
            int input = ScanUtil.nextInt();

            if (!manage.containsKey(input)) {
                System.out.println(input + "호 객실은 존재하지 않습니다.");
            } else if (!manage.get(input).getGuest().equals("-")) {
                System.out.println(input+"객실은 이미 손님이 있습니다.");
            } else {
                System.out.println("누구를 체크인 하시겠습니까?");
                System.out.print("이름 입력 >> ");
                String input2 = ScanUtil.nextLine();
                manage.get(input).setGuest(input2);
                System.out.println("체크인이 완료되었습니다.");
                break;
            }
        }





}



}

class Room{
    private int roomnum;
    private String roomkind;
    private String guest;


    public Room(int roomnum, String roomkind, String guest) {
        super();
        this.roomnum = roomnum;
        this.roomkind = roomkind;
        this.guest = guest;
    }

    public int getRoomnum() {
        return roomnum;
    }
    public void setRoomnum(int roomnum) {
        this.roomnum = roomnum;
    }
    public String getRoomkind() {
        return roomkind;
    }
    public void setRoomkind(String roomkind) {
        this.roomkind = roomkind;
    }
    public String getGuest() {
        return guest;
    }
    public void setGuest(String guest) {
        this.guest = guest;
    }


}

