package ilyastask29;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner if29 = new Scanner(System.in);
        System.out.println("Введите 3 числа");
        double a = if29.nextDouble();
        double b = if29.nextDouble();
        double c = if29.nextDouble();
        if(a<b&a<c){
            System.out.println("Меньшее число = "+a);
        }
        if(b<a&b<c){
            System.out.println("Меньшее число = "+b);
        }
        if(c<b&c<a){
            System.out.println("Меньшее число = "+c);
        }
        if(a>b&a>c){
            System.out.println("Большее число = "+a);
        }
        if(b>a&b>c){
            System.out.println("Большее число = "+b);
        }
        if(c>b&c>a){
            System.out.println("Большее число = "+c);
        }
    }
}
