package ilyastask17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bведите целое число ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>0){
            a++;
        }
        else {
            a=a-2;
        }
        System.out.println("В результате операций введённое число = "+a);
        System.out.println("Условия операций читать в задачнике");
    }
}
