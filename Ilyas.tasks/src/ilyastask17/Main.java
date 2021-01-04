package ilyastask17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bведите число ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        if(a>0){
            a++;
        }
        else {
            a=a-2;
        }
        System.out.println("Вы ввели число "+a);
    }
}
