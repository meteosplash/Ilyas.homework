package ilyastask52;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter number n");
        Scanner while7 = new Scanner(System.in);
        int n = while7.nextInt();
        int k = 1;
        while (k*k>n){
            k++;
        }
        System.out.println(""+k);
    }
}
