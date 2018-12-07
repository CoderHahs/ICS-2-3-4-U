public class fruitPop
{
 public static void main (String args[])
 {
 new fruitPop ();
 }
 public fruitPop ()
 {
   System.out.println ("Welcome to Fruit Pop ICS208 verion!");
   
   int points = IBIO.inputInt ("How many points do you have? ");
   System.out.println ("Your screen can have these icons: ");
   
   if (points > 10 && points < 50)
   {
     System.out.println ("Apple, Blueberry, Heart, Lemon, Plum");
   }
   else if (points > 50 && points < 100)
   {
    System.out.println ("Apple, Blueberry, Heart, Lemon, Lime, Plum"); 
   }
   else if (points > 100 && points < 400)
   {
    System.out.println ("Apple, Blueberry, Heart, Lemon, Lime, Orange, Plum"); 
   }
   else if (points > 400 && points < 1000)
   {
     System.out.println ("Apple, Blueberry, Lemon, Lime, Orange, Plum"); 
   }
   else if (points > 1000 && points < 1500)
   {
    System.out.println ("Apple, Blueberry, Heart, Lemon, Lime, Orange, Plum");
   }
   else if (points > 1500 && points < 2000)
   {
    System.out.println ("Apple, Blueberry, Heart, Lime, Orange, Plum, Robot");
   }
   else if (points > 2000 && points < 3000)
   {
    System.out.println ("Apple, Blueberry, Coin, Extra Time, Orange, Plum, Robot");
   }
   else if (points > 3000)
   {
     System.out.println ("Apple, Blueberry, Extra Time, Orange, Plum, Robot"); 
   }
   
   
 }
}