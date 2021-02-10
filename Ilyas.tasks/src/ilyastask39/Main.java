package ilyastask39;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        int a = scanner.nextInt();

        System.out.print("b: ");
        int b = scanner.nextInt();

        int sum = 0;
        for (int i =a; a <= b; a++) {
            sum+= Math.pow(a, 2);
        }
        System.out.println("Kv sum: " + sum);
    }
}
