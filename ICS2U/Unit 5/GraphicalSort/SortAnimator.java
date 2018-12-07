import java.awt.*;
import java.applet.*;
public class SortAnimator extends Applet
{
    Button select, bubble, insert;
    int size = 10;
    int a[] = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100};
    Button reset;

    public void init ()
    {
	resize (350, 300);
	select = new Button ("selection sort");
	add (select);
	bubble = new Button ("bubble sort");
	add (bubble);
	insert = new Button ("insertion sort");
	add (insert);
	reset = new Button ("Reset array");
	add (reset);
    }


    public void printarray (int a[])
    {
	Graphics g = getGraphics ();
	int y = 50;
	for (int i = 0 ; i < a.length ; i++)
	{
	    g.fillRect (50, y, a [i], 10);
	}

    }


    public boolean action (Event e, Object o)
    {
	if (e.target == select)
	{
	}
	else if (e.target == bubble)
	{
	}
	else if (e.target == insert)
	{
	}
	else if (e.target == reset)
	{
	}
	return true;
    }


    public void paint (Graphics g)
    {
	g.setColor (Color.red);
	for (int i = 0 ; i < a.length ; i++)
	    printarray (a);
    }
}
