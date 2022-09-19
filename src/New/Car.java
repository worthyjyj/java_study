package New;

public class Car {
    double speed;
    String color;
    static final double MAX_SPEED=200.0; //상수선언

    Car(){};
    Car(String color){
        this.color = color;
    }

    public void setspeed(double a){
        this.speed = a;
    }

    public void setColor(String b){
        this.color = b;
    }

    public double getSpeed(){
        return speed;
    }

    public String getColor(){
        return color;
    }

    static double getMAX_SPEED(){
        return MAX_SPEED;
    }

    public boolean speedUp(double speed){
        double tmp = this.speed; //원래 속도 보관
        double aaa = this.speed + speed;
        if (aaa<0 || aaa>MAX_SPEED){
            this.speed = tmp;
            return false;
        }else {
            this.speed = aaa;
            return true;
        }
    }

    public static void main(String[] args) {
        Car myCar = new Car("red");
        System.out.println("myCar의 색: "+myCar.getColor());
        System.out.println("차의 최대 속력: "+ Car.getMAX_SPEED() + "km/h");

        System.out.print("첫 번째 speedUp(100.0km/h): ");
        if (myCar.speedUp(100.0)){
            System.out.print("속도 변경 가능,");
        }else {
            System.out.print("속도 변경 불가능,");
        }
        System.out.println(" 현재 차의 속력: "+myCar.getSpeed() +"km/h");

        System.out.print("두 번째 speedUp(90.0km/h): ");
        if (myCar.speedUp(90.0)){
            System.out.print("속도 변경 가능,");
        }else {
            System.out.print("속도 변경 불가능,");
        }
        System.out.println(" 현재 차의 속력: "+myCar.getSpeed()+"km/h");


        Car yourCar = new Car("blue");
        System.out.println();
        System.out.println("yourCar의 색: "+ yourCar.getColor());
        System.out.println("차의 최대 속력: "+ Car.MAX_SPEED);

        System.out.print("첫 번째 speedUp(-100.0km/h): ");
        if (yourCar.speedUp(-100.0)){
            System.out.print("속도 변경 가능,");
        }else {
            System.out.print("속도 변경 불가능,");
        }
        System.out.println(" 현재 차의 속력: "+ yourCar.getSpeed() + "km/h");

        System.out.print("두 번째 speedUp(210.0km/h): ");
        if (yourCar.speedUp(210.0)){
            System.out.print("속도 변경 가능,");
        }else {
            System.out.print("속도 변경 불가능,");
        }
        System.out.println(" 현재 차의 속력: "+yourCar.getSpeed() +"km/h");
    }
}

