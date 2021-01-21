package ilyastask41;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        System.out.print("N = ");
        int n = en.nextInt();
        int all = 0;
        for(int a = 0;a<=n;a++){
            all+=Math.pow(n+a,2);
        }
        System.out.println("Сумма квадратов чисел от N до 2*N = "+all);

    }
}
