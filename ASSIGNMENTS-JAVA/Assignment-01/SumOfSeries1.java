//1 + 2 + 3 + . . . . . . + n
package assignment1;
import java.util.Scanner;
public class SumOfSeries1 {
    public static void main(String args[]){
        int sum = 0;
        System.out.print("Please enter the last number of your series(n): ");
        Scanner input= new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i<=n; i++)
        {
            sum = sum +i;
        }
        System.out.println("Sum of 1 to "+n+" = "+sum);
    }
}



