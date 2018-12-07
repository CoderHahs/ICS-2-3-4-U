
import java.util.ArrayList;
import java.text.DecimalFormat;

public class Player {
    
    private String name;
    private ArrayList<House> ownedProperty = new ArrayList<>();
    private int balance;
    
    DecimalFormat x = new DecimalFormat ("##,###,###.##");
    
    public Player (String name, ArrayList<House> ownedProperty, int balance) {
        this.name = name;
        this.ownedProperty = ownedProperty;
        this.balance = balance;
    }
    
    public String getName () {
        return this.name;
    }
    
    public String getPropertyListString () {
        String output = "";
        String location = "";
        char l1;
        char l2;
        for (int i = 0; i < ownedProperty.size(); i++) {
            location = String.valueOf(ownedProperty.get (i).getCoordinates());
            l1 = location.charAt (0);
            l2 = location.charAt (1);
            output += l1+ "," + l2 + ":\t$" + x.format(ownedProperty.get(i).getPrice() )+ "\n";
        }
        if (output.equals (""))
            output = "NONE";
        return output;
    }
    
    public ArrayList<House> getPropertyListArray () {
        return ownedProperty;
    }
    
    public double getBalance () {
        return this.balance;
    }
    
    public void setBalance (int num) {
        this.balance = num;
    }
    
    public void addProperty (House h) {
        this.ownedProperty.add(h);
    }
}
