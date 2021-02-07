package ilyastask59;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter number");
        int a,k,sum,del;
        a = 50;
        sum = 0;
        k=1;
        del=1;
        while (sum+del>a){
            del=1;
            del/=k;
            k++;
            sum+=del;
        }
        System.out.println(""+sum);
    }
}
