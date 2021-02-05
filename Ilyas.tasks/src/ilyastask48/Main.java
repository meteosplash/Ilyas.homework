package ilyastask48;

public class Main {
    public static void main(String[] args) {
        int n = 7;
        int k = 2;
        int ch = 0;
        while(n>=k) {
            ch++;
            n-=k;
        }
        System.out.println("chastnoe= "+ch+" a ostatok= "+n);
    }
}
