public class rockPaperScissors
{
  public static void main (String args[])
  {
    new rockPaperScissors ();
  }
  
  /* On this program, you are working with a team....
   The responsibility of the other person on the team 
   was to code the constructor.
   Your job is to code the other methods.
   Follow the comments.
   You are not allowed to edit the constructor.
   */
  
  public rockPaperScissors ()
  {
    int cPoint = 0;
    int uPoint = 0;
    int game = 1;
    char playAgain = 'y';
    System.out.println ("-----Rock, Paper, Scissors------\n");
    while (playAgain == 'y')
    {
      
      char user = userChoice ();
      System.out.println ("You have selected " + user);
      char comp = compChoice ();
      System.out.println ("The computer has selected " + comp);
      char win = winner (user, comp);
      if (win == 'c')
      {
	cPoint++;
	System.out.println ("\nThe computer wins!");
      }
      else if (win == 'u')
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
    else 
	 return false;
  }
  
  
  public char userChoice ()
  { //print options: rock, paper, scissors
    
    
    int t = 1;
    String c = "rock";
    
    //ask for user's choice. will need to store in String
    
    //Loop: if invalid input, ask again
    while (t < 100)
    {
      c = IBIO.inputString ("Rock, paper or scissors? ");
      isValid (c);
      
      if (isValid (c) == true)
	t = 101;
      else
	System.out.println ("Error, Try again");
    }
    
    //stopping condition is the isValid method!!
    
    //If: transfer values - Rock, ROCK, rock, r, R - to r, etc.
    
    //return r, p or s
    char choice = 'r';
    if (c.equals ("Rock") || c.equals ("ROCK") || c.equals ("rock") || c.equals ("r") || c.equals ("R"))
	 choice = 'r';
    else if (c.equals ("Paper") || c.equals ("PAPER") || c.equals ("paper") || c.equals ("p") || c.equals ("P"))
	 choice = 'p'; 
    else if (c.equals ("Scissors") || c.equals ("SCISSORS") || c.equals ("scissors") || c.equals ("s") || c.equals ("S"))
	 choice = 's';
    return choice;
  }
  
  public char compChoice ()
  { //make a random number between 1 and 3
    //if the number is 1, return r; 2 return s; 3 return p
    int com = (int)(Math.random () * 3 + 1);
    
    
    if (com == 1)
      return 'r';
    else if (com == 2)
      return 's';
    else 
      return 'p';
  }
  
  
  public char winner (char comp, char user)
  { //comp and user both hold r, s, p
    //returns c for computer, u for user and b for both
    char winner = 'r';
    if ((comp == 'r' && user == 's') || (comp == 's' && user == 'p') || (comp == 'p' && user == 'r'))
       winner = 'u';
    else if ((comp == 's' && user == 'r') || (comp == 'p' && user == 's') || (comp == 'r' && user == 'p'))
       winner = 'c';
    else 
      winner = 'b';
    
    return winner;
  }
}
