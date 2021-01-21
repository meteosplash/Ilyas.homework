package ilyastask37;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Введите 2 целых числа");
        int a = number.nextInt();
        int b = number.nextInt();
        int end=0;
       for(int i = a;i<=b;i++){
           end+=i;

       }
        System.out.println("Сумма чисел от "+a+" до "+b+" = "+end);
    }

}
