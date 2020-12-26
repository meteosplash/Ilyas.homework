package ilyastask10;

public class Main {
    public static void main(String[] args) {
        int s= 3;
        int i = 5;
        double u = (Math.pow(s,2))+ (Math.pow(i,2));
        double h = (Math.pow(s,2))- (Math.pow(i,2));
        double e= (Math.pow(s,2))* (Math.pow(i,2));
        double t = (Math.pow(i,2))/ (Math.pow(s,2));

                System.out.println("Сумма квадратов 3 и 5 = "+ u);
        System.out.println("Разность квадратов 3 и 5 = "+ h);
        System.out.println("Произведение квадратов 3 и 5 = "+ e);
        System.out.println("Частное квадратов 5 и 3 = "+ t);
    }
}

