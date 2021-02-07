package ilyastask62;

public class Main {
    public static void main(String[] args) {
        int array2[] = new int[7];
        int a=0;
        int b=2;
        int c = 2;
        for(int i=0;i<=7;i++){
            b*=c;
            array2[a]=b;
            a++;
            System.out.println("Array ["+i+"] = "+b);
        }
    }
}
