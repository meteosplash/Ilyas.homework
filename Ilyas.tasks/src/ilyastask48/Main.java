package ilyastask48;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter whole positive numbers");
        Scanner while3 = new Scanner(System.in);
        int n = while3.nextInt();
        int k = while3.nextInt();
        int ch = 0;
        while(n>=k) {
            ch++;
            n-=k;
        }
        System.out.println("Chastnoe= "+ch+", a ostatok= "+n+".");
    }
}
