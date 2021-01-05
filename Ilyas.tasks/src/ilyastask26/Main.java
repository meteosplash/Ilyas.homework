package ilyastask26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner top = new Scanner(System.in);
        int x = top.nextInt();
        Scanner top2 = new Scanner(System.in);
        int y = top2.nextInt();
        if(x!=y){
            if(x>y){
                y=x;
                System.out.println("Большее значение = "+ y);
            }
            if(y>x){
                x=y;
                System.out.println("Большее значение = "+ y);
            }
        }
        if(x==y){
            x=y=0;
            System.out.println("Новое значение = "+ y);
        }
    }
}
