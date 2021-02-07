package ilyastask64;

public class Main {
    public static void main(String[] args) {
        int a,d,e;
        int array4[]= new int[6];
        d=3;
        e=6;
        a=2;
        for(int i =0;i<6;i++){
            e=a*d;
            d*=3;
            array4[i]=e;
            System.out.println("Array "+i+" = "+e);
        }
    }
}
