public class priceisright
{
    public static void main (String args[])
    {
	new priceisright ();
    }


    public priceisright ()
    {
	System.out.println ("Welcome to the Price is Right!\n");
	String n1 = IBIO.inputString ("Name contestant #1: ");
	String n2 = IBIO.inputString ("Name contestant #2: ");
	String n3 = IBIO.inputString ("Name contestant #3: ");
	String n4 = IBIO.inputString ("Name contestant #4: ");
	char playagain = 'y';
	int num = 1;
	while (playagain == 'y')
	{


	    String item = ("sofa");
	    int price = 987;

	    if (num == 1)
	    {
		item = ("sofa");
		price = 987;
	    }
	    else if (num == 2)
	    {
		item = ("TV");
		price = 560;
	    }
	    else if (num == 3)
	    {
		item = ("computer");
		price = 350;
	    }
	    else if (num == 4)
	    {
		item = ("IPhone");
		price = 645;
	    }
	    else
	    {
		item = ("bed");
		price = 826;
	    }
	    System.out.println ("\nThe item to bid on is a " + item + ".");
	    System.out.println ("The contestant who is closest without going");
	    System.out.println ("over wins. The maximum bid is $1000.\n");

	    int bid1 = bid (n1);
	    int bid2 = bid (n2);
	    while (bid1 == bid2)
	    {
		System.out.println ("Invalid entry. Cannot enter the same bid.");
		bid2 = bid (n2);
	    }
	    int bid3 = bid (n3);
	    while (bid1 == bid3 || bid2 == bid3)
	    {
		System.out.println ("Invalid entry. Cannot enter the same bid.");
		bid3 = bid (n3);
	    }
	    int bid4 = bid (n4);
	    while (bid1 == bid4 || bid2 == bid4 || bid3 == bid4)
	    {
		System.out.println ("Invalid entry. Cannot enter the same bid.");
		bid4 = bid (n4);
	    }

	    String winner = (n1);

	    int x1 = price - bid1;
	    int x2 = price - bid2;
	    int x3 = price - bid3;
	    int x4 = price - bid4;

	    if (x1 >= 0 && x1 < x2 && x1 < x3 && x1 < x4)
		winner = (n1);
	    else if (x2 >= 0 && x2 < x1 && x2 < x3 && x2 < x4)
		winner = (n2);
	    else if (x3 >= 0 && x3 < x1 && x3 < x2 && x3 < x4)
		winner = (n3);
	    else if (x4 >= 0 && x4 < x1 && x4 < x3 && x4 < x2)
		winner = (n4);



	    System.out.println (winner + " wins! The " + item + " was $" + price + ".\n");



	    playagain = IBIO.inputChar ("Play Again? (y/n)");
	    num++;
	}
	System.out.println ("Goodbye!");


    }


    public boolean isvalid (int z)
    {
	if (z >= 0 && z <= 1000)
	    return true;
	else
	    return false;

    }


    public int bid (String a)
    {
	int b = IBIO.inputInt (a + ", what is your bid? ");
	while (!isvalid (b))
	{
	    System.out.println ("Error. Bid is invalid. Try again.");
	    b = IBIO.inputInt (a + ", what is your bid? ");
	}
	return b;
    }
}

