package ilyastask44;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число N");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        for (int i = 1;i<=(2*n-1);i+=2){
            sum+=i;
            System.out.println(sum+" - сумма после прибавления чисел: 1,3,5..");
        }
        System.out.println("Квадрат числа N по формуле 1+3+5... +(2N-1) = "+sum);
    }
}
