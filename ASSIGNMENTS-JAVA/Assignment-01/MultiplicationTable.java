//Multiplication Table

package assignment1;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String args[])
	  {
              int n,i;
              Scanner input =new Scanner(System.in);
              System.out.print("Please enter a number: ");
              n =input.nextInt();
              for(i=1;i<=10;i++) 
              {
                  System.out.println(n+" x "+i+" = "+n*i+"");
              }
              
          }
}
