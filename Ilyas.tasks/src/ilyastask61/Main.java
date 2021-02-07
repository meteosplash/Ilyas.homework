package ilyastask61;

public class Main {
    public static void main(String[] args) {
     int array1[] = new int[9];
     int a=1;
     for(int i=0;i<9;i++){
         array1[i]=a;
         a+=2;
     }
        for(int i=0;i<9;i++){
            System.out.println("Элемент["+i+"]: "+ array1[i]);
        }
    }
}
