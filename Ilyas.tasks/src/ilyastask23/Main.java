package ilyastask23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите 2 целых числа");
        Scanner top = new Scanner(System.in);
        int x = top.nextInt();
        int y = top.nextInt();
        if(x>y){
            System.out.println(x+ " большее число, меньшее число "+ y);
        }
        if(y>x){
            System.out.println(y + " большее число, меньшее число " + x);
        }
    }
}
