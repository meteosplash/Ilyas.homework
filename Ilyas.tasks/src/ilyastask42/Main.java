package ilyastask42;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Кол-во множителей от 1,1 (+0,1) ...");
        Scanner ft = new Scanner(System.in);
        System.out.println("= ");
        int n = ft.nextInt();
        double obj = 1;
        for (double i =1;i<=n;i++){
            obj=obj*(1+i/10);
        }
        System.out.println("Произведение = "+obj);
    }
}
