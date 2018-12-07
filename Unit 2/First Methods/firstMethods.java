//At the bottom of this class are a series of methods
//Fill them in, according to their instructions.
//Run them as you go, to verify if they are working.

public class firstMethods
{
    public static void main (String args[])
    {
	new firstMethods ();
    }


    public firstMethods ()
    {
	square ();
	blank ();
	circle ();
	blank ();
	bunny ();
	blank ();
	line ();
	blank ();
	count ();
	blank ();
	signature ();
    }


    public void blank ()
    { //fill in the code to make a blank line on the screen.
      System.out.println ("_________________________");
    }


    public void square ()
    { //fill in the code to make an ASCII square here.
      System.out.println ("*****");
      System.out.println ("*****");
      System.out.println ("*****");
    }


    public void circle ()
    { //fill in the code to make an ASCII square here.
      System.out.println (" ** ");
      System.out.println ("*  *");
      System.out.println (" ** ");
    }


    public void bunny ()
    { //fill in the code to make an ASCII bunny here.
      System.out.println ("(\\ /)");
      System.out.println ("( . .)");
      System.out.println ("c(\")(\")");
    }


    public void line ()
    { //use a loop to make a line of stars * here.
      System.out.println ("**************************");
    }


    public void count ()
    { //use a loop to count from 1 to 10 here.
      for (int i = 1; i <= 10; i++)
      {
	System.out.print (i + " ");
      }
    }


    public void signature ()
    { //make a "signature" for yourself
	//list a title - eg. "IB Student at Turner Fenton"
	//pick a quote to follow it
	System.out.println("      ____  ___)                          __");             
	System.out.println("     (, /   /      ,    /)   , /)     (__/  ) /)      /)"); 
	System.out.println("       /---/  __    _/_(/     (/_       /    (/   _  (/");  
	System.out.println("    ) /   (__/ (__(_(__/ )__(_/(__   ) /     / )_(_(_/ )_");
	System.out.println("   (_/                              (_/");                  
	System.out.println ("                                      - King of the World ");
	System.out.println ("                                        Imagination is greater than knowledge - Albert Einstein");
	

    }
}
