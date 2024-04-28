//Pattern printing.
package assignment1;

public class PatternNumbers {
	
   static void print(int n)
   {
       int i, j,num;
       for(i=0; i<n; i++) // outer loop for rows
       {
           num=1;
           for(j=0; j<=i; j++) // inner loop for rows
           {
               System.out.print(num+ " ");
               num++;
           }
           System.out.println();
       }
   }
   public static void main(String args[])
   {
       int n=10;
       print(n);
   }
}
