package ilyastask16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите положительное число ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 0) {
            a++;
            System.out.println(a + " - это ваше число увеличенное на 1");
        }
        if(a<=0){
            System.out.println("Прочитайте условие еще раз ");
            System.out.println("и запустите программу заново");

        }
    }
}