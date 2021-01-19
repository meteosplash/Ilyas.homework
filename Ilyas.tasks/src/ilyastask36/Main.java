package ilyastask36;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner candy = new Scanner(System.in);
        System.out.println("Килограмм конфет стоит: ");
        double buy = candy.nextDouble();
        System.out.println("рублей");
        double kg;
        for(kg = 1.2;kg<=2;kg+=0.2){
            System.out.println(kg+" Кг конфет стоит - "+(buy*kg)+" рублей");
        }
    }
}
