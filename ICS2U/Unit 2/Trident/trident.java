public class trident
{
    public static void main (String args[])
    {
	new trident ();
    }


    public trident ()
    {
	int t = IBIO.inputInt ("Enter the length: ");
	int s = IBIO.inputInt ("Enter the spacing: ");
	int h = IBIO.inputInt ("Enter the height of the handle: ");

	for (int a = 1 ; a <= t ; a++)
	{
	    System.out.print ("*");
	    for (int b = 1 ; b <= s ; b++)
	    {
		System.out.print (" ");
	    }
	    System.out.print ("*");
	    for (int b = 1 ; b <= s ; b++)
	    {
		System.out.print (" ");
	    }
	    System.out.print ("*");
	    System.out.println ("");

	}
	System.out.print ("*");
	for (int c = 1 ; c <= s ; c++)
	{
	    System.out.print ("*");
	}
	System.out.print ("*");
	for (int c = 1 ; c <= s ; c++)
	{
	    System.out.print ("*");
	}
	System.out.println ("*");
	for (int d = 1 ; d <= h ; d++)
	{
	    for (int e = 1 ; e <= s + 1 ; e++)
	    {
		System.out.print (" ");
	    }
	    System.out.print ("*");
	    for (int e = 1 ; e <= s + 1 ; e++)
	    {
		System.out.print (" ");
	    }
	    System.out.println ("");

	}



    }
}


