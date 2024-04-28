//Sum of Digits.

package assignment1;
import java.util.Scanner;
public class SumOfDigits {
    private static Scanner input;
    public static void main(String[] args) {
        int num,rem,sum=0;
        input =new Scanner(System.in);
        System.out.print("Enter a number: ");
        num=input.nextInt();
        while(num!=0)
        {
            rem = num%10;
            sum = sum+rem;
            num = num/10;
        }
        System.out.println("Sum of the digits = "+sum);
    }
}