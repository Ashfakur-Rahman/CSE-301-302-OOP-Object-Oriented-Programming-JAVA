//Prime Number (using constructor).

package assignment1;
import java.util.Scanner;

class optional {
    int number,count=0;
    Scanner input = new Scanner(System.in);
   
    optional() {
        System.out.print("Please enter a positive number: ");
        number = input.nextInt();
    }
    
    void func() {
        if(number==0||number==1)
        System.out.println("No! "+number+" is not a Prime Number.");
        else if(number>=2) 
        {
            for(int i = 2; i <number; i++)
            {
                if(number%i==0)
                {
                    count++;
                    break;
                }
            }
            if(count==0)
                System.out.println("Yes! "+number+" is a Prime Number");
            else
                System.out.println("No! "+number+" is not a Prime Number.");
        }
    }
}

public class PrimeCheck {
    public static void main(String args[]) {
        optional prime = new optional();
        prime.func();
    }
}