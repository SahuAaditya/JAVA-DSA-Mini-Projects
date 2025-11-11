import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {

        Scanner in=new Scanner (System.in);
        System.out.print("Enter the number : ");
        int number = in.nextInt();
        int og=number;

        int ans=0; //Stores the reversed number

        while(number!=0){
            int rem=number%10; //Stores the last digit of number
            ans= (ans*10)+rem;
            number/=10; //Eliminates last digit
        }

        System.out.print("Reversed form of "+ og + " is " + ans);
    }
}
