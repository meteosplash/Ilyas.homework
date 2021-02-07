package ilyastask55;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner while10 = new Scanner(System.in);
        int n = while10.nextInt();
        int k = 1;
        while(k*3<=n)
            k++;
        k--;
        System.out.println(""+k);
    }
}
