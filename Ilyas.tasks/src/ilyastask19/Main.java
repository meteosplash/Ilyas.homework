package ilyastask19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите 3 целых положительных числа через enter");
        Scanner if4 = new Scanner(System.in);
        int a = if4.nextInt();
        int b = if4.nextInt();
        int c = if4.nextInt();
        int n = 0;
        //c n будет происходить операция инкремента
        //в том операторе где значение - true
        //т.е число положительное
        if(a>0){
            n++;
        }
        if(b>0){
            n++;
        }
        if(c>0){
            n++;
        }
        System.out.println("Количество положительных целых чисел из представленных выше - "+n);
    }
}
