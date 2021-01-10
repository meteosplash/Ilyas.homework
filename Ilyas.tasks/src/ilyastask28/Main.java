package ilyastask28;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        double a = task.nextDouble();
        double b = task.nextDouble();
        double c = task.nextDouble();
        if (a < b & a > c) {
            System.out.println("1-e число среднее");
        }
           else if (a < c & a > b) {
                System.out.println("1-e число среднее");
        }
        else if (b < a & b > c) {
            System.out.println("2-e число среднее");
        }
        else if (b < c & b > a) {
            System.out.println("2-e число среднее");
        }
        else if (c < b & c > a) {
            System.out.println("3-e число среднее");
        }
        else if (c < a & c > b) {
            System.out.println("3-e число среднее");
        }
        else{
            System.out.println("Среднего числа нет");
        }
    }
}
