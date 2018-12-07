public class postal
{
  public static void main (String args [])
  {
     new postal ();
  }
  
  public postal ()
  {
    System.out.println ("Welcome to Canada Post International Letters!");
    System.out.println ("From anywhere ... to anyone**");
    int l = IBIO.inputInt ("How many letters would you like? ");
    int c = 1;
    
    if ( l <= 9)
	c = 5;
    else if (l <= 19)
	c = 3;
    else if(l <= 39)
	c = 2;
    int total = l*c;
    
	
    System.out.println ("\nThe cost per letter is $"+c);
    System.out.println ("The total cost is $"+total);
    
  }
  
}
