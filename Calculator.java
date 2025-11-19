import java.util.Scanner;

public class Calculator {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        double number1= in.nextInt();
        System.out.print("Enter Second Number : ");
        double number2= in.nextInt();

        System.out.print("Enter Operator : ");
        char sign =in.next().charAt(0);

        if(sign=='+') System.out.println("Sum of entered number is : "+ (number1+number2));
        else if (sign=='-') System.out.println("Difference of entered number is : "+ (number1-number2));
        else if(sign=='*')System.out.println("Product of entered number is : "+ (number1*number2));
        else if(sign=='/') System.out.println("Division of entered number is : "+ (number1/number2));
        else if(sign=='%') System.out.println("Remainder of entered number is : "+ (number1%number2));
        else System.out.println("Operator not found !!");
    }
}
