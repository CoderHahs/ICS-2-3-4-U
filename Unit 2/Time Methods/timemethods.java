public class timemethods
{
  public static void main (String args[])
  {
    new timemethods ();
  }
  
  
  public timemethods ()
  {
    int k = IBIO.inputInt ("Enter a number between 1-7. Each number represents a day of the week (1 = Sunday, 2 = Monday ...) . ");
    String s;
    if (k == 1)
      s = "st";
    else if (k == 2)
      s = "nd";
    else if (k == 3)
      s = "rd";
    else 
      s = "th";
    System.out.println ("What is the "+k+""+s+" day of the week? " + weekday (k));
    k = IBIO.inputInt ("\nEnter a number between 1-12. Each number represents a month (1 = January, 2 = February ...) . ");
    if (k == 1)
      s = "st";
    else if (k == 2)
      s = "nd";
    else if (k == 3)
      s = "rd";
    else 
      s = "th";
    System.out.println ("What is the "+k+""+s+" month? " + month (k));
    String m = IBIO.inputString ("\nEnter a month. Make sure capitalisation is correct. ");
    System.out.println ("How many days in "+m+"? " + numDays (m));
    k = IBIO.inputInt ("\nEnter a year. ");
    System.out.println ("Is "+k+" a leap year? " + isLeapYear (k));
    System.out.println ("\nEnter the date. ");
    int a = IBIO.inputInt ("Enter the first two digits of the year: ");
    int b = IBIO.inputInt ("Enter the last two digits of the year: ");
    int c = IBIO.inputInt ("Enter a number between 1-12. Each number represents a month (1 = January, 2 = February ...) . ");
    int d = IBIO.inputInt ("Enter the day of the month: ");                         
    System.out.println ("The day of the week is: " + dayofWeek (d,c,a,b));
  }
  
  
  public String weekday (int n)
  { //returns the name of the day
    //1 == "Sunday", 2=="Monday"
    String dayweek = "Sunday";
    if (n == 2)
      dayweek = "Monday";
    else if (n == 3)
      dayweek = "Tuesday";
    else if (n == 4)
      dayweek = "Wednesday";
    else if (n == 5)
      dayweek = "Thursday";
    else if (n == 6)
      dayweek = "Friday";
    else
      dayweek = "Saturday";
    return dayweek;
  }
  
  
  public String month (int n)
  { //returns month name
    //if n ==1, the name is "January" etc.
    String month = "January";
    if (n == 2)
      month = "February";
    else if (n == 3)
      month = "March";
    else if (n == 4)
      month = "April";
    else if (n == 5)
      month = "May";
    else if (n == 6)
      month = "June";
    else if (n == 7)
      month = "July";
    else if (n == 8)
      month = "August";
    else if (n == 9)
      month = "September";
    else if (n == 10)
      month = "October";
    else if (n == 11)
      month = "November";
    else
      month = "December";
    return month;
  }
  
  
  public int numDays (String month)
  { //returns the number of days in a month - OCTOBER, October, october are all valid input
    //http://www.eudesign.com/mnems/dayspcm.htm
    int daysofmonth = 31;
    if (month.equals ("February"))
      daysofmonth = 28;
    else if (month.equals ("March"))
      daysofmonth = 31;
    else if (month.equals ("April"))
      daysofmonth = 30;
    else if (month.equals ("May"))
      daysofmonth = 31;
    else if (month.equals ("June"))
      daysofmonth = 30;
    else if (month.equals ("July"))
      daysofmonth = 31;
    else if (month.equals ("August"))
      daysofmonth = 31;
    else if (month.equals ("September"))
      daysofmonth = 30;
    else if (month.equals ("October"))
      daysofmonth = 31;
    else if (month.equals ("November"))
      daysofmonth = 30;
    else
      daysofmonth = 31;
    return daysofmonth;
    
  }
  
  
  public boolean isLeapYear (int year)
  { //http://en.wikipedia.org/wiki/Leap_year
    //returns true if year is a leap year and false if it isn't.
    
    if (year % 4 != 0)
    {
      return false; 
    }
    if (year % 100 != 0)
    {
      return true; 
    }
    if (year % 400 != 0)
    {
      return false;
    }
    else
    {
      return true; 
    }
          
  }
  
  
  public String dayofWeek (int k, int m, int C, int Y)
  { //http://www.cs.uwaterloo.ca/~alopez-o/math-faq/node73.html
    //How to determine the day of the week, given the month, day and year
    //Bonus... but very cool.
    //k is day (1 to 31)
    //m is month (1 = March, ..., 10 = December, 11 = Jan, 12 = Feb) Treat Jan & Feb as months of the preceding year
    //C is century (1987 has C = 19)
    //Y is year (1987 has Y = 87 except Y = 86 for Jan & Feb)
    //Take the last two digits of the year.
    //Divide by 4, discarding any fraction.
    //Add the day of the month.
    //Add the month's key value: JFM AMJ JAS OND 144 025 036 146
    //Subtract 1 for January or February of a leap year.
    //For a Gregorian date, add 0 for 1900's, 6 for 2000's, 4 for 1700's, 2 for 1800's; for other years, add or subtract multiples of 400.
    //For a Julian date, add 1 for 1700's, and 1 for every additional century you go back.
    //Add the last two digits of the year.
    //Divide by 7 and take the remainder.
    //Now 1 is Sunday, the first day of the week, 2 is Monday, and so on.
    
    
    
    if (m == 1 || m == 2)
      Y = Y - 1;
    int ans = Y % 4;
    String day;
    ans = ans + k;
    
    if (m == 1)
      ans = ans + 1;
    else if (m == 2)
      ans = ans + 4;
    else if (m == 3)
      ans = ans + 4;
    else if (m == 4)
      ans = ans + 0;
    else if (m == 5)
      ans = ans + 2;
    else if (m == 6)
      ans = ans + 5;
    else if (m == 7)
      ans = ans + 0;
    else if (m == 8)
      ans = ans + 3;
    else if (m == 9)
      ans = ans + 6;
    else if (m == 10)
      ans = ans + 1;
    else if (m == 11)
      ans = ans + 4;
    else 
      ans = ans + 6;
    
    if (C % 100 != 0 && m == 1 || m == 2)
    {
      ans = ans - 1; 
    }
    if (C % 400 != 0)
       ans = ans;
    else
    {
      if (m == 1 || m == 2)
        ans = ans - 1;
    }
    
    if (C == 20)
      ans = ans + 6;
    else if (C == 17)
      ans = ans + 4;
    else if (C == 18)
      ans = ans + 2;
    else
      ans = ans + 0;
    
    ans = ans + Y;
    ans = ans % 7;
    
   //double s = (((k + ((2.6*m)-0.2) - (2*C) + Y + (Y/4) + (C/4)) % 7) / 0.1);
   //int x = s / 1;
  
    if (ans == 1)
      day = "Sunday";
    else if (ans == 2)
      day = "Monday";
    else if (ans == 3)
      day = "Tuesday";
    else if (ans == 4)
      day = "Wednesday";
    else if (ans == 5)
      day = "Thurday";
    else if (ans == 6)
      day = "Friday";
    else 
      day = "Saturday";
   
   
    
   return day; 
  }
}
