public class moviePosters
{
    public static void main (String args[])
    {
	new moviePosters ();
    }


    public moviePosters ()
    {
	String first[] = {"Sam", "Zoe", "Sigourney", "Stephen", "Michelle", "Laz", "Wes", "Dileep", "Joel", "Giovanni", "CCH"};
	String last[] = {"Worthington", "Saldana", "Weaver", "Lang", "Rodriguez", "Alonzo", "Studi", "Rao", "Moore", "Ribisi", "Pounder"};
	System.out.println ("Avatar starring....");
	for (int i = 0 ; i < first.length ; i++)
	{
	    System.out.println ("\t" + first [i] + " " + last [i]);
	}
	System.out.println ("");
	System.out.println ("");
	System.out.println ("Avatar starring....");
	for (int i = 0 ; i < first.length ; i++)
	{
	    System.out.println ("\t" + (i + 1) + ".   " + first [i] + " " + last [i]);
	}
	System.out.println ("");
	System.out.println ("");
	String min = first [0];
	for (int i = 0 ; i < first.length ; i++)
	{
	    if (min.compareTo (first [i]) > 0)
		min = first [i];
	}
	System.out.println ("\nThe earliest first name is: " + min);
	System.out.println ("");
	System.out.println ("");
	String max = last [0];
	for (int i = 0 ; i < first.length ; i++)
	{
	    if (max.compareTo (last [i]) > 0)
		max = last [i];
	}
	System.out.println ("\nThe first last name is: " + max);
	System.out.println ("");
	System.out.println ("");
	String min1 = first [0];
	for (int i = 0 ; i < first.length ; i++)
	{
	    if (min.compareTo (first [i]) < 0)
		min = first [i];
	}
	System.out.println ("\nThe last first name is: " + min1);
	System.out.println ("");
	System.out.println ("");
	String max2 = last [0];
	for (int i = 0 ; i < first.length ; i++)
	{
	    if (max.compareTo (last [i]) < 0)
		max = last [i];
	}
	System.out.println ("\nThe last last name is: " + max2);
	System.out.println ("");
	System.out.println ("");
	int b = 0;
	System.out.print ("Avatar starring....\n\t");
	for (int i = 0 ; i < first.length ; i++)
	{
	    if (b == 3)
	    {
		System.out.print ("\n\t");
		b = 0;
	    }
	    if (i != (first.length - 1))
		System.out.print (first [i] + " " + last [i] + ", ");
	    else
		System.out.print (first [i] + " " + last [i] + ".");
	    b++;

	}
    }
}


