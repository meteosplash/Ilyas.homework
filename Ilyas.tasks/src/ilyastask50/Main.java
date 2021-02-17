package ilyastask50;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int st;
        System.out.println("Enter number N");
        Scanner while5 = new Scanner(System.in);
        int n = while5.nextInt();
        int a = 2;
        st = 1;
        while(a<n){
            st++;
            a*=2;
        }
        System.out.println("Degree = "+st);
    }
}
