package ilyastask13;

public class Main {
    public static void main(String[] args) {
        short r1 = 9;
        short r2 = 7;
        double pi = 3.14;
        double s1= (Math.pow(r1,2))* pi;
        double s2= (Math.pow(r2,2))* pi;
        double s3= (Math.pow(r1,2))* pi - (Math.pow(r2,2))* pi;
        System.out.println("S1= "+s1);
        System.out.println("S2= "+s2);
        System.out.println("S3= "+s3);
    }
}
