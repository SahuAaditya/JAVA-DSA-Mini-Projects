import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number : ");

        int number = in.nextInt();
        long fact=1L; //This'll store the factorial

        for (int i = 1; i <=number; i++) {
            fact*=i;
        }

        System.out.print("Factorial of "+ number + " is " + fact);
    }
}
