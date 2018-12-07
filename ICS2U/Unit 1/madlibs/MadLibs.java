public class MadLibs
{
 public static void main (String args [])
 {
 new MadLibs ();
 }
 public MadLibs ()
 {
 String name = IBIO.inputString ("Enter a made-up name: ");
 String name2 = IBIO.inputString ("Enter a another made-up name: ");
 String col = IBIO.inputString ("Enter a colour: ");
 String col2 = IBIO.inputString ("Enter another colour: ");
 String num = IBIO.inputString("Enter a number for diameter: ");
 String num2 = IBIO.inputString("Enter another number for weight: ");
 String planet = IBIO.inputString ("Enter a madeup planet name: ");
 String theend = IBIO.inputString ("Enter a ending: ");
 System.out.println ("");
 System.out.println ("To the " +planet+ " ....");
 System.out.println ("There was a boy named " +name+ " who dreamed to go to Planet "+planet );
 System.out.println ("This planet is "+col+" and "+col2+" in colour");
 System.out.println ("It is "+num+" metres in diameter and "+num2+" kg in mass");
 System.out.println (name2+ " , his mother, said that first he needs to build a big spaceship to get him there.");
 System.out.println ("\n\n"+theend);
 }
}
