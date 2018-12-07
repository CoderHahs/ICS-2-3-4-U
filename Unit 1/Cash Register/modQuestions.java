public class modQuestions
{
 public static void main (String args[])
 {
 new modQuestions ();
 }
 public modQuestions ()
 {
 System.out.println("Question 0\n");
 int n = IBIO.inputInt ("Enter the number of cents: ");
 if (n / 200 > 1)
 {
 n = n % 200;
 System.out.println ("That is " + (n / 200) + " toonies.");
 }
 else if (n / 200 > 0)
 {
 
 System.out.println ("That is " + (n / 200) + " toonie.");
 }
 n = n % 200;
 if (n / 100 > 1)
 {
 System.out.println ("That is " + (n / 100) + " loonies.");
 }
 else if (n / 100 > 0)
 {
   System.out.println ("That is " + (n / 100) + " loonie.");
 }
 n = n % 100;
 if (n / 25 > 1)
 {
 System.out.println ("That is " + (n / 25) + " quarters.");
 }
 else if (n / 25 > 0)
 {
  System.out.println ("That is " + (n / 25) + " quarter.");
 }
 n = n % 25;
 if ( n / 10 > 1)
 {
 System.out.println ("That is " + (n / 10) + " dimes.");
 }
 else if (n / 10 > 0)
 {
 System.out.println ("That is " + (n / 10) + " dime.");
 }
 n = n % 10;
 if (n / 5 > 1)
 {
 System.out.println ("That is " + (n / 5) + " nickels.");
 }
 else if (n / 5 > 0 )
 {
 System.out.println ("That is " + (n / 5) + " nickel.");
 }
 n = n % 5;
 if ( n / 1 > 1)
 {
 System.out.println ("That is " + (n) + " pennies.");
 }
 else if (n / 1 > 0)
 {
 System.out.println ("That is " + (n) + " penny.");
 }
 n = n % 1;
  
  System.out.println ("");
  System.out.println ("Question 1: ");
  System.out.println ("");
  
  int players = IBIO.inputInt ("Enter the number of players: ");
  int team = players / 7;
  int leftover = players%7;
  if (players / 7 > 1)
  {
  System.out.println ("There will be " + team + " teams with " +leftover + " players leftover.");
  }
  else if (players / 7 > 0)
  {
  System.out.println ("There will be " + team + " team with " +leftover + " players leftover.");
  }
  
  System.out.println ("");
  System.out.println ("Question 2: ");
  System.out.println ("");
  
  int min = IBIO.inputInt ("Enter the number of minutes: ");
  int hours = min / 60;
  int minover = min%60;
  if (min%60 > 9) {
  System.out.println ("This is "+hours+":"+minover);
  }
  else {
   System.out.println("This is "+hours+":0"+minover);
  }
  
  System.out.println ("");
  System.out.println ("Question 3: ");
  System.out.println ("");
  
  int pots = IBIO.inputInt ("Enter the number of flower pots to ship: ");
  System.out.println ("\nWe will ship: ");
  int vbb = pots / 9;
  int remainderone = pots -= 9*vbb;
  int bb = remainderone / 4;
  int remaindertwo = remainderone -= 4*bb;
  int sb = remaindertwo / 1;
  int remainderthree = remaindertwo -= 1*sb;
  int total = vbb + bb + sb;
  
  System.out.println (vbb+" very big box (es).");
  System.out.println (bb+" big box (es).");
  System.out.println (sb+" small box (es).");
  System.out.println ("This is a total of "+total+" box(es).");
 
  
  
  
  
  
  


 }
}
