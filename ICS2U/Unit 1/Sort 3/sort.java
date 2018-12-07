public class sort
{
  public static void main (String args [])
  {
     new sort ();
  }
  
  public sort ()
  {
    int num1 = IBIO.inputInt ("What is the first number? ");
    int num2 = IBIO.inputInt ("What is the second number? ");
    int num3 = IBIO.inputInt ("What is the third number? ");
    
    if (num1 <= num2 && num2 <= num3)
    {
     System.out.println ("In sorted order, they are "+num1+", "+num2+", "+num3); 
    }
    else if (num3 <= num2 && num2 <= num1)
    {
     System.out.println ("In sorted order, they are "+num3+", "+num2+", "+num1); 
    }
    else if (num2 <= num1 && num1 <= num3)
    {
     System.out.println ("In sorted order, they are "+num2+", "+num1+", "+num3); 
    }
    else if (num3 <= num1 && num1 <= num2)
    {
     System.out.println ("In sorted order, they are "+num3+", "+num1+", "+num2); 
    }
    else if (num2 <= num3 && num3 <= num1)
    {
     System.out.println ("In sorted order, they are "+num2+", "+num3+", "+num1); 
    }
    else //if (num1 <= num3 && num3 <= num2)
    {
     System.out.println ("In sorted order, they are "+num1+", "+num3+", "+num2); 
    }
    
  }
  
}
