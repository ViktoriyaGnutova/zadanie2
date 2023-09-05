import java.util.Scanner;

public class red {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Введите значение a: ");
        int a= in.nextInt();
        System.out.print("Введите значение b: ");
        int b=in.nextInt();
        a=b+a;
        b=a-b;
        a=a-b;
        System.out.println("a="+a+"\n"+"b="+b);
    }
}