public class bottlesofpop
{
  public static void main (String args [])
  {
     new bottlesofpop ();
  }
  
  public bottlesofpop ()
  {
    int bottles = 101;
    
    while (bottles >= 1)
    {
      bottles--;
      if (bottles > 2)
      {
        System.out.println (bottles + " bottles of pop on the wall.");
        System.out.println (bottles + " bottles of pop.");
        System.out.println ("If one of those bottles should happen to fall...");
        System.out.println ("There would be "+(bottles-1)+" bottles of pop on the wall.\n");
      }
      else if (bottles == 1)
      {
        System.out.println (bottles + " bottle of pop on the wall.");
        System.out.println (bottles + " bottle of pop.");
        System.out.println ("If that bottle should happen to fall...");
        System.out.println ("There would be no more bottles of pop on the wall.\n");
      }
      else if (bottles == 2)
      {
        System.out.println (bottles + " bottles of pop on the wall.");
        System.out.println (bottles + " bottles of pop.");
        System.out.println ("If one of those bottles should happen to fall...");
        System.out.println ("There would be 1 last bottle of pop on the wall.\n");
      }
      else 
      {
        System.out.println ("Song is now over.");
      }
      
    }
  }
  
}