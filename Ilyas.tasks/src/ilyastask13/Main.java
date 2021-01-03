package ilyastask13;

public class Main {
    public static void main(String[] args) {
        short r1 = 9;
        short r2 = 7;
        int sqr = 2;
        double pi = 3.14;
        double s1= (Math.pow(r1,sqr))* pi;
        double s2= (Math.pow(r2,sqr))* pi;
        double s3= (s1 - s2);
        System.out.println("S1= "+s1);
        System.out.println("S2= "+s2);
        System.out.println("S3= "+s3);
    }
}
