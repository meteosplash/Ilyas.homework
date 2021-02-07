package ilyastask57;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter number N");
        Scanner while12 = new Scanner(System.in);
        int n = while12.nextInt();
        int s = 0;
        int k = 0;
        while (s<=n){
            s+=k;
            k++;
        }
        System.out.println("K = "+k+" and amount = "+s);
    }
}
