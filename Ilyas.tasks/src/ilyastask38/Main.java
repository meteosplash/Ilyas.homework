package ilyastask38;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner number = new Scanner(System.in);
            System.out.println("Введите 2 целых числа ");
            int a = number.nextInt();
            int b = number.nextInt();
            int end=1;
            for(int i = a;i<=b;i++){
                end*=i;
            }
            System.out.println("Произведение целых чисел от "+a+" до "+b+" = "+end);
    }
}
