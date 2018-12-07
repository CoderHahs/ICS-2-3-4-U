public class rockPaperScissorsLizardSpock
{
  public static void main (String args[])
  {
    new rockPaperScissorsLizardSpock ();
  }
  
  /* On this program, you are working with a team....
   The responsibility of the other person on the team 
   was to code the constructor.
   Your job is to code the other methods.
   Follow the comments.
   You are not allowed to edit the constructor.
   */
  
  public rockPaperScissorsLizardSpock ()
  {
    int cPoint = 0;
    int uPoint = 0;
    int game = 1;
    char playAgain = 'y';
    System.out.println ("-----Rock, Paper, Scissors------\n");
    while (playAgain == 'y')
    {
      
      String user = userChoice ();
      System.out.println ("You have selected " + user);
      String comp = compChoice ();
      System.out.println ("The computer has selected " + comp);
      String win = winner (user, comp);
      if (win.equals ("c"))
      {
	cPoint++;
	System.out.println ("\nThe computer wins!");
      }
      else if (win.equals ("u"))
      {
	uPoint++;
	System.out.println ("\nYou win!");
	
      }
      else
	System.out.println ("\nThere is a tie!");
      System.out.println ("Points: You: " + uPoint + " Computer: " + cPoint);
      playAgain = IBIO.inputChar ("\nPlay again? (y/n) ");
      System.out.println ("");
    }
    System.out.println ("Goodbye!");
  }
  
  
  public boolean isValid (String c)
  {
    /* All valid data:
     Rock, ROCK, rock, r, R
     Paper, PAPER, paper, p, P
     Scissors, SCISSORS, scissors, s, S
     return true if valid, false otherwise
     */
    if (c.equals ("Rock") || c.equals ("ROCK") || c.equals ("rock") || c.equals ("r") || c.equals ("R"))
	 return true;
    else if (c.equals ("Paper") || c.equals ("PAPER") || c.equals ("paper") || c.equals ("p") || c.equals ("P"))
	 return true; 
    else if (c.equals ("Scissors") || c.equals ("SCISSORS") || c.equals ("scissors") || c.equals ("s") || c.equals ("S"))
	 return true;
    else if (c.equals ("Lizard") || c.equals ("LIZARD") || c.equals ("lizard") || c.equals ("l") || c.equals ("L"))
	 return true;
    else if (c.equals ("Spock") || c.equals ("SPOCK") || c.equals ("spock") || c.equals ("sp") || c.equals ("SP"))
	 return true;
    else 
	 return false;
  }
  
  
  public String userChoice ()
  { //print options: rock, paper, scissors
    
    
    int t = 1;
    String c = "rock";
    
    //ask for user"s choice. will need to store in String
    
    //Loop: if invalid input, ask again
    while (t < 100)
    {
      c = IBIO.inputString ("Rock, paper, scissors, lizard or spock? ");
      isValid (c);
      
      if (isValid (c) == true)
	t = 101;
      else
	System.out.println ("Error, Try again");
    }
    
    //stopping condition is the isValid method!!
    
    //If: transfer values - Rock, ROCK, rock, r, R - to r, etc.
    
    //return r, p or s
    String choice = "r";
    if (c.equals ("Rock") || c.equals ("ROCK") || c.equals ("rock") || c.equals ("r") || c.equals ("R"))
	 choice = "r";
    else if (c.equals ("Paper") || c.equals ("PAPER") || c.equals ("paper") || c.equals ("p") || c.equals ("P"))
	 choice = "p"; 
    else if (c.equals ("Scissors") || c.equals ("SCISSORS") || c.equals ("scissors") || c.equals ("s") || c.equals ("S"))
	 choice = "s";
    else if (c.equals ("Lizard") || c.equals ("LIZARD") || c.equals ("lizard") || c.equals ("l") || c.equals ("L"))
	 choice = "l";
    else if (c.equals ("Spock") || c.equals ("SPOCK") || c.equals ("spock") || c.equals ("sp") || c.equals ("SP"))
	 choice = "sp";
    return choice;
  }
  
  public String compChoice ()
  { //make a random number between 1 and 3
    //if the number is 1, return r; 2 return s; 3 return p
    int com = (int)(Math.random () * 5 + 1);
    
    
    if (com == 1)
      return "r";
    else if (com == 2)
      return "s";
    else if (com == 3)
      return "l";
    else if (com == 4)
      return "sp";
    else 
      return "p";
  }
  
  
  public String winner (String comp, String user)
  { //comp and user both hold r, s, p
    //returns c for computer, u for user and b for both
    String winner = "r";
    if ((comp.equals ("r") && user.equals ("s")) || (comp.equals ("s") && user.equals ("p")) || (comp.equals ("p") && user.equals ("r")) || (comp.equals ("l") && user.equals ("p")) || (comp.equals ("l") && user.equals ("sp")) || (comp.equals ("sp") && user.equals ("r")) || (comp.equals ("sp") && user.equals ("s")) || (comp.equals ("r") && user.equals ("l")) || (comp.equals ("p") && user.equals ("sp")) || (comp.equals ("s") && user.equals ("l")))
       winner = "u";
    else if ((comp.equals ("s") && user.equals ("r")) || (comp.equals ("p") && user.equals ("s")) || (comp.equals ("r") && user.equals ("p")) || (comp.equals ("p") && user.equals ("l")) || (comp.equals ("sp") && user.equals ("l")) || (comp.equals ("r") && user .equals ("sp")) || (comp.equals ("s") && user.equals ("sp")) || (comp.equals ("l") && user.equals ("r")) || (comp.equals ("sp") && user.equals ("p")) || (comp.equals ("l") && user.equals ("s")))
       winner = "c";
    else 
      winner = "b";
    
    return winner;
  }
}
