//1^2 + 2^2 + 3^2 + . . . . + n^2
package assignment1;
import java.util.Scanner;
public class SumOfSeries2 {
    static int n;
    static int sum=0;
    static {
        Scanner input =new Scanner(System.in);
        System.out.print("Please enter the last number of your series(n): ");
        n =input.nextInt();
    }
    static void display() {
        for(int i=1;i<=n;i++)
        {
            System.out.print(i+"^2 ");
            sum =sum+i*i;
        }
        System.out.println("\nSum of squares from 1 to "+n+" = "+sum);
    }
    public static void main(String[] args) {
        SumOfSeries2.display();
    }
}