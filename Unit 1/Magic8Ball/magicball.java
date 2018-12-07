public class magicball
{
 public static void main (String args[])
 {
 new magicball ();
 }
 public magicball ()
 {
  System.out.println ("***Ask the Magic 8 Ball ***");
  String question = IBIO.inputString ("Enter a yes or no question: ");
  int num = (int) (Math.random () * 16) + 1;
  if (num == 1)
   System.out.println ("The Magic 8 Ball says: \nOutlook not so good");
  else if (num == 2)
    System.out.println ("The Magic 8 Ball says: \nDon't count on it.");
  else if (num == 3)
    System.out.println ("The Magic 8 Ball says: \nMy sources say no.");
  else if (num == 4)
    System.out.println ("The Magic 8 Ball says: \nWithout a doubt.");
  else if (num == 5)
    System.out.println ("The Magic 8 Ball says: \nReply hazy, try again.");
  else if (num == 6)
    System.out.println ("The Magic 8 Ball says: \nIt is certain.");
  else if (num == 7)
    System.out.println ("The Magic 8 Ball says: \nMy reply is no.");
  else if (num == 8)
    System.out.println ("The Magic 8 Ball says: \nAs I see it, yes.");
  else if (num == 9)
    System.out.println ("The Magic 8 Ball says: \nMost likely.");
  else if (num == 10)
    System.out.println ("The Magic 8 Ball says: \nYou may rely on it.");
  else if (num == 11)
    System.out.println ("The Magic 8 Ball says: \nCannot predict now.");
  else if (num == 12)
    System.out.println ("The Magic 8 Ball says: \nOutlook good.");
  else if (num == 13)
    System.out.println ("The Magic 8 Ball says: \nBetter not tell you now.");
  else if (num == 14)
    System.out.println ("The Magic 8 Ball says: \nVery doubtful.");
  else if (num == 15)
    System.out.println ("The Magic 8 Ball says: \nYes definitely.");
  else if (num == 16)
    System.out.println ("The Magic 8 Ball says: \nConcentrate and ask again");
   
   
 }
}