import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        System.out.print("Enter the Number : ");

        int number=in.nextInt() , og=number;
        int sum=0;  //This variable stores the sum of digits

        while(number!=0){   //This condition works with both +ve and -ve number
            sum=sum + (number%10);
            number/=10;
        }

        System.out.print("Sum of Digits of "+og+ " is "+ sum);
    }
}
