package ilyastask39;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        double sum = 1;
        for (double i = a; i <= b; i++) {
            sum+= sum * Math.pow(i, 2);
        }
        System.out.println("Kv sum: " + sum);
    }
}
