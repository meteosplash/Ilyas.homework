package ilyastask40;

public class Main {
    public static void main(String[] args) {
        //N = 8
        double g = 0;
        int j;
        for (j = 1;j<=8;j++){
            g+=(double)1/j;
            System.out.println(""+(g));
        }
        System.out.println("Сумма 1/1 + 1/2 + 1/N... Где N=8 - "+g);
    }
}

