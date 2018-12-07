public class letter
{
    public static void main (String[] args)
    {
	new letter ();
    }


    public letter ()
    {
	char letter[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
	double f[] = {8.167, 1.492, 2.782, 4.253, 12.702, 2.228, 2.015, 6.094, 6.966, 0.153, 0.772, 4.025, 2.406, 6.749, 7.507, 1.929, 0.095, 5.987, 6.327, 9.056, 2.758, 0.978, 2.360, 0.150, 1.974, 0.074};

	double av = f [0];
	for (int i = 0 ; i < f.length ; i++)
	{
	    av += f [i];
	}
	av = av / f.length;
	System.out.println ("\tThe average of the frequencies is " + av + "\n");

	double sum = f [0];
	for (int i = 0 ; i < f.length ; i++)
	{
	    sum += f [i];
	}
	System.out.println ("\tThe sum is " + sum);
	if (sum < 100)
	    System.out.println ("\tAccurate");
	else
	    System.out.println ("\tMild rounding error\n");

	double min = f [0];
	char lettermin = ' ';
	for (int i = 0 ; i < f.length ; i++)
	{
	    if (min > f [i])
	    {
		min = f [i];
		lettermin = letter [i];
	    }
	}
	System.out.println ("\tThe minimum frequency is of the letter " + lettermin + ". It is " + min + "\n");
	double max = f [0];
	char lettermax = ' ';
	for (int i = 0 ; i < f.length ; i++)
	{
	    if (max < f [i])
	    {
		max = f [i];
		lettermax = letter [i];
	    }
	}
	System.out.println ("\tThe maximum frequency is of the letter " + lettermax + ". It is " + max + "\n");

	char quit = 'y';
	while (quit == 'y')
	{
	    double pos = -1;
	    char input = IBIO.inputChar ("\tEnter a letter to find the corresponding frequency: ");
	    for (int i = 0 ; i < f.length ; i++)
	    {
		if (letter [i] == (input))
		    pos = f [i];
	    }
	    while (pos == -1)
	    {
		System.out.println ("\tThis frequency is not registered. Try again");
		input = IBIO.inputChar ("\n\tEnter a letter to find the corresponding frequency: ");
		for (int i = 0 ; i < f.length ; i++)
		{
		    if (letter [i] == input)
			pos = f [i];
		}
	    }

	    System.out.println ("\tThis letter's frequency is " + pos + "\n");
	    quit = IBIO.inputChar ("Do you want learn about another letter's frequency? ");
	}
	System.out.println ("Goodbye!");


    }
}

