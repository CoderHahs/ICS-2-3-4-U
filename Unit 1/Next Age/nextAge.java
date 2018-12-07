public class nextAge
{
  public static void main (String args [])
  {
    new nextAge ();
  } 

  public nextAge () 
  {
     int first = IBIO.inputInt("How old is your youngest child? ");
     int second = IBIO.inputInt("How old is your second child? ");
     int third = (second - first) + second;
     System.out.println ("Your third child is "+third+" years old");
     
     
      
 
  }
}