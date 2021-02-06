package ilyastask56;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter number N");
        Scanner while10 = new Scanner(System.in);
        int n = while10.nextInt();
        int k = 0;
        int s = 0;
        while(s>=n){
            ++k;
            s+=k;
        }
        System.out.println(""+s);
    }
}
