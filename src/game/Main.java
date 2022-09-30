package game;

import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    int input=0;
    String a;
    My m = new My(); //My 객체 생성
    Weapon w = new Weapon();
    MoleArmy ma1 = new MoleArmy("LV1.일병두더지", 2,  w.weapons1);  //일병 두더지 출현
    MoleArmy ma2 = new MoleArmy("LV2.상병두더지", 5, w.weapons2);  //일병 두더지 출현
    MoleArmy ma3 = new MoleArmy("LV3.사단장두더지", 10, w.weapons3);
    int[] rank = new int[1]; //랭크 배열 생성

    int count=0;


    public static void main(String[] args) {
        new Main().start();
    }

    public void start() {
        while(true) {
            if(input!=1 || input !=2 || input!=3) {
                System.out.println("\r\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⣀⣠⡤⠤⠤⠤⠤⠤⣤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡤⠖⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀     ⠈⠉⠓⢦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡴⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ⠈⠳⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⠏⠀⠀⠀⠀⠀⠠⢤⣀⣀⣀⣀⣀⣠⡤⠴⠀⠀⠀⠀     ⠀⠘⢦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⡼⠃⠀⠀⠀⠀⠙⠢⡀⢀⣋⣠⣤⣤⣤⣙⡁⠀⡔⠊⠀⠀⠀    ⠀⠈⢳⡀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⣰⠃⠀⠀⠀⠀⠀⢀⡠⠷⣿⣧⣼⣿⣿⣿⣿⣿⡾⠦⣀⠀⠀⠀⠀⠀   ⠀⢷⡀⠀⠀⠀⠀⠀⠀⠀\r\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⢰⡏⠀⠀⠀⠀⣀⡔⠉⠀⠀⠻⣿⣿⣿⣿⣿⣿⠟⠁⠀⠈⠳⣄⡀⠀⠀⠀  ⠸⡇⠀⠀⠀⠀⠀⠀⠀\r\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⢸⠇⠀⠀⠀⠀⡞⠀⠀⠄⠀⠀⠀⠉⠙⡏⠉⠀⠀⠀⠀⠀⠀⠘⡄⠀⠀⠀  ⠀ ⣿⣦⠀⠀⠀⠀⠀⠀\r\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⢸⡀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀  ⠀ ⣿⠟⠃⠀⠀⠀⠀⠀\r\n" +
                        "⠀⠀⠀⠀⢀⡤⠤⢾⡇⠀⠀⠀⠈⣷⣄⠀⠀⠀⠀⠀⣀⠴⡧⣄⠀⠀⠀⠀⠀⢀⣼⡇⠀⠀⠀⠀⣿⠀⠘⠛⢦⠀⠀⠀\r\n" +
                        "⠀⠀⠀⠀⣾⡀⠀⠘⣷⣄⠀⠆⠀⡿⣿⣿⣷⣶⣾⡏⠀⠀⡇⠀⠈⣿⣷⣶⣿⣿⣿⠀⠀⠀⣦⡇⠀⠀⠀⣨⠀⠀⠀\r\n" +
                        "⠀⠀⠀⢠⠏⠀⠀⢀⣿⣿⣶⣤⣀⣀⠈⠻⣿⣿⣿⣷⣶⣶⣷⣶⣶⣿⣿⣿⡟⠋⢀⣀⣷⣴⣿⣿⡇⠀⠀⠀⠈⠑⢦⡀\r\n" +
                        "⢠⡖⠉⠁⠀⠀⠀⠈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⠿⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⠀⠀⠀⠀⠀⣶⣧\r\n" +
                        "⢾⣷⣄⡀⠀⠀⠀⢀⣿⣿⣿⣿⣿⣿⣿⣿⠿⠋⠉⠀⠀⠀⠀⠀⠀⠈⠙⢻⡿⠟⢫⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠠⡟⠃\r\n" +
                        "⣀⣉⣛⢻⠀⠀⠀⠀⣾⣿⣿⣿⣿⡿⠋⠙⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡟⡁⠀⠄⣿⣿⣿⣿⣿⡏⠀⠀⠀⢀⣼⠇⠀\r\n" +
                        "⣁⣀⣀⣀⠀⠀⠀⠀⢹⣿⣿⣿⣿⡷⠁⢠⣼⡇⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⡵⢆⣌⣿⣿⣿⣿⠟⠀⠀⠀⠀⠈⠉⣶⡀\r\n" +
                        "⠉⠉⠉⠙⠛⠀⠀⠀⠀⠙⢿⣿⣿⣷⣾⣳⣽⣇⠀⠀⠀⠀⠀⠀⠀⠀⠹⢟⣿⣿⣿⡿⠿⠛⠁⠀⠀⠀⠄⣀⣤⣿⣾⣧\r\n" +
                        "⠀⠀⠀⠀⣀⠀⠀⠀⠀⠀⠀⠈⠙⠛⠛⠿⠛⠻⠶⢦⣤⣤⣤⣤⣤⠴⠶⠞⠋⠉⠀⠀⠀⠀⠀⣴⣶⣶⣶⡿⠿⠿⠛⠁\r\n" +
                        "⠀⠀⠀⠀⠙⠷⣶⣶⣶⣶⣦⡤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⣴⣿⡍⠉⠁⠀⠀⠀⠀⠀\r\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢾⣷⣄⣀⣀⣀⣤⣦⣤⣤⣿⣿⣆⠀⠀⠀⠀⣀⣴⣤⣤⣤⣶⣿⣿⠟⠁⠀⠀⠠⠄⠀⠀⠀\r\n" +
                        "");
                System.out.println("--------------------두더지 부대 뿌시는 게임------------------");
                System.out.println("-------------------------------------------------------------");
                System.out.println("          코딩을 배우고 있는 당신, 타자가 빨라야지만         ");
                System.out.println("                   수업을 따라갈 수 있는데                   ");
                System.out.println("                두더지가 자꾸 당신을 방해한다                ");
                System.out.println(                                                               );
                System.out.println("        일병(LV1) | 상병(LV2) | 사단장(LV3) 으로 꾸려진      ");
                System.out.println("         두더지 부대를 뿌시고 타자 실력을 UP시키자!          ");
                System.out.println("-------------------------------------------------------------");
                System.out.println("-------------------------------------------------------------");
                System.out.print  ("                이름을 입력해주세요 >> ");
                a = sc.nextLine();
                m.name = a; //캐릭터 이름 전달
                interFace2();
                break;
            }
        }
    }


    private void checkrank() {
        System.out.println("-----------------------------------------------------------------");
        System.out.printf("------------------------\"%s\"님의 기록 체크---------------\n",m.name);
        for(int i=0; i<rank.length ;i++) {
            System.out.printf ("  [%d]차 시도 :  타자력 %d \n",i,rank[i]                               );
        }
        interFace2();
    }

    public void interFace() {
        while(true) {
            int temprank[] = new int[rank.length+1]; //점수 기록을 위한 배열

            for(int i=0 ; i< rank.length ;i++) {
//				temprank[count]=m.att;
//				rank[count] = temprank[count];
//				count++;
                temprank[i] = rank[i];
            }
            temprank[temprank.length-1]=m.att;
            rank=temprank;
            int[] temprank1 = new int[rank.length-1];
            int tune=0;
            for(int i=0; i<temprank1.length ; i++){
                if (temprank[i]==0){
                    tune++;
                }
                temprank1[i] = temprank1[i+tune];
            }
            rank=temprank1;

            //다시 시도할 때 값 초기화
            m.att=0;
            m.def=10;
            m.level=1;
            interFace2();
        }
    }

    public void interFace2() {	//랭킹에서 돌아왓을 때 점수기록을 위한 배열은 거칠필요가 없기 때문에 따로 빼줬음.
        System.out.println("-------------------------------------------------------------");
        System.out.print ("       1.내정보  2.두더지잡으러가기 3.랭킹 >> ");
        input = sc.nextInt();

        switch(input) {
            case 1:
                m.info();
                interFace2();
                break;
            case 2:
                huntmole();
                result();
                huntmoleLV2();
                result();
                huntmoleLV3();
                finalresult();
                break;
            case 3:
                checkrank();
                break;
            default :
                break;
        }
    }



    private void finalresult() {
        if(m.def>0) {
            System.out.println("====================================================================================================");
            System.out.printf("%s을(를) 처치했습니다!!",ma3.name);
            System.out.println("====================================================================================================");
            System.out.println();
            System.out.println("축하합니다!! 두더지 부대를 모두 혁파했습니다!!!!!!!!!!!!");
            System.out.println("====================================================================================================");
            System.out.printf("현재 레벨 : %d , 최종 타자실력 : %d, 방어력 : %d\n",m.level,m.att,m.def);
            System.out.println("====================================================================================================");
            System.out.println("당신은 타자왕,,,,, 축하합니다,,,,,");
            System.out.println("다시 시작하시려면 엔터를 치세요! ");
            String a = ScanUtil.nextLine();
            if(a.equals("")) {}
            interFace();
        }else {
            m.def=0;
            System.out.println("=============================================");
            System.out.println("두더지의 공격에 죽었습니다.......ㅠㅠ");
            System.out.println("=============================================");
            System.out.println("다시 시작하시려면 엔터를 치세요! ");
            String a = ScanUtil.nextLine();
            if(a.equals("")) {}
            interFace();
        }
    }

    private void result() {
        int	plusdef=10;
        if(m.def>0) {
            m.level+=1;
            if(m.level==2) {
                plusdef=10;
                m.def+=10;
                System.out.println("====================================================================================================");
                System.out.printf("%s을(를) 처치했습니다!!\n",ma1.name);
                System.out.println("====================================================================================================");
                System.out.println();
            }else if(m.level==3) {
                plusdef=20;
                m.def+=20;
                System.out.println("====================================================================================================");
                System.out.printf("%s을(를) 처치했습니다!!\n",ma2.name);
                System.out.println("====================================================================================================");
                System.out.println();
            }
            System.out.println("====================================================================================================");
            System.out.printf("★★★레벨업을 했습니다★★★ 현재 레벨 : %d , 현재 타자실력 : %d, 방어력(+%d) : %d\n",m.level,m.att,plusdef,m.def);
            System.out.println("====================================================================================================");
            System.out.println("다음 레벨 준비됐으면 엔터를 치세요! ");
            String a = ScanUtil.nextLine();
            if(a.equals("")) {}
        }else {
            m.def=0;
            System.out.println("=============================================");
            System.out.println("두더지의 공격에 죽었습니다.......ㅠㅠ");
            System.out.println("=============================================");
            interFace();
        }
    }

    private void huntmole() {
        clearConsole();
        System.out.println("LV1.일병두더지가 나타나 공격합니다!!!");
        System.out.println();

        Battle:
        while(true) {
            String input;
            for(int i=0; i<w.weapons1.length; i++) {
                if(m.def<=0) {break Battle;}
                System.out.printf("5초안에 '%s' 입력 ㄱㄱ >> ",w.weapons1[i]);
                long beforeTime = System.currentTimeMillis();
                input = ScanUtil.nextLine();
                long afterTime = System.currentTimeMillis();
                long secDiffTime = (afterTime - beforeTime)/1000;

                if(secDiffTime < 6) {
                    if(input.equals(w.weapons1[i])) {
                        System.out.println("====================================");
                        System.out.println("두더지를 잡아 +2 공격력 올랐습니다.");
                        System.out.println("====================================");
                        System.out.println();
                        m.att+=2;
                    }else{
                        System.err.println("================오타================");
                        System.err.println("두더지를 놓쳐 -2 방어력 잃었습니다.");
                        System.err.println("====================================");
                        System.err.println();
                        m.def-=2;
                    }
                }else {
                    System.err.println("===============시간초과===============");
                    System.err.println("두더지를 놓쳐 -2 방어력 잃었습니다.");
                    System.err.println("====================================");
                    System.err.println();
                    m.def-=2;
                }
            }break;
        }
    }

    private void huntmoleLV2() {
        clearConsole();
        System.out.println("LV2.상병두더지가 나타나 공격합니다!!!");
        System.out.println();

        Battle:
        while(true) {
            String input;
            for(int i=0; i<w.weapons2.length; i++) {
                if(m.def<=0) {break Battle;}
                System.out.printf("3초안에 '%s' 입력 ㄱㄱ >> ",w.weapons2[i]);
                long beforeTime = System.currentTimeMillis();
                input = ScanUtil.nextLine();
                long afterTime = System.currentTimeMillis();
                long secDiffTime = (afterTime - beforeTime)/1000;

                if(secDiffTime < 4) {
                    if(input.equals(w.weapons2[i])) {
                        System.out.println("====================================");
                        System.out.println("두더지를 잡아 +5 공격력 올랐습니다.");
                        System.out.println("====================================");
                        System.out.println();
                        m.att+=5;
                    }else{
                        System.err.println("================오타================");
                        System.err.println("두더지를 놓쳐 -5 방어력 잃었습니다.");
                        System.err.println("====================================");
                        System.err.println();
                        m.def-=5;
                    }
                }else {
                    System.err.println("===============시간초과===============");
                    System.err.println("두더지를 놓쳐 -5 방어력 잃었습니다.");
                    System.err.println("====================================");
                    System.err.println();
                    m.def-=5;
                }
            }break;
        }
    }

    private void huntmoleLV3() {
        clearConsole();
        System.out.println("LV3.사단장두더지가 나타나 공격합니다!!!");
        System.out.println();

        Battle:
        while(true) {
            String input;
            for(int i=0; i<w.weapons3.length; i++) {
                if(m.def<=0) {break Battle;}
                System.out.printf("2초안에 '%s' 입력 ㄱㄱ >> ",w.weapons3[i]);
                long beforeTime = System.currentTimeMillis();
                input = ScanUtil.nextLine();
                long afterTime = System.currentTimeMillis();
                long secDiffTime = (afterTime - beforeTime)/1000;

                if(secDiffTime < 6) {
                    if(input.equals(w.weapons3[i])) {
                        System.out.println("====================================");
                        System.out.println("두더지를 잡아 +10 공격력 올랐습니다.");
                        System.out.println("====================================");
                        System.out.println();
                        m.att+=10;
                    }else{
                        System.err.println("================오타================");
                        System.err.println("두더지를 놓쳐 -10 방어력 잃었습니다.");
                        System.err.println("====================================");
                        System.err.println();
                        m.def-=10;
                    }
                }else {
                    System.err.println("===============시간초과===============");
                    System.err.println("두더지를 놓쳐 -10 방어력 잃었습니다.");
                    System.err.println("====================================");
                    System.err.println();
                    m.def-=10;
                }
            }break;
        }
    }


    public void clearConsole() {
        for(int i =0; i <100; i++) System.out.println();
    }
}
