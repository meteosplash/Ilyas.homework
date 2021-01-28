package ilyastask24;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner if24 = new Scanner(System.in);
        System.out.println("Введите 2 целых числа");
        int a = if24.nextInt();
        int b = if24.nextInt();
        int sum = a+b;
        if(a>b) {
            a = sum-a;

        }
            if(a<b){
                a=sum-a;
                b=sum-b;
            }
        System.out.println("Теперь 1-е число = "+a+", а 2-е = "+b);
        }
    }

