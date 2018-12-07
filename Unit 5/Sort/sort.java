public class sort
{
    public static void main (String[] args)
    {
	new sort ();
    }


    public sort ()
    {
	int num[] = {16, 1, 516, 2048, 2, 64, 128, 256, 1024, 32, 4, 8};
	for (int i = 0 ; i < num.length ; i++)
	{
	    System.out.print (num [i] + " ");
	}
	System.out.println ("");
	for (int left = num.length - 1 ; left > 0 ; left--)
	{
	    int max = 0;
	    for (int i = 1 ; i <= left ; i++)
	    {
		if (num [max] < num [i])
		    max = i;
	    }
	    int temp = num [max];
	    num [max] = num [left];
	    num [left] = temp;
	}
	for (int i = 0 ; i < num.length ; i++)
	{
	    System.out.print (num [i] + " ");
	}
	System.out.println ("");
	String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	for (int i = 0 ; i < months.length ; i++)
	{
	    System.out.print (months [i] + " ");
	}
	System.out.println ("");
	for (int i = 0 ; i < months.length - 1 ; i++)
	{
	    for (int j = 0 ; j < months.length - 1 - i ; j++)
	    { // compare the two neighbours
		if (months [j + 1].compareTo (months [j]) < 0)
		{ //swap the neighbours if necessary
		    String temp = months [j];
		    months [j] = months [j + 1];
		    months [j + 1] = temp;
		}
	    }
	}
	for (int i = 0 ; i < months.length ; i++)
	{
	    System.out.print (months [i] + " ");
	}
	System.out.println ("");
	char letters[] = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm'};
	for (int i = 0 ; i < letters.length ; i++)
	{
	    System.out.print (letters [i] + " ");
	}
	System.out.println ("");
	for (int left = letters.length - 1 ; left > 0 ; left--)
	{
	    int max = 0;
	    for (int i = 1 ; i <= left ; i++)
	    {
		if (letters [max] < letters [i])
		    max = i;
	    }
	    char temp = letters [max];
	    letters [max] = letters [left];
	    letters [left] = temp;
	}
	for (int i = 0 ; i < letters.length ; i++)
	{
	    System.out.print (letters [i] + " ");
	}
	System.out.println ("");
	double moreNums[] = {3.45, 6.54, 7.89, 9.87, 2.34, 1.23, 5.78, 4.32, 6.45, 8.96, 9.07, 3.67, 0.34, 1.46, 1.47};
	for (int i = 0 ; i < moreNums.length ; i++)
	{
	    System.out.print (moreNums [i] + " ");
	}
	System.out.println ("");
	for (int i = 0 ; i < moreNums.length - 1 ; i++)
	{
	    for (int j = 0 ; j < moreNums.length - 1 - i ; j++)
	    { // compare the two neighbours
		if (moreNums [j + 1] < (moreNums [j]))
		{ //swap the neighbours if necessary
		    double temp = moreNums [j];
		    moreNums [j] = moreNums [j + 1];
		    moreNums [j + 1] = temp;
		}
	    }
	}
	for (int i = 0 ; i < moreNums.length ; i++)
	{
	    System.out.print (moreNums [i] + " ");
	}
	System.out.println ("");
	String names[] = {"Sunflower", "Peashooter", "Cherry Bomb", "Wall-nut", "Potato Mine", "Snow Pea", "Chomper", "Repeater", "Puff-Shroom", "Lily-Pad", "Squash", "Threepeater", "Tangle Kelp", "Jalapeno"};
	int sun[] = {50, 100, 150, 50, 25, 175, 150, 200, 0, 25, 50, 325, 25, 125};
	for (int i = 0 ; i < names.length ; i++)
	{
	    System.out.print (names [i] + " = ");
	    System.out.print (sun [i] + " ");
	}
	System.out.println ("");
	for (int left = names.length - 1 ; left > 0 ; left--)
	{
	    int max = 0;
	    for (int i = 1 ; i <= left ; i++)
	    {
		if (names [max].compareTo (names [i]) < 0)
		    max = i;
	    }
	    String temp = names [max];
	    names [max] = names [left];
	    names [left] = temp;
	    int temp2 = sun [max];
	    sun [max] = sun [left];
	    sun [left] = temp2;
	}
	for (int i = 0 ; i < names.length ; i++)
	{
	    System.out.print (names [i] + " = ");
	    System.out.print (sun [i] + " ");
	}
	System.out.println ("");
	for (int left = names.length - 1 ; left > 0 ; left--)
	{
	    int max = 0;
	    for (int i = 1 ; i <= left ; i++)
	    {
		if (sun [max] < sun [i])
		    max = i;
	    }
	    String temp = names [max];
	    names [max] = names [left];
	    names [left] = temp;
	    int temp2 = sun [max];
	    sun [max] = sun [left];
	    sun [left] = temp2;
	}
	for (int i = 0 ; i < names.length ; i++)
	{
	    System.out.print (names [i] + " = ");
	    System.out.print (sun [i] + " ");
	}
	System.out.println ("");

	//Integer Selection Sort
	/*
	for (int left = a.length - 1 ; left > 0 ; left--)
	{
	    int max = 0;
	    for (int i = 1 ; i <= left ; i++)
	    {
		if (a [max] < a [i])
		    max = i;
	    }
	    int temp = a [max];
	    a [max] = a [left];
	    a [left] = temp;
	}
	//Integer Bubble Sort
	for (int i = 0 ; i < a.length - 1 ; i++)
	{
	    for (int j = 0 ; j < a.length - 1 - i ; j++)
	    { // compare the two neighbours
		if (a [j + 1] < a [j])
		{ //swap the neighbours if necessary
		    int temp = a [j];
		    a [j] = a [j + 1];
		    a [j + 1] = temp;
		}
	    }
	}
	*/
    }
}

