public class energybill
{
    public static void main (String[] args)
    {
	new energybill ();
    }


    public energybill ()
    {
	int kwh[] = {432, 469, 339, 408, 658, 627, 343, 399, 503, 440, 230, 374, 422, 365, 520, 524, 675, 469, 490, 443, 383, 313, 331, 379, 967, 464, 181, 561, 529, 455, 506, 420, 529, 311, 483, 650, 116, 312, 544, 607, 534, 573, 529, 522, 236, 403, 337, 377, 493, 443, 397, 606, 587, 567, 563, 486, 554, 294, 426, 453, 643, 557, 417, 579, 543, 546, 1248, 494, 520, 443, 569, 521, 670, 512, 736, 600, 1115, 853, 713, 498, 838};
	System.out.println ("a)\tThe number of months the mathematician studied energy use was " + kwh.length);
	int min = kwh [0];
	for (int i = 0 ; i < kwh.length ; i++)
	{
	    if (min > kwh [i])
		min = kwh [i];
	}
	System.out.println ("b)\tThe minimum kwh used in one month is " + min);
	int max = kwh [0];
	for (int i = 0 ; i < kwh.length ; i++)
	{
	    if (max < kwh [i])
		max = kwh [i];
	}
	System.out.println ("c)\tThe maximum kwh used in one month is " + max);
	double av = kwh [0];
	for (int i = 0 ; i < kwh.length ; i++)
	{
	    av += kwh [i];
	}
	av = av / kwh.length;
	System.out.println ("c)\tThe average kwh used in one month is " + av);
	int e = 0;
	for (int i = 0 ; i < kwh.length ; i++)
	{
	    if (kwh [i] > 300)
		e++;
	}
	System.out.println ("c)\tThe number of months that used over 300 kwh is " + e);
	int f = 0;
	for (int i = 0 ; i < kwh.length ; i++)
	{
	    if (kwh [i] > 500)
		f++;
	}
	System.out.println ("c)\tThe number of months that used over 300 kwh is " + f);
    }
}

