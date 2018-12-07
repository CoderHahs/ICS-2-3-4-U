public class series
{
  public static void main (String args [])
  {
     new series();
  }
  
  public series()
  {
    System.out.println ("Group A Counting\n");
    for (int a = 0; a <= 12; a ++)
    {
      System.out.print (a + " ");
    }
    System.out.println (" ");
    for (int b = 1; b < 20; b ++)
    {
      
      System.out.print (b + " ");
    }
    System.out.println (" ");
    for (int c = 12; c < 23; c ++)
    {
      
      System.out.print (c + " ");
    }
    System.out.println (" ");
    for (int d = 101; d <= 115; d ++)
    {
      
      System.out.print (d + " ");
    }
    System.out.println (" ");
    System.out.println (" ");
    
    System.out.println ("Group B Backwards\n");
    for (int e = 12; e >= 0 ; e --)
    {
      System.out.print (e + " ");
    }
    System.out.println (" ");
    for (int f = 20; f >= 1 ; f --)
    {
      
      System.out.print (f + " ");
    }
    System.out.println (" ");
    for (int g = 22; g >= 12 ; g --)
    {
      
      System.out.print (g + " ");
    }
    System.out.println (" ");
    for (int h = 115; h >= 101 ; h --)
    {
      
      System.out.print (h + " ");
    }
    System.out.println (" ");
    System.out.println (" ");
    
    System.out.println ("Group C Skip Counting\n");
    for (int i = 0; i <= 18; i += 2)
    {
      System.out.print (i + " ");
    }
    System.out.println (" ");
    for (int i = 1; i <= 19; i += 2)
    {
      
      System.out.print (i + " ");
    }
    System.out.println (" ");
    for (int i = 0; i <= 30; i += 3)
    {
      System.out.print (i + " ");
    }
    System.out.println (" ");
    for (int i = 0; i <= 40; i += 4)
    {
      
      System.out.print (i + " ");
    }
    System.out.println (" ");
    for (double i = 1.0; i <= 5.5; i += 0.5)
    {
      
      System.out.print (i + " ");
    }
    System.out.println (" ");
    System.out.println (" ");
    
    System.out.println ("Group D One Thing, Repeated\n");
    for (int i = 0; i <= 13; i ++)
    {
     System.out.print ("*");
    }
    System.out.println (" ");
    for (int i = 0; i <= 13; i ++)
    {
     System.out.print ("2");
    }
    System.out.println (" ");
    for (int i = 0; i <= 13; i ++)
    {
     System.out.print ("1 0 ");
    }
    System.out.println (" ");
    for (int i = 0; i <= 20; i ++)
    {
     System.out.print ("la");
    }
    System.out.println (" ");
    for (int i = 0; i <= 6; i ++)
    {
     System.out.print ("- 1 + 1");
    }
    System.out.println (" ");
    System.out.println (" ");
    
    System.out.println ("Group E Powers - Multiply and Divide\n");
    for (int i = 0; i <= 12; i ++)
    {
     System.out.print (i*i  + " ");
    }
    System.out.println (" ");
    for (int i = 0; i <= 12; i ++)
    {
     System.out.print (i*i*i  + " ");
    }
    System.out.println (" ");
    System.out.println (" ");
    
    System.out.println ("Bonus\n");
    for (int i = 0; i <= 11; i ++)
    {
     System.out.print ((int) (Math.pow (2,i))  + " ");
    }
    System.out.println (" ");
    for (int i = 0; i <= 10; i ++)
    {
     System.out.print ((int)(Math.pow (3,i))  + " ");
    }
    System.out.println (" ");
    for (int i = 3; i >= -2; i --)
    {
     System.out.print (Math.pow (10,i)  + " ");
    }
    System.out.println (" ");
    for (int i = 1; i <= 8; i ++)
    {
     System.out.print (+i+"/"+(i+1)  + " ");
    }
    System.out.println (" ");
    int x = 1;
    for (int i = 1; i <= 9; i ++)
    {
      int y = x * i;
     System.out.print (y + " ");
      x = y;
    }
    System.out.println (" ");
    int x1 = 1;
    int y1 = 1;
    System.out.print (x1 + " " + y1 + " ");
    for (int i = 1; i <= 9; i ++)
    {
      int z = x1 + y1;
     System.out.print (z  + " ");
      x1 = y1;
      y1 = z;
    }
    System.out.println (" ");
    
    
  }
  
}
