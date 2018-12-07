/*
 By Hrithik Shah
 Date: August 4, 2016
 Title: Sleep Calculator
 Purpose: Learn methods such as Date and Calender
 */

// import all required methods
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import java.text.ParseException;
//import java.lang.Math.toIntExact;
import java.util.Scanner; // imports scanner

public class sleepcalculator
{
  
  public static void main (String[] args)
  {
    new sleepcalculator ();
  }
  
  
  public sleepcalculator ()
  {
    // Scanner
    Scanner scan = new Scanner (System.in);
    
    // get input for birthdate 
    System.out.println ("Please enter your birthdate: Day? ");
    int bday = scan.nextInt ();
    System.out.println ("Please enter your birthdate: Month(#)? ");
    int bmonth = scan.nextInt ();
    System.out.println ("Please enter your birthdate: Year? ");
    int byear = scan.nextInt ();
    String birthday = "";
    birthday = Integer.toString(byear) + "/" + Integer.toString(bmonth) + "/" + Integer.toString(bday);
    System.out.println ("Your birthday is on: "+birthday);
    
    // gets current date and outputs
    DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
    Date curdate = new Date ();
    System.out.println ("Today's date is: "+ df.format(curdate)); 
    
    // convert String to Date
    Date date1 = new Date ();
    try 
    {
        date1 = df.parse(birthday);
    } catch (ParseException e) 
    {
        e.printStackTrace();
    }

    // get number of days between two dates
    Date date2 = curdate;
    long days = (date2.getTime () - date1.getTime ());
    System.out.println ("Amount of Days you have lived (excluding today): " + TimeUnit.DAYS.convert(days, TimeUnit.MILLISECONDS));
    
    // calculate amount of sleep
    int d = (int) TimeUnit.DAYS.convert(days, TimeUnit.MILLISECONDS);// converts long to day
    long shours = d * 8; // hours per day of sleep
    System.out.println ("You have slept for: "+shours+" hours.");
  }
  
}
  
