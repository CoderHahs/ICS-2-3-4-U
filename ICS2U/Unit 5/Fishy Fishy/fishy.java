public class fishy
{
    public static void main (String[] args)
    {
	new fishy ();
    }


    public fishy ()
    {
	int fish[] = {226, 305, 233, 244, 224, 235, 238, 244, 222, 239, 233, 243, 221, 230, 237, 240, 309, 230, 236, 242, 222, 235, 237, 240, 220, 235, 238, 243, 222, 232, 232, 242};
	int max = fish [0];
	for (int i = 0 ; i < fish.length ; i++)
	{
	    if (max < fish [i])
		max = fish [i];
	}
	System.out.println ("\tThe maximum weight of a fish in the reservoir is " + max);
	double av = fish [0];
	for (int i = 0 ; i < fish.length ; i++)
	{
	    av += fish [i];
	}
	av = av / fish.length;
	System.out.println ("\tThe average fish weight in the reservoir is " + av);

	if (av < 200)

	    System.out.println ("\n\tThe fish in the reservoir are not getting enough food\n\tand they will have trouble reproducing.");

	else
	    System.out.println ("\tThe fish in the reservoir are getting enough food\n\tand they will not have trouble reproducing.");

	if (max < 300)
	    System.out.println ("\tThe fish are not living long enough to represent a healthy population.");
	else
	    System.out.println ("\tThe fish are living long enough to represent a healthy population.");
    }
}

