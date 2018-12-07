public class tictactoe
{
  char a = (' ');
  char b = (' ');
  char c = (' ');
  char d = (' ');
  char e = (' ');
  char f = (' ');
  char g = (' ');
  char h = (' ');
  char i = (' ');
  public static void main (String args[])
  {
    new tictactoe ();
  }
  
  
  public void printboard ()
  {
    System.out.println ("\n\n     1   2   3 ");
    System.out.println (" 1   " + a + " | " + b + " | " + c + " ");
    System.out.println ("     ---------- ");
    System.out.println (" 2   " + d + " | " + e + " | " + f + " ");
    System.out.println ("     ---------- ");
    System.out.println (" 3   " + g + " | " + h + " | " + i + " ");
  }
  
  
  public void ifs (char p, int num)
  {
    int x = IBIO.inputInt ("Player " + num + "- Input the x: ");
    int y = IBIO.inputInt ("Player " + num + "- Input the y: ");
    
    
    if (x == 1 && y == 1)
      a = p;
    else if (x == 2 && y == 1)
      b = p;
    else if (x == 3 && y == 1)
      c = p;
    else if (x == 1 && y == 2)
      d = p;
    else if (x == 2 && y == 2)
      e = p;
    else if (x == 3 && y == 2)
      f = p;
    else if (x == 1 && y == 3)
      g = p;
    else if (x == 2 && y == 3)
      h = p;
    else if (x == 3 && y == 3)
      i = p;
    else
      System.out.println ("Invalid entry");
    
  }
  
  
  public tictactoe ()
  {
    System.out.println ("Tic Tac Toe");
    
    
    
    printboard ();
    System.out.println ("Here is the layout of the tic tac toe board. To put either x or o,\ninput the x and y coordinates of the desired location.");
    
    //1
    ifs ('x', 1);
    
    printboard ();
    
    
    
    
    
    //2
    int x1 = IBIO.inputInt ("Player 2- Input the x: ");
    int y1 = IBIO.inputInt ("Player 2- Input the y: ");
    
    
    ifs ('o', 1);
    
    
    printboard ();
    
    //3
    int x2 = IBIO.inputInt ("Player 1- Input the x: ");
    int y2 = IBIO.inputInt ("Player 1- Input the y: ");
    
    
    ifs ('x', 1);
    
    printboard ();
    
    //4
    int x3 = IBIO.inputInt ("Player 2- Input the x: ");
    int y3 = IBIO.inputInt ("Player 2- Input the y: ");
    
    
    ifs ('o', 1);
    
    
    printboard ();
    
    
    //5
    int x4 = IBIO.inputInt ("Player 1- Input the x: ");
    int y4 = IBIO.inputInt ("Player 1- Input the y: ");
    
    
    ifs ('x', 1);
    
    
    printboard ();
    
    
    if (((a == b && b == c) || (a == d && d == g)) || ((i == h && h == g) || (i == f && f == c))
          || ((a == e && e == i) || (c == e && e == g)))
      System.out.println ("\nPlayer 1 Wins!");
    else
    {
      
      //6
      ifs ('o', 1);
      
      
      printboard ();
      
      
      if (((a == b && b == c) || (a == d && d == g)) || ((i == h && h == g) || (i == f && f == c))
            || ((a == e && e == i) || (c == e && e == g)))
        System.out.println ("\nPlayer 2 Wins!");
      else
      {
        //7
        ifs ('x', 1);
        
        
        printboard ();
        
        
        if (((a == b && b == c) || (a == d && d == g)) || ((i == h && h == g) || (i == f && f == c))
              || ((a == e && e == i) || (c == e && e == g)))
          System.out.println ("\nPlayer 1 Wins!");
        else
        {
          //8
          ifs ('o', 1);
          
          
          printboard ();
          
          
          if (((a == b && b == c) || (a == d && d == g)) || ((i == h && h == g) || (i == f && f == c))
                || ((a == e && e == i) || (c == e && e == g)))
            System.out.println ("\nPlayer 2 Wins!");
          else
          {
            //9
            ifs ('x', 1);
            
            
            printboard ();
            
            
            if (((a == b && b == c) || (a == d && d == g)) || ((i == h && h == g) || (i == f && f == c))
                  || ((a == e && e == i) || (c == e && e == g)))
              System.out.println ("\nPlayer 1 Wins!");
            else
              System.out.println ("\nIt is a draw!");
            
            
            
          }
          
          
          
        }
        
        
        
      }
      
    }
    
    
    
    
    
    
    
    
  }
  
  
  
  
  
}
