/*
 By Hrithik Shah
 Date: August 16, 2016
 Title: Recursion
 Purpose: learning how to do recursion
 */

import java.util.Scanner; // imports scanner
import java.util.ArrayList; // imports ArrayList
import java.util.*;

public class Recursion
{
  Scanner scan = new Scanner (System.in);
  public static void main (String[] args)
  {
    new Recursion ();
  }
  
  
  public Recursion ()
  {
    /*// Title
    System.out.println ("Fibonacci Numbers");
    System.out.println ("\n\nThe first nine Fibonacci numbers are: 1, 1, 2, 3, 5, 8, 13, 21, 34");
    // ask user for fibonnaci term
    System.out.println ("\nEnter the Fibonacci term you would like to see: ");
    int fibnuminput = scan.nextInt (); // get input
    // call fibonacci function
    int fibnum = fibonacci (1,1,0,2,fibnuminput);
    // output
    System.out.println ("Fibonacci number "+fibnuminput+" is "+fibnum);
    
    // Title
    System.out.println ("\n\nn Choose r");
    System.out.println ("This program calculates the number of ways r different objects can be chosen from a set of n objects.");
    // ask user for input
    System.out.println ("Enter the amount of objects to choose: ");
    int choose = scan.nextInt ();
    System.out.println ("Enter the amount of objects to choose from: ");
    int choosefrom = scan.nextInt ();
    int ways = nchooser (choose,choosefrom);
    System.out.println ("There are "+ways+ " ways.");
    
    // Title
    System.out.println ("\n\nFraction Reducer");
    System.out.println ("Enter the numerator: ");
    int num = scan.nextInt ();
    System.out.println ("Enter the denominator ");
    int den = scan.nextInt ();
    String frac = fraction (num, den);
    System.out.println ("The reduced fraction is "+frac);*/
    
    // Challenge
    System.out.println ("Enter a string: ");
    String input = scan.nextLine ();
    String finalString = challenge (input, input.length (), "", "");
    System.out.println (finalString);
  }
  
  public String challenge (String input, int length, String temp, String reverse)
  {
    if (length == 0)
      return reverse;
    else
    {
      temp = Character.toString (input.charAt (--length));
      reverse = reverse + temp;
      return challenge (input, length, temp, reverse);
    } 
  }
  
  public int fibonacci (int f1, int f2, int sum, int counter, int input)
  {
    if (counter == input)
    {
       return sum;
    }
    else {
      sum = f1 + f2;
      f1 = f2;
      f2 = sum;
      counter++;
      return fibonacci(f1,f2,sum,counter,input);
    }
    // debugging
    // System.out.println (sum);
   
  }
  
  public int nchooser (int choose, int choosefrom)
  {
    int numerator = factorial(choosefrom, choosefrom);
    int denom1 = factorial(choose,choose);
    int denom2 = factorial(choosefrom - choose, choosefrom-choose);
    
    return numerator / (denom1 * denom2);
  }
  
  public int factorial (int prod, int count)
  {
    if (count == 1) // make sure it doesnt go to zero
      return prod;
    else 
    {
      count--;
      return factorial(prod * count, count);
    }
    
  }
  
  public String fraction (int num, int den)
  {
    int count = 0;
    if (num > den)
      count = den;
    else 
      count = num;
    
    if (num == 0)
      return String.valueOf (0);
    
    // recursive
    int todivide = reduce (num,den,count);
    if (todivide > 1)
    {
      num = num / todivide;
      den = den / todivide;
    } 
    String reducedfraction = String.valueOf (num) + "/" + String.valueOf (den);
    return reducedfraction;
  }
  
  public int reduce (int num, int den, int count)
  {
    if (count == 1) // make sure x is not zero cannot have 0 as denominator/numerator
      return count;
    else
    {
      if (num % count == 0 && den % count == 0)
        return count;
      else 
      {
        count--;
        return reduce (num, den, count);
      }
        
    }
  }
  
  
}