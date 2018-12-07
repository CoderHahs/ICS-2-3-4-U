public class Circles
{
  public static void main (String args [])
  {
    new Circles ();
  } 

  public Circles () 
  {
      System.out.println("Circles R Us");
      double r = IBIO.inputDouble("Enter a radius: ");
      double diameter = r*2;
      double area = Math.PI*Math.pow(r,2);
      double circumference = 2*Math.PI*r;
      double sa = 4*Math.PI*Math.pow(r,2);
      double volume = (4*Math.PI*Math.pow(r,3))/3;
      
      System.out.println("\n\nOn a circle: ");
      System.out.println("The diameter is " +diameter);
      System.out.println("The area is " +area);
      System.out.println("The circumference " +circumference);
      System.out.println("\n\nOn a sphere: ");
      System.out.println("The surface area is " +sa);
      System.out.println("The volume is " +volume);
      
 
  }
}
