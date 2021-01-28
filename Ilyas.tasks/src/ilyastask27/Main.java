package ilyastask27;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите 3 числа ");
        Scanner task = new Scanner(System.in);
        double a = task.nextDouble();
        double b = task.nextDouble();
        double c = task.nextDouble();
        if (a < b & a < c) {
            System.out.println("1-e число меньшее");
        }
        else if (b < a & b < c) {
            System.out.println("2-e число меньшее");
        }
        else if (c < b & c < a) {
            System.out.println("3-e число меньшее");
        }
        else{
                System.out.println("Наименьшего числа нет");
            }
        }
    }