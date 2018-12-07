/*
By Hrithik Shah
July 6 2016
Unit 2 Assignment 1
Introduction to Java
*/

public class U2A1
{
    public static void main (String[] args)
    {
	new U2A1 ();
    }


    public U2A1 ()
    {
	System.out.println ("Area of a Circle");
	double r = 15;
	double areac = Math.round ((Math.PI * r * r) * 100.0) / 100.0;
	System.out.println ("The area of the circle is " + areac + ".\n\n");

	System.out.println ("Wayne Gretzky");
	String name = "Wayne Gretzky";
	int number = 99;
	System.out.println (name + " is number " + number + " from memory locations.\n\n");

	System.out.println ("Area of a Rectangle");
	double length = 5.7;
	double width = 4.8;
	double arear = length * width;
	System.out.println ("The length is " + length + ".\n" + "The width is " + width + ".\n" + "The area of the rectangle is " + arear + ".\n\n");

	System.out.println ("Net Pay");
	int h = 40;
	int w = 5;
	int i = 2;
	double t = 0.22;
	double net = (h * (w - i)) - t * (h * (w - i));
	System.out.println ("The net pay is $" + net + ".\n\n");

	System.out.println ("Carpet");
	double lengthc = 8.5;
	double widthc = 6;
	double areacarpet = lengthc * widthc;
	double cost = Math.round ((areacarpet * 19.95) * 100.0) / 100.0;
	System.out.println ("The cost of the carpet is $" + cost + ".\n\n");

	System.out.println ("Poem");
	System.out.println ("\"All the World's a stage\" by William Shakespeare\n");
	System.out.print ("All the world?s a stage,\nAnd all the men and women merely players;\nThey have their exits and their entrances,\nAnd one man in his time plays many parts,\nHis acts being seven ages. At first, the infant,\nMewling and puking in the nurse?s arms.\nThen the whining schoolboy, with his satchel\nAnd shining morning face, creeping like snail\nUnwillingly to school. And then the lover,\nSighing like furnace, with a woeful ballad\nMade to his mistress? eyebrow. Then a soldier,\nFull of strange oaths and bearded like the pard,\nJealous in honor, sudden and quick in quarrel,\nSeeking the bubble reputation\nEven in the cannon?s mouth. And then the justice,\nIn fair round belly with good capon lined,\nWith eyes severe and beard of formal cut,\nFull of wise saws and modern instances;\nAnd so he plays his part. The sixth age shifts\nInto the lean and slippered pantaloon,\nWith spectacles on nose and pouch on side;\nHis youthful hose, well saved, a world too wide\nFor his shrunk shank, and his big manly voice,\nTurning again toward childish treble, pipes\nAnd whistles in his sound. Last scene of all,\nThat ends this strange eventful history,\nIs second childishness and mere oblivion,\nSans teeth, sans eyes, sans taste, sans everything.\n\n");

	System.out.println ("Bill of Sale");
	double shirt = 12.49;
	double payment = 20.00;
	double tax = Math.round ((12.49 * 0.13) * 100.0) / 100.0;
	double totalbill = (shirt + tax);
	double change = Math.round ((payment - totalbill) * 100.0) / 100.0;
	System.out.println ("********BILL OF SALE********\n\n\nItem(s): Shirt  Price: $12.49\n     Tax: $" + tax + " \n     Total Bill: $" + totalbill + "\n     Change: $" + change + "\n\n\n******HAVE A GREAT DAY******");
    }
}

