package ilyastask45;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lastfor = new Scanner(System.in);
        int a = lastfor.nextInt();
        int b = lastfor.nextInt();
        int sum = a;
        for (int i = 2;i<=b;i++){
            sum=sum*a;
        }
        System.out.println(a+" в степени "+b+" = "+sum);
    }
}
