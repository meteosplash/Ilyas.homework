package ilyastak47;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите длины отрезков");
        System.out.println("(сначала большей длины, затем меньшей)");
        Scanner while1 = new Scanner(System.in);
        double a = while1.nextDouble();
        double b = while1.nextDouble();
        int sum = 0;
        double c = a;
        while(a>0 && b>0 && a>=b ){
            sum++;
            a-=b;

        }
        System.out.println("Нa отрезке а, длиной "+c+" помещается "+sum+" отрезков b, длиной "+b);
    }
}
