package ilyastask49;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter whole positive numbers" );
        Scanner while4 = new Scanner(System.in);
        int n = while4.nextInt();
        int a = 3;
            while(a<n) {
                a*=3;
            }
                if(a==n){
                    System.out.println("TRUE");
                }
                else{
                    System.out.println("FALSE");
                }
            }

    }

