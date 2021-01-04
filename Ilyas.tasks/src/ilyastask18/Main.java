package ilyastask18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число ");
        Scanner top = new Scanner(System.in);
        int number = top.nextInt();
        if(number>0){
            number++;
        }
        if(number<0){
            number= number-2;
        }
        if(number==0){
            number = 10;
        }
        System.out.println("Вы ввели число "+ number);
    }
}
