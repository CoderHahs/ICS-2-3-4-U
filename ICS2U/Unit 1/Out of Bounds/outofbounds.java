public class outofbounds
{
  public static void main (String args [])
  {
     new outofbounds ();
  }
  
  public outofbounds ()
  {
    int x = IBIO.inputInt ("Enter the x: ");
    int y = IBIO.inputInt ("Enter the y: ");
    String n = ("Nothing, you can't go there, It is out-of-bounds");
    String l = ("Long grass, you can go there, It is in-bounds");
    String s = ("Short grass, you can go there, It is in-bounds");
    String t = ("Trees, you can't go there, It is in-bounds");
    String f = ("Flowers, you can't go there, It is in-bounds");
    if (x >=2 && x <= 3 && y >=2 && y <= 3)
      System.out.println (l);
    else if (x == 3 && y == 4)
      System.out.println (l);
    else if (x == 1 && y <= 6)
      System.out.println (t);
    else if (x == 2 && y >=4 && y <= 6) 
      System.out.println (t);
    else if (x == 4 && y <= 6)
      System.out.println (s);
    else if (x >= 3 && y >= 5 && x <= 6 && y <=6)
      System.out.println (s);
    else if (x >= 5 && y <= 4)
      System.out.println (f);
    else if (x > 6 && y > 6)
      System.out.println (n);
    else if (x <=6 && y == 1)
	System.out.println (n);
    
			  
      
    
 
    
  }
  
}
