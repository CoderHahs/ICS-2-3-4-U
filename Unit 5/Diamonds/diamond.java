public class diamond
{
    public static void main (String[] args)
    {
	new diamond ();
    }


    public diamond ()
    {
	double carets[] = {0.23, 0.23, 0.17, 0.33, 0.25, 0.35, 0.18};
	int price[] = {595, 553, 345, 945, 655, 1086, 443};

	for (int i = 0 ; i < carets.length ; i++)
	{
	    System.out.println ("\t" + carets [i]);
	}
	System.out.println ("");

	for (int i = 0 ; i < price.length ; i++)
	{
	    System.out.println ("\t$" + price [i]);
	}
	System.out.println ("");

	System.out.print ("\t");
	for (int i = 0 ; i < carets.length ; i++)
	{
	    System.out.print (carets [i] + "  ");
	}
	System.out.println ("");
	System.out.println ("");
	System.out.println ("");

	System.out.println ("\tCarets        Cost");
	System.out.println ("\t------------------");
	for (int i = 0 ; i < carets.length ; i++)
	{
	    System.out.println ("\t" + carets [i] + "        " + price [i]);
	}

	System.out.println ("");
	System.out.println ("");
	System.out.println ("");

	for (int i = 0 ; i < carets.length ; i++)
	{
	    System.out.println ("\tA ring with " + carets [i] + " carets sold for $" + price [i]);
	}

	System.out.println ("");
	System.out.println ("");
	System.out.println ("");
	System.out.print ("\tCaret: ");

	for (int i = 0 ; i < carets.length ; i++)
	{
	    System.out.print (carets [i] + "\t");
	}
	System.out.println ("");

	System.out.print ("\tCost: ");

	for (int i = 0 ; i < carets.length ; i++)
	{
	    System.out.print (price [i] + "\t");
	}



    }
}

