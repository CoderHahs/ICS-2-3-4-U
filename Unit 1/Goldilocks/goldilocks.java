public class goldilocks
{
  public static void main (String args [])
  {
     new goldilocks ();
  }
  
  public goldilocks ()
  {
    int weight1 = IBIO.inputInt ("Enter Bowl Number # 1 weight: ");
    int weight2 = IBIO.inputInt ("Enter Bowl Number # 2 weight: ");
    int weight3 = IBIO.inputInt ("Enter Bowl Number # 3 weight: ");
    
    if (weight1 <= weight2 && weight2 <= weight3)
    {
     System.out.println ("The lightest bowl weight is "+weight2); 
    }
    else if (weight3 <= weight2 && weight2 <= weight1)
    {
     System.out.println ("The lightest bowl weight is "+weight2); 
    }
    else if (weight2 <= weight1 && weight1 <= weight3)
    {
     System.out.println ("The lightest bowl weight is "+weight1); 
    }
    else if (weight3 <= weight1 && weight1 <= weight2)
    {
     System.out.println ("The lightest bowl weight is "+weight1); 
    }
    else if (weight2 <= weight3 && weight3 <= weight1)
    {
     System.out.println ("The lightest bowl weight is "+weight3); 
    }else if (weight1 <= weight3 && weight3 <= weight2)
    {
     System.out.println ("The lightest bowl weight is "+weight3); 
    }
    
  }
  
}