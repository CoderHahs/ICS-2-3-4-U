public class tictactoewithai
{
  public static void main (String args[])
  {
    new tictactoewithai ();
  }
  
  
  /* Again, your job is to complete the code in the methods as specified */
  
  char at = ' ';
  char bt = ' ';
  char ct = ' ';
  char dt = ' ';
  char et = ' ';
  char ft = ' ';
  char gt = ' ';
  char ht = ' ';
  char it = ' ';
  
  char turn = 'x';
  int t = 1;
  boolean winner;
  
  public void tictactoewithai ()
  {     
      System.out.println ("Tic Tac Toe");
    
    
    
    printboardt ();
    System.out.println ("Here is the layout of the tic tac toe board. To put either x or o,\ninput the x and y coordinates of the desired location.");
    
    //1 
    playermove();
    printboardt ();
    
    
    
    
    
    //2
    compmove ();
    printboardt ();
    
    //3
    playermove ();
    
    printboardt ();
    
    //4
    compmove ();

    printboardt ();
    
    
    //5
    playermove ();  
    printboardt ();
    
    
    if (((at == bt && bt == ct) || (at == dt && dt == gt)) || ((it == ht && ht == gt) || (it == ft && ft == ct))
              || ((at == et && et == it) || (ct == et && et == gt) || (bt  == et && bt == ht)))
      System.out.println ("\nPlayer Wins!");
    else
    {
      
      //6
      compmove ();
      
      
      printboardt ();
      
      
      if (((at == bt && bt == ct) || (at == dt && dt == gt)) || ((it == ht && ht == gt) || (it == ft && ft == ct))
              || ((at == et && et == it) || (ct == et && et == gt) || (bt  == et && bt == ht)))
        System.out.println ("\nRobot Wins!");
      else
      {
        //7
        playermove();
        
        
        printboardt ();
        
        
        if (((at == bt && bt == ct) || (at == dt && dt == gt)) || ((it == ht && ht == gt) || (it == ft && ft == ct))
              || ((at == et && et == it) || (ct == et && et == gt) || (bt  == et && bt == ht)))
          System.out.println ("\nPlayer Wins!");
        else
        {
          //8
          compmove ();
          
          
          printboardt ();
          
          
          if (((at == bt && bt == ct) || (at == dt && dt == gt)) || ((it == ht && ht == gt) || (it == ft && ft == ct))
              || ((at == et && et == it) || (ct == et && et == gt) || (bt  == et && bt == ht)))
            System.out.println ("\nRobot Wins!");
          else
          {
            //9
            playermove ();
            
            
            printboardt ();
            
            
            if (((at == bt && bt == ct) || (at == dt && dt == gt)) || ((it == ht && ht == gt) || (it == ft && ft == ct))
              || ((at == et && et == it) || (ct == et && et == gt) || (bt  == et && bt == ht)))
              System.out.println ("\nPlayer Wins!");
            else
              System.out.println ("\nIt is a draw!");
            
            
            
          }
          
          
          
        }
        
        
        
      }
      
    } 
  }
  
  
  public void printboardt ()
  {
    /* Print out the board like this:
     1   2   3
     1  a | b | c
     ------------
     2  d | e | f
     ------------
     3  g | h | i
     Instead of actually printing a, b, c etc, output the variables in that postion
     */
    System.out.println ("   1   2   3");
    System.out.println ("1  "+at+" | "+bt+" | "+ct+"");
    System.out.println (" -------------");
    System.out.println ("2  "+dt+" | "+et+" | "+ft+"");
    System.out.println (" -------------");
    System.out.println ("3  "+gt+" | "+ht+" | "+it+"");
  }
  
  
  public void playermove ()
  {
    
    int xt = IBIO.inputInt ("\nPlayer- Input the x: ");
    int yt = IBIO.inputInt ("Player- Input the y: ");
     while (!isValidt (xt, yt))
    {
      System.out.println ("Error - invalid coordinate. Try again.");
      xt = IBIO.inputInt ("\nEnter the x-coordinate: ");
      yt = IBIO.inputInt ("Enter the y-coordinate: ");
    } 
     
    if (xt == 1 && yt == 1)
      at = 'x';
    else if (xt == 2 && yt == 1)
      bt = 'x';
    else if (xt == 3 && yt == 1)
      ct = 'x';
    else if (xt == 1 && yt == 2)
      dt = 'x';
    else if (xt == 2 && yt == 2)
      et = 'x';
    else if (xt == 3 && yt == 2)
      ft = 'x';
    else if (xt == 1 && yt == 3)
      gt = 'x';
    else if (xt == 2 && yt == 3)
      ht = 'x';
    else if (xt == 3 && yt == 3)
      it = 'x';
    
  }
  
  public void compmove ()
  {
    System.out.println ("\nComputer Move:\n");
    double xt = (Math.random () * 4) + 1;
    if (et == ' ')
      et = 'o';
    else if (at == ' ' && ct == ' ' && gt == ' ' && it == ' '){
      if (xt == 1)
        at = 'o';
      else if (xt == 2)
        ct = 'o';
      else if (xt == 3)
        gt = 'o';
      else
        it = 'o';
    }
    else if (bt == ' ' && dt == ' ' && ft == ' ' && ht == ' ')
    {
      if (xt == 1)
        bt = 'o';
      else if (xt == 2)
        dt = 'o';
      else if (xt == 3)
        ft = 'o';
      else
        ht = 'o';
    }
    else if (at == ' ')
      at = 'o';
    else if (ct == ' ')
      ct = 'o';
    else if (gt == ' ')
      gt = 'o';
    else if (it == ' ')
      it = 'o';
    else if (bt == ' ')
      bt = 'o';
    else if (dt == ' ')
      dt = 'o';
    else if (ft == ' ')
      ft = 'o';
    else if (ht == ' ')
      ht = 'o';
  }
  
  public boolean isValidt (int x, int y)
  {
    //make it return false if invalid
    // eg, x and y must be between 1 and 3
    // also the position can not be full (eg. if x==1 && y==1 && a!=' ') - then they picked postion a AND it is full
    if (x == 1 && y == 1 && at!=' ')
      return false;
    else if (x == 2 && y == 1 && bt!=' ')
      return false;
    else if (x == 3 && y == 1 && ct!=' ')
      return false;
    else if (x == 1 && y == 2 && dt!=' ')
      return false;
    else if (x == 2 && y == 2 && et!=' ')
      return false;
    else if (x == 3 && y == 2 && ft!=' ')
      return false;
    else if (x == 1 && y == 3 && gt!=' ')
      return false;
    else if (x == 2 && y == 3 && ht!=' ')
      return false;
    else if (x == 3 && y == 3 && it!=' ')
      return false;
    else if (x > 3 || y > 3 || x < 0 || y < 0)
      return false;
    else
      return true;
  }
  
  
  public boolean winner ()
  { //the first line a-b-c is a match
    if (a == b && a == c && a != ' ')
      return true;
    else if (d == e && d == f && d != ' ')
      return true;
    else if (g == h && g == i && g != ' ')
      return true;
    else if (a == d && a == g && a != ' ')
      return true;
    else if (b == e && b == h && b != ' ')
      return true;
    else if (c == f && c == i && c != ' ')
      return true;
    else if (a == e && a == i && a != ' ')
      return true;
    else if (c == e && c == g && c != ' ')
      return true;
    //complete the other 7 winning conditions
    
    
    else
      return false;
  }
  
  
  public char printWinner ()
  { //returns who is in the winning condition
    if (a == b && a == c && a != ' ')
      return a;
    else if (d == e && d == f && d != ' ')
      return d;
    else if (g == h && g == i && g != ' ')
      return g;
    else if (a == d && a == g && a != ' ')
      return a;
    else if (b == e && b == h && b != ' ')
      return b;
    else if (c == f && c == i && c != ' ')
      return c;
    else if (a == e && a == i && a != ' ')
      return a;
    else if (c == e && c == g && c != ' ')
      return c;
    //complete the other six positions
    
    
    
    else //if (c == e && c == g && c != ' ') - diagonal backwards
      return c;
    
  }
}
