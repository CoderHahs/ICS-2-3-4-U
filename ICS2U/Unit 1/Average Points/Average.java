public class Average
{
  public static void main (String args [])
  {
    new Average ();
  } 

  public Average () 
  {
      System.out.println ("Dumb Ways to Die");
      System.out.println ("\nAverage Score");
      System.out.println ("Enter the score earned by each player in the game.");
      int score1 = IBIO.inputInt("What is player #1�s score? ");
      int score2 = IBIO.inputInt("What is player #2�s score? ");
      int score3 = IBIO.inputInt("What is player #3�s score? ");
      int score4 = IBIO.inputInt("What is player #4�s score? ");
      int score5 = IBIO.inputInt("What is player #5�s score? ");
      int score6 = IBIO.inputInt("What is player #6�s score? ");
      int averagescore = (score1 + score2 + score3 + score4 + score5 + score6)/6;
      
      System.out.println ("\nThere were six players.");
      System.out.println ("The average score was " +averagescore);
 
  }
}
