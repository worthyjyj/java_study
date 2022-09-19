package New;

public class NewCar {
    double speed;
    String color;
    static final double MAX_SPEED=200.0; //상수선언

    NewCar(){};
    NewCar(String color){
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

    // 생성자, 게터, 스피드업 메서드에서 단위 변환메서드를 어떻게 사용해야 할지 모르겠음
    private double killoToMile(double distance){
        this.speed = distance/1.6;
        return this.speed;
    }

    private double MileToKillo(double distance){
        this.speed = distance*1.6;
        return this.speed;
    }



}
