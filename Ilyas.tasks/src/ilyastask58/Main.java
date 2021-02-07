package ilyastask58;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter number A");
        Scanner while13 = new Scanner(System.in);
        int a = while13.nextInt();
        int one, k,sum;
        k= 1;
        one=1;
        sum = 0;
        while(sum>a){
            one/=k;
            sum+=one;
            k++;
        }
        System.out.println("K = "+k+" ,amount = "+sum);
    }
}
