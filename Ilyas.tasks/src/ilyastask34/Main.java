package ilyastask34;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner candy = new Scanner(System.in);
        System.out.println("Килограмм конфет стоит: ");
        int buy = candy.nextInt();
        System.out.println("рублей");
        int kg;
        for(kg = 1;kg<=10;kg++){
            System.out.println(kg+" Кг конфет стоит - "+buy*kg+" рублей");
        }
    }
}
