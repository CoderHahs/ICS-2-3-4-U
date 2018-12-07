/*
 By Hrithik Shah
 Date: July 14, 2016
 Title: Unit 2 Assignment 6
 Purpose: Determining the number of years it will take for an investment to mature, Get oriented with loops.
 */
public class U2A6
{
  
  public static void main (String[] args)
  {
    U2A6CD ();
    U2A6fwl ();
  }
  
  
  public static void U2A6CD ()
  {
    // input
    double ii = IBIO.inputDouble ("Enter initial investment ($): ");
    double air = IBIO.inputDouble ("Enter annual interest rate (%): ");
    double ev = IBIO.inputDouble ("Enter ending value ($): ");
    
    int y = 0; // variable for number of years required
    for (double i = ii ; i <= ev ; i = i + (i * (air / 100))) // used formula here
    {
      y++; // increase years
    }
    System.out.println ("The number of years required is " + y + "."); // final statement
    
    System.out.println ("\n\n");
  }
  
  public static void U2A6fwl ()
  {
    // input 
    int sn = IBIO.inputInt ("Enter a starting number: ");
    int en = IBIO.inputInt ("Enter a ending number: ");
    while (sn - en > 0 || en == sn)
    {
      System.out.println ("Error with numbers inputted. Please input new numbers.");
      sn = IBIO.inputInt ("Enter a starting number: ");
      en = IBIO.inputInt ("Enter a ending number: ");
    }
    for (int i = sn ; i < (en+1) ; i++) // < (en+1) works just like <= en
    {
      System.out.print (i + " "); // output displayed in one line
    }
    
    System.out.println ("\n\n");
  }
}

