package ilyastask11;

public class Main {
    public static void main(String[] args) {
        double r = 14;
        double k = 11;
        double u = Math.abs(r)/Math.abs(k);
        double j = (Math.abs(r) + Math.abs(k));
        System.out.println("Cумма = " + j);
        System.out.println("Разность = "+ ((Math.abs(r))- (Math.abs(k))));
        System.out.println("Произведение = "+ Math.abs(r)* Math.abs(k));
        System.out.println("Частное = "+ u);

    }
}
