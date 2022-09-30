package game;

public class My {
    String name;
    int att=0;
    int def=10;
    int level=1;


    public void info() {
        System.out.println("-------------------------------------------------------------");
        System.out.println("                       내 정보                               ");
        System.out.println("-------------------------------------------------------------");
        System.out.println("이름 :" + this.name);
        System.out.println("타자실력 :" +this.att);
        System.out.println("방어력 : " +this.def);
        System.out.println("현재 레벨 : " + this.level);
    }
}
