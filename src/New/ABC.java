package New;

class Calculator {
    int left, right;

    public Calculator(int left, int right) { //상위클래스 생성자. 하위 클래스에 super를 사용하여(바로 인자값 넣기를 통해) 기본 생성자를 따로 만들지 않았다.
        this.left = left;
        this.right = right;
    }


    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

class SubstractionableCalculator extends Calculator {
    public SubstractionableCalculator(int left, int right) { //c1의 인자값을 받기위한 하위클래스의 생성자
        //하위클래스의 생성자를 호출하기전! 상속관계이기에 상위클래스의 상속자를 호출. 이 때 상위클래스에 기본생성자를 만들어서 호출해야함. 부모클래스에도 인자값을 받는 생성자가 있기 때문. 그래서 따로 인자값을 받지 않는 기본 생성자를 만들어줘야하는것.
    super(left, right);   // 하지만, 기본생성자를 만들어주지 않고도 super를 사용하여 상위클래스의 생성자에 바로 인자값을 전달 할 수 있음.
    this.left=40; // 부모클래스와는 다르게 자식클래스에 인자 값을 따로 줄 경우, super 밑에 이렇게 값 넣어주기!
    this.right=60;
    }

    public void substract() {
        System.out.println(this.left - this.right);
    }
}

public class ABC {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20); //상속받는 메소드의 출력을 하기위해 하위 클래스를 인스턴스화
        c1.sum();
        c1.avg();
        c1.substract();
    }
}