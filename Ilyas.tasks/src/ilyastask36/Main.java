package ilyastask36;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner candy = new Scanner(System.in);
        System.out.println("Килограмм конфет стоит: ");
        double buy = candy.nextDouble();
        System.out.println("рублей");
        int kg;
        double sout = 1;
        for(kg = 10;kg<=20;kg+=2){
            System.out.println(sout+" Кг конфет стоит - "+(buy*sout)+" рублей");
            sout+=0.2;
        }
    }
}
