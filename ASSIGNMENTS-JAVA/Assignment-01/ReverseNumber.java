//Reverse of a number.
package assignment1;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String args[]) {
        int num,rem,temp,sum=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter a number: ");
        num = input.nextInt();
        temp=num;
        while( temp!= 0 ) 
        {
            rem= temp % 10;
            sum = sum*10 + rem;
            temp = temp/10;
        }
        System.out.println("Reverse of "+num+" = "+sum);
    }
}
