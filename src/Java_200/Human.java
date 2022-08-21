package Java_200;


class Human { //클래스 3개의 변수(필드) 선언
    String name; //이름
    int height;  //신장
    int weight;  //체중
}

class HumanTester {
    public static void main(String[] args) {
        Human gildong = new Human(); //Human클래스를 길동이라는 인스턴스에 담음.
        Human chulsu = new Human();

        gildong.name = "길동"; //길동의 각 필드값을 담음
        gildong.height = 170;
        gildong.weight = 60;

        chulsu.name = "철수";
        chulsu.height = 166;
        chulsu.weight = 73;

        System.out.println("이름: " + gildong.name);
        System.out.println("신장: " + gildong.height + "cm");
        System.out.println("체중: " + gildong.weight + "kg");
        System.out.println();

        System.out.println("이름: " + chulsu.name);
        System.out.println("신장: " + chulsu.height + "cm");
        System.out.println("체중: " + chulsu.weight + "kg");
    }
}