/*
 By Hrithik Shah
 Date: July 18, 2016
 Title: Quiz 2 Ver B Assignment
 Purpose: Playing with Integers
 */

import java.util.Scanner;

public class Q2VB
{
  
  public static void main (String[] args)
  {
    Q2VBint ();
  }
  
  
  public static void Q2VBint ()
  {
    // Scanner that scans system for errors
    Scanner scan = new Scanner(System.in);
    
    // input
    int int1 = IBIO.inputInt ("Enter an integer: ");
     
    // save integer for final statement
    int integer = int1;
    
    // find number of digits
    int ndigits = String.valueOf(int1).length();
    
    // loop to separate digits and find sum of digits
    int sum = 0;
    int toadd = 0;
    
    while (int1 > 0)
    {
      toadd = int1 % 10; // will give remainder (last digit)
      int1 = int1 / 10; // will take out last digit
      sum += toadd;  // last digit added to sum
    }
    
    // final statement
    System.out.println (integer + " was the inputted integer. \nThe number of digits in this integer is "+ndigits+".\nThe sum of the digits is "+sum+ ".");
  }
  
}
  
