import java.util.Scanner;

public class Fibonacci{
    public static void main(String[]args){

        Scanner in = new Scanner (System.in);
        // User inputs the range of Fibonacci
        System.out.print("Enter the range of Fibonacci series - ");
        int range=in.nextInt();

        System.out.println("Your "+ range + " Fibonacci numbers are --");

        // First two numbers are taken by default
        int a=0 , b=1;
        System.out.println(a);
        System.out.println(b);

        // This'll store the sum of last two numbers of series
        int c=0;

        for (int i = 3; i <=range; i++) {
            c=a+b;
            System.out.println(c);

            a=b;
            b=c;

        }
    }
}