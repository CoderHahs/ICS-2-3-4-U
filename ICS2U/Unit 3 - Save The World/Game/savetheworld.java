// This game was made by Hrithik Shah for a School Project.
// I do not take credit of any ASCII art found in this game.
/*
 List of Credits: jgs (Solder Ascii Art), Lumosity's Pinball Recall (Last Game), Inventor of TicTacToe (Third Game), http://www.chris.com/ascii/ (most of the ascii art), http://www.glassgiant.com/ascii/ (converting ascii art), http://patorjk.com/software/taag/#p=display&f=Graffiti&t=Type%20Something%20 (text ascii art)
 images: https://www.google.ca/search?q=east+and+west+earth&safe=strict&espv=2&biw=630&bih=902&source=lnms&tbm=isch&sa=X&ved=0CAYQ_AUoAWoVChMIxre50c2DyQIVTMtjCh13jgnB#imgrc=9_ls9DkwpM0H8M%3A
 http://www.chris.com/ascii/joan/www.geocities.com/SoHo/7373/men.html#soldiers
 http://www.asciiworld.com/-Robots,24-.html
 https://www.google.ca/search?q=spy+clipart&safe=strict&espv=2&biw=1280&bih=923&source=lnms&tbm=isch&sa=X&ved=0CAYQ_AUoAWoVChMI64_VuM6DyQIV0ymICh1e1A91#safe=strict&tbm=isch&q=spy+&imgrc=4ngmLByswTUYzM%3A
 http://www.chris.com/ascii/index.php?art=objects/computers
 */
import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.text.*;

public class savetheworld
{
  public static void main (String args[])
  {
    new savetheworld ();
  } // end of main
  
  
  // variable for tictactoe
  char at = ' ';
  char bt = ' ';
  char ct = ' ';
  char dt = ' ';
  char et = ' ';
  char ft = ' ';
  char gt = ' ';
  char ht = ' ';
  char it = ' ';
  
  
  public savetheworld ()
  {
    // setting variables for Recall
    char a = ' ';
    char b = ' ';
    char c = ' ';
    char d = ' ';
    char e = ' ';
    char f = ' ';
    char g = ' ';
    char h = ' ';
    char i = ' ';
    char j = ' ';
    char k = ' ';
    char l = ' ';
    char m = ' ';
    char n = ' ';
    char o = ' ';
    char p = ' ';
    char q = ' ';
    char r = ' ';
    char s = ' ';
    char t = ' ';
    char u = ' ';
    char v = ' ';
    char w = ' ';
    char x = ' ';
    char y = ' ';
    char ans = ' ';
    char ans1 = ' ';
    int lives = 3;
    int ac = 0;
    int qc = 0;
    char point = ' ';
    
    
    
    //variable for score
    int score = 0;
    // introducing storyline here. getting some aspects of the player too.
    ps ("Loading . . .");
    try
    {
      Thread.sleep (1500);
    }
    catch (InterruptedException ex)
    {
    }
    titlepic ();
    try
    {
      Thread.sleep (1500);
    }
    catch (InterruptedException ex)
    {
    }
    
    
    ps ("Welcome to...\n\n");
    pstitle ("     _______.     ___   ____    ____  _______    .___________. __    __   _______    ____    __    ____  ______   .______       __       _______");
    pstitle ("    /       |    /   \\  \\   \\  /   / |   ____|   |           ||  |  |  | |   ____|   \\   \\  /  \\  /   / /  __  \\  |   _  \\     |  |     |       \\ ");
    pstitle ("   |   (----`   /  ^  \\  \\   \\/   /  |  |__      `---|  |----`|  |__|  | |  |__       \\   \\/    \\/   / |  |  |  | |  |_)  |    |  |     |  .--.  |");
    pstitle ("    \\   \\      /  /_\\  \\  \\      /   |   __|         |  |     |   __   | |   __|       \\            /  |  |  |  | |      /     |  |     |  |  |  |");
    pstitle (".----)   |    /  _____  \\  \\    /    |  |____        |  |     |  |  |  | |  |____       \\    /\\    /   |  `--'  | |  |\\  \\----.|  `----.|  '--'  |");
    pstitle ("|_______/    /__/     \\__\\  \\__/     |_______|       |__|     |__|  |__| |_______|       \\__/  \\__/     \\______/  | _| `._____||_______||_______/ ");
    char areyouready = IBIO.inputChar ("\n\n\nDo you have what it takes to save billions of lives?  (y/n)");
    boolean a1 = isValid (areyouready);
    
    while (a1 == false)
    {
      ps ("Come back when you are ready! Your Score: " + score);
      areyouready = IBIO.inputChar ("\nAre you ready to save billions of lives?  (y/n)");
      a1 = isValid (areyouready);
    }
    score += 10;
    
    
    
    //scenes start
    
    String realdate = realdate ();
    String scene = ("\nGood!\nThe date is " + realdate + " but several years from now, around 2045, \nthe world is a very different place, then what you once knew.\nThe world's fresh water reserves have almost depleted and water costs 5 times more than oil.\nThe world has been split into two nations. East and west.");
    String scene11 = ("\nThe Eastern Nation consiting of powerful countries such as Russia and North Korea \nis planning to attack the Western Nation with their nuclear missles.\nYou are a spy working for the WSS (Western Secret Society). \nYour mission, should you choose to accept, is to infiltrate the ESS (Eastern Secret Society) \nand stop the nuclear missles from getting launched.");
    ps (scene);
    System.out.println ("\n\n        ");
    System.out.println ("                 ++  ~?????I                :$O                         ");
    System.out.println ("    ????????$?$?O  ?  ???        $$$$$$$$$$$$$$$$$$$$$$$$$$8            ");
    System.out.println ("      ?+.8????????   ?    ?        $$:8$$$$$$$$$$$$$$$$$$$$$$ $7            ");
    System.out.println ("      ??????????????        ?? $$$$$$$$$$$$$$$$$$$$$$$$$O  .           ");
    System.out.println ("      ???????I????            $$$$$$$$$+$$$$$$$$$$$$$$$$$               ");
    System.out.println ("     ??????????             ??.   8$$$$$ $$$$$$$$$$$$$.$  :             ");
    System.out.println ("      ???????               ??$$$ $  $$$$$$$$$$$$$$$$$$                 ");
    System.out.println ("      .??                  ???$$$$$$$.$$8$OO$$$$$$$$$$$8                ");
    System.out.println ("        ???   ?+          +???$$$$$$$$ $$$   $$$  $$?                   ");
    System.out.println ("           ?  ~ D         +???$$$$$$$$$       $     $   ~               ");
    System.out.println ("             ?????+         Z$ $$$$$$$$$     O    $D  +8                ");
    System.out.println ("            ??????+?            $$$$$$$            . 8$   $I            ");
    System.out.println ("             ?????????          $$$$$$                O$    $$ +        ");
    System.out.println ("             +???????~          $$$$$$O Z               ?$$ $    O      ");
    System.out.println ("   Western     ??????            $$$$  $              $$$$$$$$          ");
    System.out.println ("    Nation     ????Z             $$$Z                 $$$$$$$$          ");
    System.out.println ("               ???                    Eastern             $$$  =      ");
    System.out.println ("                ?                     Nation                 '        ");
    System.out.println ("                ?                                                   ");
    System.out.println ("Different Nations\n\n");
    ps (scene11);
    //skip (scene);
    char accept = IBIO.inputChar ("Do you accept?  (y/n)");
    boolean b1 = isValid (accept);
    while (b1 == false)
    {
      score -= 5;
      ps ("Come back when you are ready! Your score: " + score);
      accept = IBIO.inputChar ("\nAre you ready to accept?  (y/n)");
      b1 = isValid (accept);
    }
    score += 10;
    ps ("");
    
    // first options come here.
    String scene2 = ("\nYour first task is to go to North Korea and infiltrate the ESS. \n\n\n * * * * * * * * * * * * * * * * * * * * *\n\n\nEastern Secret Society HQ1, North Korea... ");
    String scene21 = ("\n\nSoldier: You there! What are you doing? Don't you know that this is a military base. \nOnly soldiers or staff members are allowed to have access to this facility.\n\nWhat will you do? Will you:\na) run away \nb) run into the building \nc) say you are a staff member \nd) knock the soldier out");
    ps (scene2);
    pstitle ("\n\n\n         .---.");
    pstitle ("        /_____\\");
    pstitle ("        ( '.' )");
    pstitle ("         \\_-_/_");
    pstitle ("      .-\"`'V'\\/\\/-.");
    pstitle ("     / ,   |// , \\");
    pstitle ("    / /|Ll //Ll|\\ \\");
    pstitle ("   / / |__//   | \\_\\");
    pstitle ("   \\ \\/---|[]==| / /");
    pstitle ("    \\/\\__/ |   \\/\\/ ");
    pstitle ("     |/_   | Ll_\\|");
    pstitle ("       |`^\"\"\"^`| ");
    pstitle ("       |   |   |");
    pstitle ("       |   |   |");
    pstitle ("       |   |   |");
    pstitle ("       |   |   |");
    pstitle ("       L___l___J");
    pstitle ("        |_ | _|");
    pstitle ("       (___|___)");
    ps (scene21);
    // skip (scene2);
    gameover (score);
    score += 50;
    ps ("\n\nYour score: " + score + "\n\n");
    
    String name = IBIO.inputString ("\nSoldier: Oh. Okay, what is your name? ");
    String scene3 = ("\n" + name + "... I see. Can I see your ID? (You show him your forged ID) What department are you working for? I'll take you there. \nYour options: \na) Military Enhancements \nb) Political Campaigns \nc) Nuclear Power \nd) Drones and Tech");
    ps (scene3);
    // skip (scene3);
    gameover (score);
    score += 50;
    ps ("\n\nYour score: " + score + "\n\n");
    
    String scene4 = ("\nSoldier: Here you are. This is Dr.Straker, the head of our Nuclear Power department. \nDr. Straker: Greetings, Sergeant Steve, who have we here...?\nSteve: This is " + name + ", who will be joining your team as of today.\nDr. Straker: Hmmm. Let's see. What are your qualifications? (You tell him that you have done your Ph.D in nuclear engineering)\nThen I guess I will have you working with Dr. Mordaunt. \nSteve: I will be taking your leave now.\n");
    ps (scene4);
    //skip (scene4);
    String scene5 = ("\nDr. Mordaunt: Hello, " + name + ". \nYou: What are we doing? \nDr. Mordaunt: We are making nuclear heads for the nuclear missiles. \nYou: Do you know when the missiles will be launched? \nDr. Mordaunt: Tomorrow.\nYou: Where are they being launched from? \nDr. Mordaunt: Only the higher ups have information on this. Their office should be on the top floor if you want to know. \n\nWhat will you do? Will you: \na) Continue talking to Mr. Mordaunt \nb) Go talk to Dr. cStraker \nc) Go to the top floor \nd) Leave the building");
    ps (scene5);
    //skip (scene5);
    gameover (score);
    score += 50;
    ps ("\n\nYour score: " + score + "\n\n");
    
    String scene6 = ("You decide to head to the top floor. There you notice a keypad that will open an entrance to a room. The keypad asks you for a password. \nThe password can only be obtained if you know the answer to a riddle. \n\nThe screen shows: \n");
    ps (scene6);
    // skip (scene6);
    riddle (score);
    score += 100;
    ps ("\n\nYour score: " + score + "\n\n");
    
    
    String scene7 = ("\nOnce you are in the room, you notice a wall with a bunch of papers. \nOn a desk, there is an envelop that reads \"Confidential\". ");
    String scene71 = ("You decide to open it. \nThe message reads, \"het clreanu sisilsem ilwl eb uanhedcl morf ussiaR.");
    ps (scene7);
    JOptionPane.showMessageDialog (null, createImageIcon ("confidential.jpeg"), "What you saw...", JOptionPane.INFORMATION_MESSAGE);
    ps (scene71);
    anagram (score);
    ps ("\n\nYour score: " + score + "\n\n");
    
    String scene8 = ("\nThe message says: \"The nuclear missiles will be launched from Russia.\"\nYou decide to go to Russia to stop the missiles from being launched. \n\n\n * * * * * * * * * * * * * * * * * * * *\n\n\nEastern Secrety Society HQ2, Russia: \n\nYou have been told by your associates that the top floor of the headquarters will be where the launch will be initiated. \nOnce you get to the top floor, you see a robot. This robot will only let you enter the room, \nif you beat it in a game of tic-tac-toe.");
    ps (scene8);
    // skip (scene8);
    System.out.println ("                _______");
    System.out.println ("              _/       \\");
    System.out.println ("             / |       | \\");
    System.out.println ("            /  |__   __|  \\");
    System.out.println ("           |__/((o| |o))\\__|");
    System.out.println ("           |      | |      |");
    System.out.println ("           |\\     |_|     /|");
    System.out.println ("           | \\           / |");
    System.out.println ("            \\| /  ___  \\ |/");
    System.out.println ("             \\ | / _ \\ | /");
    System.out.println ("              \\_________/");
    System.out.println ("               _|_____|_");
    System.out.println ("          ____|_________|____");
    System.out.println ("         /                   \\\n\n");
    
    int xtic = tictactoewithai ();
    ps ("");
    ps ("");
    printboardt ();
    if (xtic == 1)
      ps ("The winner is the player");
    else if (xtic == 2)
      ps ("The winner is the robot");
    else
      ps ("It's a cat's game (tie!)");
    
    
    if (xtic == 1)
      score += 200;
    else
    {
      score = score;
      ps ("Game Over");
      ps ("\n\nYour score: " + score + "\n\n");
    }
    
    
    
    
    String scene9 = ("\nOnce inside the room, you notice a computer that has a grid on it. \nThis grid contains which country (represented by points) will be targeting. \nYour job is to figure out where each missile will be going. \nThis will stop them from hitting the designated country in time. \nThe different /s and \\s will effect the direction of the missile. \nThe different bars function the same way as in pinball. \n\nGet ready... the missiles are being launched.");
    ps (scene9);
    
    int i1 = 1;
    double z = 1;
    while (lives > 0 && i1 < 11)
    {
      if (i1 == 1)
        ans = 'R';
      else if (i1 == 2)
        ans = 'E';
      else if (i1 == 3)
        ans = 'M';
      else if (i1 == 4)
        ans = 'H';
      else if (i1 == 5)
        ans = 'P';
      else if (i1 == 6)
        ans = 'E';
      else if (i1 == 7)
        ans = 'C';
      else if (i1 == 8)
        ans = 'M';
      else if (i1 == 9)
        ans = 'B';
      else
        ans = 'F';
      if (i1 == 1)
        ans = 'r';
      else if (i1 == 2)
        ans = 'e';
      else if (i1 == 3)
        ans = 'm';
      else if (i1 == 4)
        ans = 'h';
      else if (i1 == 5)
        ans = 'p';
      else if (i1 == 6)
        ans = 'e';
      else if (i1 == 7)
        ans = 'c';
      else if (i1 == 8)
        ans = 'm';
      else if (i1 == 9)
        ans = 'b';
      else
        ans = 'f';
      
      if (i1 == 1)
      {
        j = '\\';
        h = '/';
        l = '\\';
        o = '/';
      }
      else if (i1 == 2)
      {
        a = '/';
        e = '/';
        i = '/';
        p = '\\';
        s = '/';
      }
      else if (i1 == 3)
      {
        h = '/';
        j = '\\';
        n = '/';
        o = '/';
        r = '/';
        s = '\\';
      }
      else if (i1 == 4)
      {
        a = '/';
        c = '\\';
        g = '\\';
        i = '/';
      }
      else if (i1 == 5)
      {
        h = '/';
        i = '/';
        p = '/';
        r = '/';
      }
      else if (i1 == 6)
      {
        b = '/';
        c = '/';
        f = '\\';
        i = '/';
        l = '\\';
      }
      else if (i1 == 7)
      {
        g = '/';
        h = '/';
        o = '\\';
        s = '/';
        v = '\\';
        y = '/';
      }
      else if (i1 == 8)
      {
        a = '\\';
        h = '/';
        j = '\\';
        k = '\\';
        m = '/';
        t = '\\';
      }
      else if (i1 == 9)
      {
        b = '\\';
        c = '\\';
        g = '/';
        i = '\\';
        p = '/';
        q = '/';
        u = '\\';
        w = '/';
      }
      else
      {
        b = '\\';
        c = '/';
        e = '\\';
        g = '\\';
        h = '/';
        i = '/';
        j = '/';
        n = '\\';
        o = '\\';
        q = '\\';
        r = '\\';
        w = '\\';
        y = '/';
      }
      
      //(Math.random () * 10) + 1;
      try
      {
        Thread.sleep (500);
      }
      catch (InterruptedException ex)
      {
      }
      printplainboardwithscore (ac, qc, z, lives);
      try
      {
        Thread.sleep (1500);
      }
      catch (InterruptedException ex)
      {
      }
      printboardwithinput (z, a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, i1);
      try
      {
        Thread.sleep (500);
      }
      catch (InterruptedException ex)
      {
      }
      
      a = ' ';
      b = ' ';
      c = ' ';
      d = ' ';
      e = ' ';
      f = ' ';
      g = ' ';
      h = ' ';
      i = ' ';
      j = ' ';
      k = ' ';
      l = ' ';
      m = ' ';
      n = ' ';
      o = ' ';
      p = ' ';
      q = ' ';
      r = ' ';
      s = ' ';
      t = ' ';
      u = ' ';
      v = ' ';
      w = ' ';
      x = ' ';
      y = ' ';
      
      if (i1 == 1)
        point = 'B';
      else if (i1 == 2)
        point = 'I';
      else if (i1 == 3)
        point = 'L';
      else if (i1 == 4)
        point = 'Q';
      else if (i1 == 5)
        point = 'D';
      else if (i1 == 6)
        point = 'T';
      else if (i1 == 7)
        point = 'J';
      else if (i1 == 8)
        point = 'F';
      else if (i1 == 9)
        point = 'S';
      else
        point = 'H';
      
      
      printplainboard ();
      
      char guess = ' ';
      
      guess = IBIO.inputChar ("The missile is launched from Point " + point + ". Which Point will the missile hit? ");
      
      while (guess != 'a' && guess != 'A' && guess != 'b' && guess != 'B' && guess != 'c' && guess != 'C' && guess != 'd' && guess != 'D' && guess != 'e' && guess != 'E' && guess != 'f' && guess != 'F' && guess != 'g' && guess != 'G' && guess != 'h' && guess != 'H' && guess != 'i' && guess != 'I' && guess != 'j' && guess != 'J' && guess != 'k' && guess != 'K' && guess != 'l' && guess != 'L' && guess != 'm' && guess != 'M' && guess != 'n' && guess != 'N' && guess != 'o' && guess != 'O' && guess != 'p' && guess != 'P' && guess != 'q' && guess != 'Q' && guess != 'r' && guess != 'R' && guess != 's' && guess != 'S' && guess != 't' && guess != 'T')
      {
        System.out.println ("\nNot a Point. Try again.");
        guess = IBIO.inputChar ("If the missile is launched from Point " + point + ", which Point will the missile hit? ");
      }
      
      if (guess == ans || guess == ans1)
      {
        ac++;
        ps ("Correct!");
      }
      else
      {
        ps ("Wrong.");
        lives--;
      }
      qc++;
      z++;
      i1++;
      if (lives == 0)
      {
        i1 = 11;
        ps ("Game Over");
      }
    }
    printplainboardwithscore (ac, qc, 10, lives);
    
    if (ac < 1)
      score = score;
    else if (ac < 6)
      score += 200;
    else if (ac < 8)
      score += 400;
    else if (score < 9)
      score += 600;
    else
      score += 1000;
    
    if (ac <= 5 )
    {
      pstitle ("  _______  _______  __   __  _______    _______  __   __  _______  ______  ");
      pstitle (" |       ||   _   ||  |_|  ||       |  |       ||  | |  ||       ||    _ |  ");
      pstitle (" |    ___||  |_|  ||       ||    ___|  |   _   ||  |_|  ||    ___||   | || ");
      pstitle (" |   | __ |       ||       ||   |___   |  | |  ||       ||   |___ |   |_||_ ");
      pstitle (" |   ||  ||       ||       ||    ___|  |  |_|  ||       ||    ___||    __  |");
      pstitle (" |   |_| ||   _   || ||_|| ||   |___   |       | |     | |   |___ |   |  | |");
      pstitle (" |_______||__| |__||_|   |_||_______|  |_______|  |___|  |_______||___|  |_|");
      ps ("                                 Your Score: " + score);
      ps ("                                 Mission was a fail.");
    }
    else
    {
      pstitle (" __   __  _______  __   __    _______  _______  __   __  _______  ______     _______  __   __  _______    _     _  _______  ______    ___      ______   __ ");
      pstitle ("|  | |  ||       ||  | |  |  |       ||   _   ||  | |  ||       ||      |   |       ||  | |  ||       |  | | _ | ||       ||    _ |  |   |    |      | |  |");
      pstitle ("|  |_|  ||   _   ||  | |  |  |  _____||  |_|  ||  |_|  ||    ___||  _    |  |_     _||  |_|  ||    ___|  | || || ||   _   ||   | ||  |   |    |  _    ||  |");
      pstitle ("|       ||  | |  ||  |_|  |  | |_____ |       ||       ||   |___ | | |   |    |   |  |       ||   |___   |       ||  | |  ||   |_||_ |   |    | | |   ||  |");
      pstitle ("|_     _||  |_|  ||       |  |_____  ||       ||       ||    ___|| |_|   |    |   |  |       ||    ___|  |       ||  |_|  ||    __  ||   |___ | |_|   ||__|");
      pstitle ("  |   |  |       ||       |   _____| ||   _   | |     | |   |___ |       |    |   |  |   _   ||   |___   |   _   ||       ||   |  | ||       ||       | __ ");
      pstitle ("  |___|  |_______||_______|  |_______||__| |__|  |___|  |_______||______|     |___|  |__| |__||_______|  |__| |__||_______||___|  |_||_______||______| |__|");
      ps ("                                                                    Your Score: " + score);
      ps ("                                                           Congratulations. Mission was succesful.");
    }
    
    ps ("\n\n\nThank you for playing the Game. This game was made by Hrithik Shah.");
  } // end of save the world
  
  
  protected static ImageIcon createImageIcon (String path)
  { //change the red to your class name
    java.net.URL imgURL = savetheworld.class.getResource (path);
    if (imgURL != null)
    {
      return new ImageIcon (imgURL);
    }
    else
    {
      System.err.println ("Couldn't find file: " + path);
      return null;
    }
  } // end of createImageicon
  
  
  public int tictactoewithai ()
  {
    printboardt ();
    ps ("\n\nHere is the layout of the tic tac toe board. To put either x or o,\ninput the x and y coordinates of the desired location.\n\n");
    int counter = 1;
    int t = 1;
    String winner = "player";
    boolean winnerx = false;
    
    while (winnerx == false)
    {
      ps ("Turn " + counter);
      playermove ();
      winner = "player";
      printboardt ();
      if (winnert () == true)
      {
        winnerx = true;
        return 1;
      }
      else if (at != ' ' && bt != ' ' && ct != ' ' && dt != ' ' && et != ' ' && ft != ' ' && gt != ' ' && ht != ' ' && it != ' ' && winnert () == false)
      {
        winnerx = true;
        t = 3;
        return 3;
      }
      robotmove ();
      winner = "computer";
      printboardt ();
      if (winnert () == true)
      {
        winnerx = true;
        return 2;
      }
      else if (at != ' ' && bt != ' ' && ct != ' ' && dt != ' ' && et != ' ' && ft != ' ' && gt != ' ' && ht != ' ' && it != ' ' && winnert () == false)
      {
        winnerx = true;
        t = 3;
        return 3;
      }
      counter++;
    }
    printboardt ();
    if (t < 2)
      ps ("The winner is " + winner);
    else
      ps ("It's a cat's game (tie!)");
    
    
    if (winner.equals ("player"))
      return 1;
    else if (winner.equals ("computer"))
      return 2;
    else
      return 3;
    
  } // end of tictactoewithai
  
  
  public boolean winnert ()
  {
    if ((at == bt && at == ct && at != ' ') || (dt == et && dt == ft && dt != ' ') || (gt == ht && gt == it && gt != ' ') || (at == dt && at == gt && at != ' ') || (bt == et && bt == ht && bt != ' ') || (ct == ft && ct == it && ct != ' ') || (at == et && at == it && at != ' ') || (ct == et && ct == gt && ct != ' '))
      return true;
    else
      return false;
  } // end of winnert
  
  
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
    System.out.println ("1  " + at + " | " + bt + " | " + ct + "");
    System.out.println (" -------------");
    System.out.println ("2  " + dt + " | " + et + " | " + ft + "");
    System.out.println (" -------------");
    System.out.println ("3  " + gt + " | " + ht + " | " + it + "");
  } // end of printboardt
  
  
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
    
  } // end of playermove
  
  
  public void robotmove ()
  {
    // the strategy for the robot is that it will move in the center, then the corners and then the sides as long as it is not already taken.
    System.out.println ("\nRobot Move:\n");
    double xt = (Math.random () * 4) + 1;
    if (et == ' ')
      et = 'o';
    else if (at == ' ' && ct == ' ' && gt == ' ' && it == ' ')
    {
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
  } // end of robotmove
  
  
  public boolean isValidt (int x, int y)
  {
    //make it return false if invalid
    // eg, x and y must be between 1 and 3
    // also the position can not be full (eg. if x==1 && y==1 && a!=' ') - then they picked postion a AND it is full
    if (x == 1 && y == 1 && at != ' ')
      return false;
    else if (x == 2 && y == 1 && bt != ' ')
      return false;
    else if (x == 3 && y == 1 && ct != ' ')
      return false;
    else if (x == 1 && y == 2 && dt != ' ')
      return false;
    else if (x == 2 && y == 2 && et != ' ')
      return false;
    else if (x == 3 && y == 2 && ft != ' ')
      return false;
    else if (x == 1 && y == 3 && gt != ' ')
      return false;
    else if (x == 2 && y == 3 && ht != ' ')
      return false;
    else if (x == 3 && y == 3 && it != ' ')
      return false;
    else if (x > 3 || y > 3 || x < 1 || y < 1)
      return false;
    else
      return true;
  } // end of isValidt
  
  
  public void titlepic ()
  {
    pstitle (":::::::::::::::::D::::::::::::::::8DI:::::::::::::::::::::::::::::::::::::::");
    pstitle ("::::::::::::::::IZ:::::::::::::::DD:::::::::::::::::::::::::::::::::::::::::");
    pstitle ("::::::::::::::::8:::::::::::::::DN::::::::::::::::::::::::::::::::::::::::::");
    pstitle ("::::::::::::::::D::::::::::::::ZD::::::::::::::::::$DDDDDDDDDDDDDD8?::::::::");
    pstitle ("::::::::::::::::D:::::::::::::=D::::::::::::::+DDDDNZ::::::::::::~ODDDNDDD::");
    pstitle ("::::::::::::::::D:::::::::::::DD:::::::::::~DDD:::::::::::::::::::::::::$DDD");
    pstitle ("::::::::::::::::D::::::::::::8D::::::::::=D$::::::::::::::::::::::::::::::::");
    pstitle ("::::::::::::::::Z$:::::::::::D?::::::$MMMMD=::::::::::::::::::::::::::::::::");
    pstitle (":::::::::::::::::D:::::::::::D::~MMMMMMMMMMMMMMM::::::::::::::::::::::::::::");
    pstitle (":::::::::::::::::D:::::::::::DNMMMMMMMMMMMMMMMMMMM::::::::::::::::::::::::::");
    pstitle (":::::::::::::::::Z+:::::::::~MMMMMMMMM   MMMMMMMMMMM::::::::::::::::::::::::");
    pstitle ("::::::::::::::::::D::::::::NMMMMMMMM.      M MMMMMMMMDDZ::::::::::::::::::::");
    pstitle ("Z:::::::::::::::::DZ::::::MMMMMMMMMM       M MMMMMMMMM::::DD$:::::::::::::::");
    pstitle ("DD:::::::::::::::::D~::::+MMMMMMMMMM       M MMMMMMMMMM::::::8D8::::::::::::");
    pstitle (":8D:::::::::::::::::D::::MMMMMMMMMMM      ?+ MMMMMMMMMMM::::::::DD::::::::::");
    pstitle ("::?D:::::::::::::::::D::8MMMMMMMMMMMO     M .7MMMMMMMMMM::::::::::DD?:::::::");
    pstitle ("::::D=::::::::::::::::D+MMMMMMMMMMMM     MM   . MMMMMMMM::::::::::::DD~:::::");
    pstitle (":::::7D:::::::::::::::::MMMMMMMMMM        MM   .MMMMMMMM~::::::::::::?DD::::");
    pstitle (":::::::8D:::::::::::::::MMMMMMMM,              =MMMMMMMM:::::::::::::::DD8::");
    pstitle (":::::::::D8:::::::::::::MMMMMMM?               MMMMMMMMMD:::::::::::::::DDD:");
    pstitle (":::::::::::DD::::::::::::MMMMMMD               MMMMMMMMM:D:::::::::::::::ZDD");
    pstitle (":::::::::::::OD8:::::::::NMMMMMM .              MMMMMMM:::D:::::::::::::::DD");
    pstitle ("::::::::::::::::8D8:::::::MMMMMM$              .MMMMMMI:::8Z:::::::::::::::D");
    pstitle (":::::::::::::::::::ZDDZ::::MMMMMM              .MMMMMO:::::D::::::::::::::::");
    pstitle ("::::::::::::::::::::::::::+IMMMMMM               MMM+::::::ID:::::::::::::::");
    pstitle ("::::::::::::::::::::::::::::::MMMM .             MD:::::::::D:::::::::::::::");
    pstitle ("::::::::::::::::::::::::::::::::MM.          . .?8::::::::::8:::::::::::::::");
    pstitle (":::::::::::::::::::::::::::::::::::: . .     :::=::::::::::::I::::::::::::::");
    pstitle ("::::::::::::::::::::::::::::::::::::I:::::::::::N::::::::::::O::::::::::::::");
    pstitle ("::::::::::::::::::::::::::::::::::+O::::::::::::~::::::::::::D::::::::::::::");
    pstitle ("::::::::::::::::::::::::::::::::ID:::::::::::::D:::::::::::::D::::::::::::::");
    pstitle ("::::::::::::::::::::::::::::::DD::::::::::::::D::::::::::::::O::::::::::::::");
    pstitle ("");
    pstitle ("");
    pstitle ("");
  } // end of titlepic
  
  
  public void riddle (int score)
  {
    System.out.println ("       _______________________________________________________________________________");
    System.out.println ("     .'  ___________________________________________________________________________  '.");
    System.out.println ("     : .'                                                                           '. :");
    System.out.println ("     | |      _________________________________________________________________      | |");
    System.out.println ("     | |    .:_________________________________________________________________:.    | |");
    System.out.println ("     | |    |                                                                   |    | |");
    System.out.println ("     | |    |Two spies want to get in an enemy's military base. A soldier walks |    | |");
    System.out.println ("     | |    |up to the guard, and the guard says, 6, and the soldier says, 3.   |    | |");
    System.out.println ("     | |    |The guard lets the soldier through. Another soldier walks up to the|    | |");
    System.out.println ("     | |    |guard, and the guard says, 12, and the soldier says, 6. The        |    | |");
    System.out.println ("     | |    |guard lets the soldier through. One of the spies jumps down from   |    | |");
    System.out.println ("     | |    |out of the tree, walks up to the guard, and the guard says, 8,     |    | |");
    System.out.println ("     | |    |and the spy says,4. The guard then shoots the spy and the spy      |    | |");
    System.out.println ("     | |    |dies.                                                              |    | |");
    System.out.println ("     | |    |                    What should the spy have said?                 |    | |");
    System.out.println ("     | |    |                                                                   |    | |");
    System.out.println ("     | |    |          Password - __________________________                    |    | |");
    System.out.println ("     | |    |                    |  |  |  |  |  |  |  |  |  |                   |    | |");
    System.out.println ("     | |    '.___________________|__|__|__|__|__|__|__|__|__|__________________.'    | |");
    System.out.println ("     | |                                                                             | |");
    System.out.println ("     | |                                     iMac                                    | |");
    System.out.println ("     : '.___________________________________________________________________________.' :");
    System.out.println ("      \"._____________________________________\\__/____________________________________.\"");
    System.out.println ("                                              ||");
    System.out.println ("                                              || ");
    System.out.println ("");
    
    String ans = IBIO.inputString ("What is the password? ");
    boolean valid = true;
    int tries = 6;
    if (ans.equalsIgnoreCase ("five") || ans.equals ("5"))
      valid = true;
    else
      valid = false;
    
    while (valid == false)
    {
      tries--;
      score -= 25;
      ps ("Wrong.\nTries left: " + tries);
      ans = IBIO.inputString ("What is the password? ");
      if (ans.equalsIgnoreCase ("five") || ans.equals ("5"))
        valid = true;
      else
        valid = false;
    } // end of while
    ps ("Correct!");
    
    
    
  } // end of riddle
  
  
  public void anagram (int score)
  {
    String ans = IBIO.inputString ("What does the message say?. ");
    boolean valid = true;
    int tries = 5;
    if (ans.equalsIgnoreCase ("The nuclear missiles will be launched from Russia"))
      valid = true;
    else
      valid = false;
    
    while (valid == false)
    {
      tries--;
      score -= 25;
      ps ("Wrong.\nTries left: " + tries);
      ans = IBIO.inputString ("What does the message say? ");
      if (ans.equalsIgnoreCase ("The nuclear missiles will be launched from Russia"))
        valid = true;
      else
        valid = false;
    } // end of while
    ps ("Correct!");
    
  } // end of anagram
  
  
  public void gameover (int score)
  {
    char option = IBIO.inputChar ("What is your choice?  (a/b/c/d)");
    boolean x = isValid (option);
    while (x == false)
    {
      score -= 10;
      ps ("Game Over.\nYour score: " + score + "\n\n\n\n\n\n");
      option = IBIO.inputChar ("\nWhat is your choice?  (a/b/c/d)");
      x = isValid (option);
    } // end of while
  } // end of gameover
  
  
  public void printboardwithinput (double x, char a, char b, char c, char d, char e, char f, char g, char h, char i, char j, char k, char l, char m, char n, char o, char p, char q, char r, char s, char t, char u, char v, char w, char z, char y, int i1)
  {
    
    JOptionPane jopt = new JOptionPane ();
    String result;
    result = "       * *   * Level " + i1 + " *    * * \n \n"
      + "     A     B     C     D     E   \n"
      + "  |     |     |     |     |     |    \n"
      + "F |  " + a + "  |  " + b + "  |  " + c + "  |  " + d + "  |  " + e + "  | G  \n"
      + "  |     |     |     |     |     |    \n"
      + "-------------------------------------\n"
      + "  |     |     |     |     |     |    \n"
      + "H |  " + f + "  |  " + g + "  |  " + h + "  |  " + i + "  |  " + j + "  | I  \n"
      + "  |     |     |     |     |     |    \n"
      + "-------------------------------------\n"
      + "  |     |     |     |     |     |    \n"
      + "J |  " + k + "  |  " + l + "  |  " + m + "  |  " + n + "  |  " + o + "  | K  \n"
      + "  |     |     |     |     |     |    \n"
      + "-------------------------------------\n"
      + "  |     |     |     |     |     |    \n"
      + "L |  " + p + "  |  " + q + "  |  " + r + "  |  " + s + "  |  " + t + "  | M  \n"
      + "  |     |     |     |     |     |    \n"
      + "-------------------------------------\n"
      + "  |     |     |     |     |     |    \n"
      + "N |  " + u + "  |  " + v + "  |  " + w + "  |  " + z + "  |  " + y + "  | O  \n"
      + "  |     |     |     |     |     |    \n"
      + "     P     Q     R     S     T    \n"
      + "  Remember the arrangement of bars\n"
      + "\n";
    JTextArea resLabel = new JTextArea (result);
    resLabel.setFont (new Font ("Courier", Font.PLAIN, 12));
    //jopt.setFont(new Font("Monospaced", Font.BOLD, 50));
    jopt.showMessageDialog (null, resLabel, "Results", JOptionPane.PLAIN_MESSAGE);
  } // end of printboardwithinput
  
  
  public void printplainboardwithscore (int acounter, int qcounter, double z, int lives)
  {
    System.out.println ("");
    System.out.println ("");
    System.out.println ("");
    System.out.println ("");
    System.out.println ("");
    System.out.println ("");
    System.out.println ("");
    System.out.println ("     A     B     C     D     E   ");
    System.out.println ("  |     |     |     |     |     |    ");
    System.out.println ("F |     |     |     |     |     | G  ");
    System.out.println ("  |     |     |     |     |     |    ");
    System.out.println ("-------------------------------------");
    System.out.println ("  |     |     |     |     |     |    ");
    System.out.println ("H |     |     |     |     |     | I  ");
    System.out.println ("  |     |     |     |     |     |    ");
    System.out.println ("-------------------------------------");
    System.out.println ("  |     |     |     |     |     |    ");
    System.out.println ("J |     |     |     |     |     | K  ");
    System.out.println ("  |     |     |     |     |     |    ");
    System.out.println ("-------------------------------------");
    System.out.println ("  |     |     |     |     |     |    ");
    System.out.println ("L |     |     |     |     |     | M  ");
    System.out.println ("  |     |     |     |     |     |    ");
    System.out.println ("-------------------------------------");
    System.out.println ("  |     |     |     |     |     |    ");
    System.out.println ("N |     |     |     |     |     | O  ");
    System.out.println ("  |     |     |     |     |     |    ");
    System.out.println ("     P     Q     R     S     T   ");
    if (z == 1)
    {
      System.out.println (" Number of lives: " + lives);
      System.out.println (" You have " + acounter + " of " + qcounter + " question correct.");
    } // end of if
    else
    {
      System.out.println (" Number of lives remaining: " + lives);
      System.out.println (" You have " + acounter + " of " + qcounter + " questions correct.");
    } // end of else
    
    
  } // end of printplainboardwithscore
  
  
  public void printplainboard ()
  {
    System.out.println ("");
    System.out.println ("");
    System.out.println ("");
    System.out.println ("");
    System.out.println ("");
    System.out.println ("");
    System.out.println ("");
    System.out.println ("     A     B     C     D     E   ");
    System.out.println ("  |     |     |     |     |     |    ");
    System.out.println ("F |     |     |     |     |     | G  ");
    System.out.println ("  |     |     |     |     |     |    ");
    System.out.println ("-------------------------------------");
    System.out.println ("  |     |     |     |     |     |    ");
    System.out.println ("H |     |     |     |     |     | I  ");
    System.out.println ("  |     |     |     |     |     |    ");
    System.out.println ("-------------------------------------");
    System.out.println ("  |     |     |     |     |     |    ");
    System.out.println ("J |     |     |     |     |     | K  ");
    System.out.println ("  |     |     |     |     |     |    ");
    System.out.println ("-------------------------------------");
    System.out.println ("  |     |     |     |     |     |    ");
    System.out.println ("L |     |     |     |     |     | M  ");
    System.out.println ("  |     |     |     |     |     |    ");
    System.out.println ("-------------------------------------");
    System.out.println ("  |     |     |     |     |     |    ");
    System.out.println ("N |     |     |     |     |     | O  ");
    System.out.println ("  |     |     |     |     |     |    ");
    System.out.println ("     P     Q     R     S     T   ");
    System.out.println ("");
    System.out.println ("");
    System.out.println ("");
    System.out.println ("");
    System.out.println ("");
    System.out.println ("");
    System.out.println ("");
  } // end of printplainboard
  
  
  
  
  
  // just a way to figure out if the player is ready to continue or not.
  public boolean isValid (char ans)
  {
    if (ans == 'y' || ans == 'Y' || ans == 'c' || ans == 'C')
      return true;
    else
      return false;
  } // end of isValid
  
  
  // there should be a way I can skip the intro stuff so that it will be easier for testing.
  public void skip (String cutscene)
  {
    char skippy = IBIO.inputChar ("\nSkip cutscene?  (y/n)");
    boolean c = isValid (skippy);
    if (c == false)
    {
      ps (cutscene);
    }
    else
    {
      ps ("");
    }
  } // end of skip
  
  
  
  
  public void ps (String s)
  {
    for (int i = 0 ; i < s.length () ; i++)
    {
      System.out.print ("" + s.charAt (i));
      //sleep for a bit after printing a letter
      try
      {
        Thread.sleep (25);
      }
      catch (InterruptedException m)
      {
        ;
      }
    }
    System.out.println ();
  } // end of ps
  
  
  public void pstitle (String s)
  {
    for (int i = 0 ; i < s.length () ; i++)
    {
      System.out.print ("" + s.charAt (i));
      //sleep for a bit after printing a letter
      try
      {
        Thread.sleep (1);
      }
      catch (InterruptedException m)
      {
        ;
      }
    }
    System.out.println ();
  } // end of pstitle
  
  
  public String realdate ()
  {
    
    
    Date now = new Date ();
    DateFormat df = DateFormat.getDateInstance ();
    String s = df.format (now);
    return s;
    
  } // end of realdate
  
  
}// end of everything

