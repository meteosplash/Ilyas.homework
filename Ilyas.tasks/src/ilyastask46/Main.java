package ilyastask46;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите длины отрезков");
        System.out.println("(сначала большей длины, затем меньшей)");
        Scanner while1 = new Scanner(System.in);
        double a = while1.nextDouble();
        double b = while1.nextDouble();
        while(a>0 && b>0 && a>=b ){
            a-=b;
        }
        System.out.println("Незанятая часть отрезка - "+a);
    }
}
