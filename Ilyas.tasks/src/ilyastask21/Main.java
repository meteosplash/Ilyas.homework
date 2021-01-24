package ilyastask21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите 2  целых числа");
        Scanner top = new Scanner(System.in);
        int number = top.nextInt();
        int number2 = top.nextInt();
        // условие: если второе число больше
        if(number2>number) {
            System.out.println("Большее число -  " + number2);
        }
        // условие: если первое число больше
        if(number>number2) {
            System.out.println("Большее число - " + number);
        }
    }
}
