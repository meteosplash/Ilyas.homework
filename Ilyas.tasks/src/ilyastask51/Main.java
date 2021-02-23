package ilyastask51;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter number ");
        Scanner while6 = new Scanner(System.in);
        int n = while6.nextInt();
        int nka = n;
        while (nka>2){
            nka-=2;
            n*=nka;
        }
        System.out.println("N!! = "+ n);
        }
    }
