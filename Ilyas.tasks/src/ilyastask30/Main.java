package ilyastask30;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите 3 числа");
        Scanner if30 = new Scanner(System.in);
        double a = if30.nextDouble();
        double b = if30.nextDouble();
        double c = if30.nextDouble();
        if(b>a&c>a){
            System.out.println("Сумма двух наибольших чисел = "+(b+c));
        }
        if(a>b&c>b){
            System.out.println("Сумма двух наибольших чисел = "+(a+c));
        }
        if(a>c&b>c){
            System.out.println("Сумма двух наибольших чисел = "+(b+a));
        }
    }
}
