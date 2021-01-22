package ilyastask43;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Кол-во слагаемых с чередующимся знаком");
        System.out.println("= ");
        Scanner dekr = new Scanner(System.in);
        int n = dekr.nextInt();
        double sum = 0;
        for (double i =1;i<=n;i++){
            sum+= Math.pow(-1,i+1)*(1+i/10);
            System.out.println(""+sum);
        }
    }
}
