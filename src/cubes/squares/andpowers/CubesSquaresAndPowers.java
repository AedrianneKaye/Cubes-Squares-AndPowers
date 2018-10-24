/*
 * Aedrianne Malawis
 * Cubes, Squares, And Squares
 * October 24,2018
 */

package cubes.squares.andpowers;

import java.util.Scanner;

/**
 *
 * @author aemal4075
 */
public class CubesSquaresAndPowers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyedInput = new Scanner (System.in);
        
        int choice = 0;
        int num = 0;
        int userchoice; 
        double power;
        double usernum;
        
        
            System.out.println("----Cubes, Squares, and Power----");
            System.out.println("");
            
            System.out.println("Please Enter Your Choice");
            System.out.println("1...");
            System.out.println("2...");
            System.out.println("3...");
            System.out.println("4...");
        
            choice = keyedInput.nextInt();
            
        do
        {
            if (choice == 1)
            {
             System.out.println("Enter a number.");   
             num = keyedInput.nextInt();
             
             {
               System.out.println("The square of the number you enter is " + num * num);  
             }
            }
           
            
            if (choice == 2)
            {
                System.out.println("Enter a number."); 
              num = keyedInput.nextInt();
           
              {
                  System.out.println("The cubed of the number you enter is " + (num * num * num)); 
              }
               
            }
            
            
            if (choice == 3)
            {
              System.out.println("Enter a number."); 
              num = keyedInput.nextInt();
              System.out.println("Enter on what exponent would you like your number would be."); 
              power = keyedInput.nextInt();
              
              {
                  System.out.println("the number raised to its power is " + java.lang.Math.pow(num, power));
              }
            }
            
        }
        while (choice != 4);
        {System.out.println("You have chosen to Exit.Goodbye! "); 
        
        }
    }
    
}
