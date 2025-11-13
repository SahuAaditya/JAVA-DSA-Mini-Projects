import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner in =new Scanner (System.in);
        System.out.print("Enter Number : ");
        int number = in.nextInt() , og=number;

        System.out.print("Enter target : ");
        int target = in.nextInt();

        int count=0;

        while(number>0){
            int rem=number%10;
            if(rem==target) count++ ;

            number/=10;
        }

        System.out.println("There are "+count+" "+ target+"s in "+og);
    }
}
