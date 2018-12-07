/* This program is intended to take a numerical grade and
 * convert it to either a letter or level grade.  It
 * contains errors which need to be debugged.
 * 
 * Hrithik Shah
 * July 21, 2016
 */


import java.util.*;
public class U3A5gradeconverter {
  
  public static Scanner sc = new Scanner(System.in);
  
  public static void main(String[] args) {
    int type;
    
    do
    {
      System.out.println("MAIN MENU");
      System.out.println("=========");
      System.out.println("1. Convert to a Letter grade");
      System.out.println("2. Convert to a Level grade");
      System.out.println("3. Exit \n");
      System.out.println("Please enter your selection: ");
      type=sc.nextInt();
      
      if (type==1) percentageToAlpha();
      if (type==2) percentageToLevel();
    }
    while (type != 3);
  }
  
  // Conversion function percentage to Alpha
  public static void percentageToAlpha ()
  {
    int grade;
    String alphaGrade;
    String messageOut;
    
    System.out.println("Please enter the numeric grade: ");
    grade=sc.nextInt();
    
    if (grade < 50) {
      alphaGrade="F";
    }
    else if (grade <=52)
    {
      alphaGrade = "D-";
    }
    else if (grade <=56)
    {
      alphaGrade = "D";
    }
    else if (grade <=59)
    {
      alphaGrade = "D+";
    }
    else if (grade <=62)
    {
      alphaGrade = "C-";
    }
    else if (grade <=66)
    {
      alphaGrade = "C";
    }
    else if (grade <=69)
    {
      alphaGrade = "C+";
    }
    else if (grade <=72)
    {
      alphaGrade = "B-";
    }
    else if (grade <=76)
    {
      alphaGrade = "B";
    }
    else if (grade <=79)
    {
      alphaGrade = "B+";
    }
    else if (grade <=84)
    {
      alphaGrade = "A-";
    }
    else if (grade <=89)
    {
      alphaGrade = "A";
    }
    else if (grade <=100)
    {
      alphaGrade = "A+";
    }
    else
    {
      alphaGrade = "Error - invalid mark, try again!";
    }
    
    messageOut=(grade + "% = " + alphaGrade);
    System.out.println(messageOut);
  }
  
  // Conversion function percentage to level
  public static void percentageToLevel ()
    
  {
    int grade;
    String levelGrade;
    String messageOut;
    
    System.out.println("Please enter the numeric grade: ");
    grade=sc.nextInt();
    
    if (grade < 50) 
    {
      levelGrade="R";
    }
    else if (grade <=52)
    {
      levelGrade="L1-";
    }
    else if (grade <=56)
    {
      levelGrade="L1";
    }
    else if (grade <=59)
    {
      levelGrade="L1+";
    }
    else if (grade <=62)
    {
      levelGrade="L2-";
    }
    else if (grade <=66)
    {
      levelGrade="L2";
    }
    else if (grade <=69)
    {
      levelGrade="L2+";
    }
    else if (grade <=72)
    {
      levelGrade="L3-";
    }
    else if (grade <=76)
    {
      levelGrade="L3-";
    }
    else if (grade <=79)
    {
      levelGrade="L3+";
    }
    else if (grade <=84)
    {
      levelGrade="L4-";
    }
    else if (grade <=89)
    {
      levelGrade="L4";
    }
    else if (grade <= 100)
    {
      levelGrade="L4+";
    }
    else{
      levelGrade="Error - invalid mark, try again!";
    }
    
    messageOut=(grade + "% = " + levelGrade);
    System.out.println(messageOut);
  }
  
}
