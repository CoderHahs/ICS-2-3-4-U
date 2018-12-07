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
      int score1 = IBIO.inputInt("What is player #1Õs score? ");
      int score2 = IBIO.inputInt("What is player #2Õs score? ");
      int score3 = IBIO.inputInt("What is player #3Õs score? ");
      int score4 = IBIO.inputInt("What is player #4Õs score? ");
      int score5 = IBIO.inputInt("What is player #5Õs score? ");
      int score6 = IBIO.inputInt("What is player #6Õs score? ");
      int averagescore = (score1 + score2 + score3 + score4 + score5 + score6)/6;
      
      System.out.println ("\nThere were six players.");
      System.out.println ("The average score was " +averagescore);
 
  }
}
