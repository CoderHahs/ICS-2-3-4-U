public class Farmville
{
    public static void main (String arg [])
    {
	new Farmville();
    }
	
    public Farmville ()
    {
    System.out.println("*********************************");
    System.out.println("*  Welcome to Farmville Market  *");
    System.out.println("*********************************");
    System.out.println("Enter the amount of each thing you would like to buy.");
    int strawberries = IBIO.inputInt ("\n1. How many strawberries would you like? ");
    int eggplants = IBIO.inputInt ("2. How many eggplants would you like? ");
    int wheat = IBIO.inputInt ("3. How many wheat would you like? ");
    int pumpkin = IBIO.inputInt ("4. How many pumpkin would you like? ");
    int soybeans = IBIO.inputInt ("5. How many soybeans would you like? ");
    int svalue = strawberries * 10;
    int evalue = eggplants * 25;
    int wvalue = wheat * 35;
    int pvalue = pumpkin * 30;
    int soyvalue = soybeans * 15;
    System.out.println("*********************************");
    System.out.println("*     Farmville Market Bill     *");
    System.out.println("*********************************");
    System.out.println("\n\n"+strawberries+ " strawberries @ 10 coins each = " + svalue + " coins.");
    System.out.println(eggplants+ " eggplants @ 10 coins each = " + evalue + " coins.");
    System.out.println (wheat+ " wheat @ 10 coins = " + wvalue+ " coins.");
    System.out.println(pumpkin+ " pumpkin @ 10 coins = " + pvalue+ " coins.");
    System.out.println(soybeans+ " soybeans @ 10 coins each = " + soyvalue+ " coins.");
    System.out.println("");
    int total = svalue + evalue + wvalue + pvalue + soyvalue;
    System.out.println ("Total " +total+ " coins.");
    }

}
