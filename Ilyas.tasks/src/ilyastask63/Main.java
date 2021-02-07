package ilyastask63;

public class Main {
    public static void main(String[] args) {
        int a,d,c,e;
        int array3[]= new int[9];
        a=3;
        d=2;
        e=1;
        for(int i =0;i<9;i++){
            c=a+d*e;
            e++;
            array3[i]=c;
            System.out.println(""+c);
        }
    }
}
