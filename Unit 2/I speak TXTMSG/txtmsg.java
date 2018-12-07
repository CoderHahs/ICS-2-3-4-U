public class txtmsg
{
  public static void main (String args [])
  {
     new txtmsg();
  }
  
  public txtmsg()
  {
    String shortf = IBIO.inputString ("Enter phrase> ");
    
    while (!shortf.equals ("TTYL"))
    {
      if (shortf.equals ("CU"))
      {
	System.out.println ("see you");
      }
      else if (shortf.equals (":-)"))
      {
	System.out.println ("I'm happy");
      }
      else if (shortf.equals (":-("))
      {
	System.out.println ("I'm unhappy");
      }
      else if (shortf.equals (";-)"))
      {
	System.out.println ("wink");
      }
      else if (shortf.equals (";-p"))
      {
	System.out.println ("stick out my tongue");
      }
      else if (shortf.equals ("(~.~)"))
      {
	System.out.println ("sleepy");
      }
      else if (shortf.equals ("TA"))
      {
	System.out.println ("totally awesome");
      }
      else if (shortf.equals ("CUZ"))
      {
	System.out.println ("because");
      }
      else if (shortf.equals ("TY"))
      {
	System.out.println ("Thank you");
      }
      else if (shortf.equals ("YW"))
      {
	System.out.println ("you're welcome");
      }
      
      
			    
	 
      
      
      shortf = IBIO.inputString ("Enter phrase> ");
    
    }
    System.out.println ("talk to you later");
  }
  
}
