/*
 By Hrithik Shah
 Date: July 18, 2016
 Title: Unit 3 Assignment 3
 Purpose: Converting different units of measurement
 */
public class U3A3
{
  
  public static void main (String[] args)
  {
    U3A3converter ();
  }
  
  
  public static void U3A3converter ()
  {
    // Title
    System.out.println ("Linear Conversion\n");
    
    // conversion choices
    System.out.println ("1. Inches to Centimetres \n2. Centimetres to Inches \n3. Feet to Centimetres \n4. Centimetres to Feet \n5. Yards to Metres \n6. Metres to Yards \n7. Miles to Kilometres \n8. Kilometres to Miles");
    
    // input conversion choice
    int choice = IBIO.inputInt ("Enter conversion choice (1-8): ");
    
    // catch errors
    while (choice < 1 || choice > 8)
    choice = IBIO.inputInt ("Error. Please try again. \nEnter conversion choice (1-8): ");
    
    // input value
    double value = IBIO.inputDouble ("Enter value to be converted: ");
    
    // save user value into a variable
    double valuebeforeconversion = value;
    
    // units for final statement
    String unit1, unit2;
    
    // calculations 
    if (choice == 1)
    {
    value *= 2.54;
    unit1 = "inches";
    unit2 = "centimetres";
    }
    else if (choice == 2)
    {
      value /= 2.54;
      unit1 = "centimetres";
        unit2 = "inches";
    }
    else if (choice == 3)
    {
      value *= 30;
      unit1 = "feet";
      unit2 = "centimetres";
    }
    else if (choice == 4)
    {
      value /= 30;
      unit1 = "centimetres";
      unit2 = "feet";
    }
    else if (choice == 5)
    {
      value *= 0.91;
      unit1 = "yards";
      unit2 = "metres";
    }
    else if (choice == 6)
    {
      value /= 0.91;
      unit1 = "metres";
      unit2 = "yards";
    }
    else if (choice == 7)
    {
      value *= 1.6;
      unit1 = "miles";
      unit2 = "kilometres";
    }
    else 
    {
      value /= 1.6;
      unit1 = "kilometres";
        unit2 = "miles";
    }
    
    // final statement
    System.out.println (valuebeforeconversion + " " + unit1 + " = " + value + " " + unit2);
    
  }
  
}
  
