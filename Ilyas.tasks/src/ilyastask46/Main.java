package ilyastask46;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner while1 = new Scanner(System.in);
        int a = while1.nextInt();
        int b = while1.nextInt();
        int c = 50;
        int d = 7;
        int  sum = 0;
        while(d<=c){
            d+=d;
            System.out.println(""+d);
        }
    }
}
