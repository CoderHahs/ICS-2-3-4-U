public class fizzbuzz
{
    public static void main (String args[])
    {
	new fizzbuzz ();
    }


    public fizzbuzz ()
    {
	int num = 0;
	int max = IBIO.inputInt ("What would you like your max value to be? ");
	while (num == 0)
	{
	    for (int i = 1 ; i <= max ; i++)
	    {
		if (i % 3 == 0 && i % 5 == 0)
		{
		    System.out.print ("Fizzbuzz, ");
		}
		else if (i % 3 == 0)
		{
		    System.out.print ("Fizz, ");
		}
		else if (i % 5 == 0)
		{
		    System.out.print ("Buzz, ");
		}
		else
		{
		    System.out.print (i + ", ");
		}


	    }
	    max = IBIO.inputInt ("\nWhat would you like your max value to be? ");
	    
	    
	}

    }
}
