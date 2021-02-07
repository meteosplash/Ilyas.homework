package ilyastask54;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter number N");
        Scanner while9 = new Scanner(System.in);
        int n= while9.nextInt();
        int k = 1;
        while(3*k<=n){
            k++;
        }
        System.out.println("k= "+k);
    }
}
