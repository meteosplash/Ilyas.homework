package ilyastask53;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter number N");
        Scanner while8 = new Scanner(System.in);
        int n = while8.nextInt();
        int k = 1;
        while (k*k <= (n/(k*k)) ){
            k++;
        }
        System.out.println(""+k);
    }
}
