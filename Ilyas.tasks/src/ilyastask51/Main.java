package ilyastask51;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner while6 = new Scanner(System.in);
        int n = while6.nextInt();
        int k = 2;
        int k2 = 1;
        if (n%2<0.5) {
            while (k <= n) {
                n *= k;
                k+=2;
            }
            }
            else{
                n*=k2;
                k2+=2;
            }
        System.out.println("N!! = "+ n);
        }
    }
