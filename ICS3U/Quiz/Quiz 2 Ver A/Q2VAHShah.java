/*
 By Hrithik Shah
 Date: July 18, 2016
 Title: Quiz 2 Ver A Assignment
 Purpose: Squarerooting or Squaring numbers based on input
 */

public class Q2VAHShah
{
  
  public static void main (String[] args)
  {
    Q2VAsquare ();
  }
  
  
  public static void Q2VAsquare ()
  {
    // input
    double number = IBIO.inputDouble ("Enter a number: ");
    // operation
    String operation;
    
    
    // if statement to either square or root the number and what operation was used. Number was also rounded to two decimal places so that it looks elegant. Answers should not be several digits after the decimal long.
    if (number > 10)
    {
      number = Math.sqrt (number);
      operation = "square rooted";
      number = Math.round (number * 100.0) / 100.0;
    }
    else
    {
      number *= number;
      operation = "squared";
    }
        
    // final statement (output)
    System.out.println ("\nYour number was "+operation+" and the result was "+number+".");
    
  }
  
}

