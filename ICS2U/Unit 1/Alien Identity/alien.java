public class alien
{
  public static void main (String args [])
  {
    new alien ();
  } 

  public alien () 
  {
       int antennas = IBIO.inputInt ("How many antennas?");
       int eyes = IBIO.inputInt("How many eyes?");
       if (antennas >= 3 && eyes <= 4)
         System.out.println ("Martian");
       if (antennas <= 6 && eyes >= 2)
         System.out.println ("Saturnian");
       if (antennas <= 2 && eyes <= 3)
         System.out.println ("Mercurian");
       if (antennas >= 7 && eyes >= 5)
         System.out.println ("No alien found");
 
  }
}