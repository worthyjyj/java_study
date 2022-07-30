package New;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        if (N<M) {
            System.out.println(-(N - M));
        }
        else{
            System.out.println(N - M);
        }
    }
}