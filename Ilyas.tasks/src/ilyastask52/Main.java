package ilyastask52;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter number N");
        Scanner while7 = new Scanner(System.in);
        int n = while7.nextInt();
        int schet = 0;
        int k = 1;
        while (schet<=n){
            k++;
            schet = k*k;
        }
        System.out.println(""+k);
    }
}
