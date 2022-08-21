package Java_200;

class Human_1 {
    private String name; // 이름 // 비공개 접근(private) 이므로 클래스 외부에서는 접근할 수 없다.
    private int height; // 신장
    private int weight; // 체중

    //생성자
    Human_1(String n, int h, int w){
        name = n; height= h; weight=w;
    }

    //메서드
    String getName() {return name;} // 이름 가져오기
    int getHeight() {return height;} //신장 불러오기
    int getWeight() {return weight;} //체중 불러오기

    void gainWeight(int w) {weight += w;} //살이 찐다.
    void reduceWeight(int w) {weight -= w;} //살이 빠진다.
    }

    class HumanTester_1{
        public static void main(String[] args) {
            Human_1 gildong = new Human_1("길동",169,98); //생성자에 초기값 전달.
            Human_1 chulsu = new Human_1("철수",166, 75);

            gildong.gainWeight(3); //길동의 몸무게 늘었음
            chulsu.reduceWeight(5); //철수 몸무게 줄어듬

            System.out.println("이름: " +gildong.getName());
            System.out.println("신장: " +gildong.getHeight()+"cm");
            System.out.println("체중: " +gildong.getWeight()+"kg");
            System.out.println();

            System.out.println("이름: " +chulsu.getName());
            System.out.println("신장: " +chulsu.getHeight()+"cm");
            System.out.println("체중: " +chulsu.getWeight()+"kg");
        }
    }

