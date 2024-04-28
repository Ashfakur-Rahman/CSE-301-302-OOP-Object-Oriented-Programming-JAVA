//Factorial of a number (using constructor).
package assignment1;
import java.util.Scanner;
class Test {
    int number, fact=1;
    Scanner input = new Scanner(System.in);
    Test() {
        System.out.print("Please enter a positive number: ");
        number = input.nextInt();
    }
    void  func() {
        if(number==0)
            System.out.println(number+"! = 1");
        else
        {
            for(int i=number;i>0;i--)
            {
                fact=fact*i;
            }
            System.out.println(number+"! = "+fact);
        }
    }
}
public class Factorial {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.func();
    }
}