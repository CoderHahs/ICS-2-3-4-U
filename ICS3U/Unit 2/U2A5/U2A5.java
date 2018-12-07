/*
 By Hrithik Shah
 Date: July 14, 2016
 Title: Unit 2 Assignment 5
 Purpose: To guess numbers, Displaying hurricane category info, Calculating discount on purchases.
 */

import java.text.DecimalFormat;

public class U2A5
{
  
  public static void main (String[] args)
  {
    U2A5guessinggame ();
    U2A5hurricane ();
    U2A5sale ();
  }
  
  
  public static void U2A5guessinggame ()
  {
    System.out.println ("Guessing Game");
    System.out.println ("A number has been chosen between 1 and 100");
    int a = IBIO.inputInt ("What is your guess? ");
    int n = (int) (Math.random () * 100 + 1);
    int end = 0;
    
    while (end == 0)
    {
      while (a < 1 || a > 100)
      {
        // used to solve user input errors
        System.out.println ("\nSorry wrong input. Try again.");
        a = IBIO.inputInt ("What is your guess? ");
      }
      while (a > 1 && a < 100 && end == 0)
      {
        // Calculations for hints
        if (a < n && n - a > 50)
        {
          System.out.println ("Higher, Freezing");
        }
        else if (a > n && a - n > 50)
        {
          System.out.println ("Lower, Freezing");
        }
        else if (a < n && n - a > 25)
        {
          System.out.println ("Higher, Cold");
        }
        else if (a > n && a - n > 25)
        {
          System.out.println ("Lower, Cold");
        }
        else if (a < n && n - a > 15)
        {
          System.out.println ("Higher, Cool"); 
        }
        else if (a > n && a - n > 15)
        {
          System.out.println ("Lower, Cool");
        }
        else if (a < n && n - a > 10)
        {
          System.out.println ("Higher, Warm");
        }
        else if (a > n && a - n > 10)
        {
          System.out.println ("Lower, Warm");
        }
        else if (a < n && n - a > 5)
        {
          System.out.println ("Higher, Hot");        
        }
        else if (a > n && a - n > 5)
        {
          System.out.println ("Lower, Hot");        
        }
        else if (a < n && n - a < 5)
        {
          System.out.println ("Higher, Boiling");        
        }
        else if (a > n && a - n < 5)
        {
          System.out.println ("Lower, Boiling");        
        }
        else if (a == n)
        {
          System.out.println ("You got it!");
          end = 1;
        }
        if (end == 0)
          a = IBIO.inputInt ("\nWhat is your new guess? ");
      }
    }
    System.out.println ("\n\n");
  }
  
  public static void U2A5hurricane ()
  {
    //user input
    int category = IBIO.inputInt ("Please enter a hurricane category: ");
    String info = "";
    int fin = 0;
      
    while (fin == 0)
      switch (category)
    {
      case 1:
        info = "74-95 mph or 64-82 kt or 119-153 km/hr";
        fin = 1;
        break;
      case 2:
        info = "96-110 mph or 83-95 kt or 154-177 km/hr";
        fin = 1;
        break;
      case 3:
        info = "111-130 mph or 96-113 kt or 178-209 km/hr";
        fin = 1;
        break;
      case 4:
        info = "131-155 mph or 114-135 kt or 210-249 km/hr";
        fin = 1;
        break;
      case 5:
        info = "greater than 155 mph or 135 kt or 249 km/hr";
        fin = 1;
        break;
      default:
        category = IBIO.inputInt ("Invalid Entry. Try again.\nPlease enter a hurricane category: ");
        break;
    }
    System.out.println ("Windspeeds for Category " + category + " are: \n" + info);
    System.out.println ("\n\n");
  }
  
  public static void U2A5sale ()
  {
    System.out.println ("Super Store Sale");
    double ap = IBIO.inputDouble ("Amount of Purchases: $");
    DecimalFormat two = new DecimalFormat ("#.00"); // to put all numbers to two decimal places
    double dis, pri;
    
    if (ap > 10.00) // since discount is only applied for purchases over $10.00
    {
      // calculations
      dis = ap * 0.1;
      pri = ap - dis;
      // statement
      System.out.println ("Discount Amount $" + two.format (dis));
      System.out.println ("Discounted Price $" + two.format (pri));
    }
    else
    {
      System.out.println ("Discount Amount: $0.00");
      System.out.println ("Discounted Price: $" + two.format (ap));
    }
    
    System.out.println ("\n\n");
  }
}

