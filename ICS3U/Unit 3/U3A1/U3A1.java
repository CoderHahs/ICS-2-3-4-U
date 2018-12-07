/*
 By Hrithik Shah
 Date: July 14, 2016
 Title: Unit 3 Assigment 1
 Purpose: Creating a secret message.
*/
public class U3A1
{
  
  public static void main (String[] args)
  {
    U3A1secret ();
  }
  
  
  public static void U3A1secret ()
  {
    // variables
    char letter; 
    int ascii;
    
    // input
    String message = IBIO.inputString ("Enter a secret message that is maximum 15 characters long: ");
    
    // catching errors
    while (message.length () > 15)
    {
      message = IBIO.inputString ("\nError, please try again. \nEnter a secret message that is maximum 15 characters long: ");
    }
    
    int [] binary = new int [message.length ()];
    
    for (int i = 0; i < message.length (); i++)
    {
      letter = message.charAt (i); // gets the letter from message
      
      ascii = (int) letter; // converts to ascii code
      
      // converts ascii code to binary
      for (int j = 7; j >= 0; j--)
      {
        if (ascii - Math.pow (2,j) >= 0)
        {
          ascii -= Math.pow (2,j);
          binary [i] += Math.pow (10,j);
        }
      } 
      
      // final statement
      System.out.print (binary [i] + " ");
    }
    
    
  }
  
}
