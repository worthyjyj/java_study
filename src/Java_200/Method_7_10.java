package Java_200;


import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Random;
import java.util.Scanner;

public class Method_7_10 {
    //암산 훈련 프로그램 : x+y+z / x+y-z / x-y+z / x-y-z (3개정수는 난수 생성)
    static String Array () { //실행할 때 무조건 이 메소드 먼저 실행 시키기. 난수 및 랜덤 암산식 출력
        Random rd = new Random();
        int x = rd.nextInt(900)+100; //범위는 100부터 999까지!
        int y = rd.nextInt(900)+100;
        int z = rd.nextInt(900)+100;
        String a [] = {x+"+"+y+"+"+z,x+"+"+y+"-"+z,x+"-"+y+"+"+z,x+"-"+y+"-"+z};
        Random rd1 = new Random();
        return a[rd1.nextInt(4)]; //인덱스 값 0~3 까지 받음.
    }

    public static void main(String[] args) throws ScriptException {
        Scanner sc = new Scanner(System.in);
        ScriptEngineManager s = new ScriptEngineManager();
        ScriptEngine engine = s.getEngineByName("JavaScript");
        int n;
        int v;
        System.out.println("암산훈련!!");
        do {
                String b = Array();//사용자가 다시한번 누르면 새로운 난수 생성
                do { System.out.print(b + " = ");
                n = sc.nextInt(); //사용자가 암산한 결과
                v = (int)engine.eval(b); //실제 암산 정답
                if (n!=v){
                    System.out.println("틀렸습니다!");
                }
            }while(n!=v);

            do {
                System.out.print("다시 한 번?<Yes...1/No...0>: ");
                n= sc.nextInt();
            }while (n!=0 && n!=1);

       }while(n==1);
    }
}
