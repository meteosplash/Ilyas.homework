package ilyastask16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите положительное число ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        if (a > 0) {
            a++;
        }
        System.out.println(a + " - это ваше число увеличенное на 1");
    }
}