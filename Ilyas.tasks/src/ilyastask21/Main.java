package ilyastask21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите 2 числа");
        Scanner top = new Scanner(System.in);
        int number = top.nextInt();
        Scanner top2 = new Scanner(System.in);
        int number2 = top2.nextInt();
        if(number2>number)
        System.out.println("Большее число -  " +number2);
        if(number>number2)
            System.out.println("Большее число - " +number);
    }
}
