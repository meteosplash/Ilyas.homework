package ilyastask60;

public class Main {
    public static void main(String[] args) {
        int k;
        double sal=1000;
        //p=20%
        double p = 1.2d;
        k=0;
        while (sal<1000){
            sal*=p;
            k++;
        }
        System.out.println(""+sal);
    }
}
