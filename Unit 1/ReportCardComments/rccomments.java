public class rccomments
{
  int mypmark = IBIO.inputInt ("What is your MYP mark? ");
  int test1 = IBIO.inputInt ("What is your Test 1 mark? ");
  String commentmark;
  String commenttest;
  int ontper = 0;
  
  public static void main (String args [])
  {
    new rccomments ();
  }
  
  public void commentfortest ()
  {
    if (test1 == 1 || test1 == 2)
      commenttest = "Test results for unit 1 demonstrate little understanding of skills taught in class. Please come in for extra help.";
    else if (test1 == 3 || test1 == 4)
      commenttest = "Test results for unit 1 show that increased review of skills taught in class is required.";
    else if (test1 == 5 || test1 == 6)
      commenttest = "The unit 1 test displayed strong understanding of the skills taught in class.";
    else if (test1 == 7)
      commenttest = "The unit 1 test displayed exceptional understanding and extension of skills taught in class.";
    else
      System.out.println ("Error. Incorrect grade entered.");
  }
  
  public rccomments ()
  {
    if (mypmark == 1)
    {
      ontper = 45;
      commentmark = "Experiencing difficulty this semester.";
      commentfortest ();
    }
    
    else if (mypmark == 2)
    {
      ontper = 56;
      commentmark = "Experiencing difficulty this semester.";
      commentfortest ();
    }
    else if (mypmark == 3)
    {
      ontper = 66;
      commentmark = "Some difficulties so far this semester.";
      commentfortest ();
    }
    else if (mypmark == 4)
    {
      ontper = 78;
      commentmark = "Good start to the semester."; 
      commentfortest ();
    }
    else if (mypmark == 5)
    {
      ontper = 88;
      commentmark = "Good start to the semester.";
      commentfortest ();
    }
    else if (mypmark == 6)
    {
      ontper = 94;
      commentmark = "Excellent start to the semester.";
      commentfortest ();
    }
    else if (mypmark == 7)
    {
      ontper = 99;
      commentmark = "Outstanding start to the semester.";
      commentfortest ();
    }
    else
    {
      System.out.println ("Error. Incorrect grade entered.");
    }
    
    System.out.println ("(IB MYP Level "+mypmark+", Ontario Percentage "+ontper+"%) "+commentmark+" "+commenttest);
    
    
    
  }
  
  
  
}
  

