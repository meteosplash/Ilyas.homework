package ilyastask20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите 3 целых числа через enter");
        Scanner if4 = new Scanner(System.in);
        int a = if4.nextInt();
        int b = if4.nextInt();
        int c = if4.nextInt();
        int pos = 0;
        int neg = 0;
        if(a>0){
            pos++;
        }
        if(a<0)
            neg++;
        if(b>0)
            pos++;
        if(b<0)
            neg++;
        if(c>0)
            pos++;
        if(c<0)
            neg++;
        System.out.println("Количество положительных чисел - "+pos);
        System.out.println("Количество отрицательных чисел - "+neg);
    }
}
