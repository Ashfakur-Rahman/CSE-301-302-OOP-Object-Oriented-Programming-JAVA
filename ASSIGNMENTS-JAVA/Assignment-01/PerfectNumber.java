//Perfect Number.
package assignment1;
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        int num,sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a positive integer: ");
        num = input.nextInt();
        for(int i = 1; i<num; i++)
        {
            if(num % i == 0)
            {
                sum = sum + i;
            }
        }
        if(sum == num)
        {
            System.out.println("Yes! "+num+" is a Perfect Number.");
        }
	else
        {
            System.out.println("No! "+num+" is not a Perfect Number.");
        }
    }
}

