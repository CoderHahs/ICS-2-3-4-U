/*
 By Hrithik Shah
 Date: July 17, 2016
 Title: Unit 3 Assigment 2
 Purpose: Creating a monogram, username and password.
 */
public class U3A2
{
  
  public static void main (String[] args)
  {
    U3A2mono ();
    U3A2password ();
  }
  
  
  public static void U3A2mono ()
  {
    //Title    
    System.out.println ("Creating a Monogram\n");
    
    // input + catching errors
    String fname = IBIO.inputString ("Enter your first name: ");
    
    while (fname.equals (" ") || fname.equals (""))
    {
      fname = IBIO.inputString ("\nPlease try again. \nEnter your first name: ");
    }
    
    String mname = IBIO.inputString ("Enter your middle name: ");
    
    while (mname.equals (" ") || mname.equals (""))
    {
      fname = IBIO.inputString ("\nPlease try again. \nEnter your first name: ");
    }
    
    String lname = IBIO.inputString ("Enter your last name: ");
    
    while (lname.equals (" ") || lname.equals (""))
    {
      fname = IBIO.inputString ("\nPlease try again. \nEnter your first name: ");
    }
    
    // get first initial of each input
    char finitial = fname.charAt (0);
    char minitial = mname.charAt (0);
    char linitial = lname.charAt (0);
    
    // change first and middle initial to lower case
    finitial = Character.toLowerCase (finitial);
    minitial = Character.toLowerCase (minitial);
    
    // make sure last name is upper case
    linitial = Character.toUpperCase (linitial);
    
    //final statement
    System.out.println ("Your Monogram is: "+finitial+linitial+minitial);
    
  }
  
  public static void U3A2password ()
  {
    // Title
    System.out.println ("Password Program\n");
    
    // input 
    String username = IBIO.inputString ("Enter a username: ");
    String password = IBIO.inputString ("Enter a password (at least 8 charaters): ");
    
    // make sure password is 8 characters long
    while (password.length () < 8)
    {
      System.out.println ("\nYour password is too short.");
      password = IBIO.inputString ("Enter a password (at least 8 charaters): ");
    }
    
    // generate a random number
    int rn = (int) (Math.random () * 100 + 1);
    
    // make inputted username and password lowercase
    username = username.toLowerCase ();
    password = password.toLowerCase ();
    
    //final statement
    System.out.println ("Username: "+username+" Password: "+password +rn);
    
  }
  
}

