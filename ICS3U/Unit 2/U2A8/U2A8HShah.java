/*
 By Hrithik Shah
 Date: July 15, 2016
 Title: Unit 2 Assignment 8
 Purpose: Determining the ideal weight of a human depending on height.
 */

public class U2A8HShah
{
  
  public static void main (String[] args)
  {
    U2A8idealweight ();
  }
  
  public static void U2A8idealweight ()
  {
    
    // title
    System.out.println (" IDEAL WEIGHT CALCULATOR \n");
    
    double weight; // will be used later in code.
    String unit; // will be used later in code.
    
    // input
    String name = IBIO.inputString ("What is your name?  ");
    char sofm = IBIO.inputChar ("System of Measure: (M)etric or (I)mperial  ");
    
    sofm = Character.toUpperCase (sofm); // in case user inputs lower case M or I.
    
    // catching errors in system of measure input
    while (sofm != 'M' && sofm != 'I')
    {
      System.out.println ("\nPlease choose a system of measure, by typing either a M for metric or I for imperial");
      sofm = IBIO.inputChar ("System of Measure: (M)etric or (I)mperial  ");
      sofm = Character.toUpperCase (sofm);
    }
    
    double height = IBIO.inputDouble ("Height in metres (for Metric) or inches (for Imperial):  ");
    
    // rounded heights of the tallest and shortest person in the world used to catch errors in height input
    while (height > 3 && sofm == 'M' || height < 0.50 && sofm == 'M' || height < 21 && sofm == 'I' || height > 118 && sofm == 'I')
    {
      System.out.println ("\nThere is an error with the inputted height. Please try again.");
      if (sofm == 'M')
        height = IBIO.inputDouble ("Height in metres:  ");
      else
        height = IBIO.inputDouble ("Height in inches:  ");
    }
    
    // calculations
    if (sofm == 'M')
    {
      weight = Math.round ((height * height * 25) * 100.0) / 100.0 ;
      unit = "kg"; // for final statement
    }
    else
    {
      weight = Math.round ((height * height * 25 / 703) * 100.0) / 100.0;
      unit = "lbs"; // for final statement
    }
    
    
    // final statement
    System.out.println ("\n" + name+ "'s ideal weight is "+weight+ " " +unit + ".");
    
  }
  
}

