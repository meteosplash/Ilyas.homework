package ilyastask25;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите 2 целых числа");
        Scanner top = new Scanner(System.in);
        int x = top.nextInt();
        Scanner top2 = new Scanner(System.in);
        int y = top2.nextInt();
        if(x!=y){
            x=x+y;
            y=x;
            System.out.println("Cумма чисел = "+ x);
        }
        if(x==y){
            x=0;
            y=0;
            System.out.println(" Новые значения равны " +y +" "+x);
        }

    }
}
