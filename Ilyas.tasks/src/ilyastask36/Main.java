package ilyastask36;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner candy = new Scanner(System.in);
        System.out.println("Килограмм конфет стоит: ");
        double buy = candy.nextDouble();
        System.out.println("рублей");
        int kg;
        int some = 0;
        for(kg = 10;kg<=20;kg+=2){
            System.out.println(kg/10+"."+some+" Кг конфет стоит - "+(buy*kg)/10+" рублей");
           some+=2;
           if(some==10)
               some=0;

        }
    }
}
