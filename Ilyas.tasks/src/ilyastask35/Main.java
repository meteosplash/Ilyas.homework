package ilyastask35;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner candy = new Scanner(System.in);
        System.out.println("Килограмм конфет стоит: ");
        double buy = candy.nextDouble();
        System.out.println("рублей");
        double kg;
        for(kg = 1;kg<=10;kg++){
            System.out.println(kg/10+" Кг конфет стоит - "+(buy*kg)/10+" рублей");
        }
    }
}

