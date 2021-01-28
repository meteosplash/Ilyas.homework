package ilyastask33;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите A и B");
        Scanner for3 = new Scanner(System.in);
        int b = for3.nextInt();
        int a = for3.nextInt();
        int sum = 0;
        --a;
        for(int i=a;i>b;i--) {
            System.out.println("" + i);
            sum++;
        }
        System.out.println("Количество чисел - "+sum);
        }
    }

