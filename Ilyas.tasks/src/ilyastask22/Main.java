package ilyastask22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите 2 целых числа");
        Scanner tulyak = new Scanner(System.in);
        int x = tulyak.nextInt();
        int y  = tulyak.nextInt();
        if(x>y) {
            System.out.println("Порядковый номер меньшего числа - 2");
        }
            if(y>x){
                System.out.println("Порядковый номер меньшего числа - 1");
        }
    }
}
