//Fibonacci Series
package assignment1;
import java.util.Scanner;
class FiboTest {
    int n1,n2,n3,limit;
    FiboTest(int n)
    {
        limit = n;
        n1=0;
        n2=1;
    }
    void series()
    {
        System.out.println("The Fibonacci Series up to "+ limit +" are:");
        System.out.print(n1+" "+n2+" ");
        int i;
        for(i=3;i<=limit;i++)
        {
            n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }
        System.out.println("");
    }
}
public class Fibonacci {
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.print("How many Fibo numbers do you want?: ");
        int n = input.nextInt();
        FiboTest fb= new FiboTest(n);
        fb.series();
    }
}