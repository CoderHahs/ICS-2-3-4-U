/*
 By Hrithik Shah
 Date: July 25, 2016
 Title: Unit 4 Final Project 
 Purpose: Helping students learn key concepts by creating Flash Cards
 */

import java.util.Scanner; // imports scanner
import java.util.ArrayList; // Arraylist will help to add additional cards
import java.util.*;


public class Unit4
{
  
  // Scanner
  Scanner scan = new Scanner (System.in);
  
  // ArrayList for Flash Card sets
  ArrayList<String> sets = new ArrayList <String>();
  
  // ArrayList of Arraylist of terms
  ArrayList<ArrayList<String>> terms = new ArrayList<ArrayList<String>>();
  
  // ArrayList of Arraylists of definitions
  ArrayList<ArrayList<String>> definitions = new ArrayList<ArrayList<String>>();
  
  int counter = 0; // this lets the program know what set the user wants to study from.
  
  int tdn = 0; // counter to display flash cards
  
  public static void main (String args[])
  {
    new Unit4 ();
  } 
  
  
  public Unit4 ()
  {
    /* What this program is supposed to do:
     * 1. Let user create a flash card, with input for term and its definition.
     * 2. Let user add flash cards.
     * 3. Let user flow through flash cards, with option to flip at anytime.
     * 4. Let user exit the app.
     */
    
    // Title 
    ps ("Welcome to the Flash Card Creator!!!");
    
    MainMenu();
  }
  
  public void MainMenu ()
  {
    // Main Menu input
    ps ("\n\nMain Menu: \nWhat would you like to do? \n1. Create a new set of Flash Cards \n2. Learn from an already created flash card set \n3. Exit the app. \nEnter a number (1-3)");
    
    // Catch errors
    int option = 0;
    if (scan.hasNextInt ())
    {
      option = scan.nextInt ();
      while (option < 1 || option > 3)
      {
        ps ("\nThere was an error. Please try again. \nMain Menu: \nWhat would you like to do? \n1. Create a new set of Flash Cards \n2. Learn from an already created flash card set \n3. Exit the app. \nEnter a number (1-3)");
        option = scan.nextInt ();
      }
    }
    else
    {
      while (!scan.hasNextInt())
      {
        System.out.println("Invalid entry. Please enter a number.");
        scan.next();
      }
      option = scan.nextInt ();
      while (option < 1 || option > 3)
      {
        ps ("\nThere was an error. Please try again. \nMain Menu: \nWhat would you like to do? \n1. Create a new set of Flash Cards. \n2. Learn from an already created Flash Card set. \n3. Exit the app. \nEnter a number (1-3)");
        option = scan.nextInt ();
      }
    }
    
    if (option == 1)
      newFlashCardSet ();
    else if (option == 2)
      displayFlashCardSet ();
    else
      ps ("\n\nThank you for using the Flash Card Creator! Goodbye.");
    
    
  }
  
  public void newFlashCardSet ()
  {       
    String setname = " ";
    String sure = "n";
    while (!sure.equals ("y"))
    {
      ps ("\nWhat would you like to call this set of Flash Cards? ");
      setname = scan.next ();
      
      // making sure there is no repetition of namesy
      while (sets.contains (setname))
      {
        ps ("Sorry there is already a set with this name. Please try again. "); 
        ps ("\nWhat would you like to call this set of Flash Cards? ");
        setname = scan.next ();
      }
      
      ps ("Are you sure about this name? (y/n) ");
      sure = scan.next ();
    }

    // add to Arraylist sets
    sets.add (setname);
    terms.add (new ArrayList<String>());
    definitions.add (new ArrayList<String>());
    
    // move to adding individual flash cards to set
    createFlashCards (setname);
    
    counter++;
  }
  
  public void createFlashCards (String setname)
  { 
    String option = " ";
    while (!option.equals ("m")) // sends user to main menu if m is inputted
    {
      ps ("\nWould you like to add Flash Cards or remove Flash Cards from this set? \nOr would you like to go to the main menu? (a/r/m)");
      option = scan.next ();
      while (!option.equals ("a") && !option.equals ("r") && !option.equals ("m")) // catches errors
      {
        ps ("\nSorry there was an error.\nWould you like to add Flash Cards or remove Flash Cards from this set? \nOr would you like to go to the main menu? (a/r/m)");
        option = scan.next ();
      }
      
      if (option.equals ("a")) // adding flash cards
      {
        ps ("Please enter the term: ");
        String term = scan.next ();
        terms.get(counter).add(term);
        ps ("Please enter it's definition.");
        String definition = scan.next ();
        definitions.get(counter).add(definition);
      }
      else if (option.equals ("r")) // removing flash cards
      {
        ps ("Please enter the term name: ");
        String rterm = scan.next ();
        ps ("Please enter it's corresponding definition: ");
        String rdf = scan.next ();
        if (terms.get (counter).contains (rterm))
        {
          terms.get (counter).remove(rterm);
          ps ("Term was removed");
        }
        else
        {
          while (!terms.get(counter).contains(rterm))
          {         
            ps ("Sorry there was an error with input. \nMake sure the term is correctly spelled. \nEnter the term: ");
            rterm = scan.next ();
          }
          terms.get(counter).remove (rterm);
          ps ("Term was removed");
        }
        
        if (definitions.get (counter).contains (rdf))
        {
          definitions.get (counter).remove(rdf);
          ps ("Definition was removed");
        }
        else
        {
          while (!definitions.get(counter).contains(rdf))
          {         
            ps ("Sorry there was an error with input. \nMake sure the definition is correctly typed. \nEnter the term: ");
            rdf = scan.next ();
          }
          definitions.get(counter).remove (rdf);
          ps ("Definition was removed");
        }
      }
      else // nothing to be executed as the while loop will be exited
      {
        
      }
    }
    
    MainMenu (); // sends user to main menu
  }
  
  public void displayFlashCardSet ()
  {
    ps ("Flash Card Sets:");
    
    // list of sets
    int i = 1; // counter for list number
    
    if (sets.size () == 0)
    {
      // return to main menu
      ps ("Sorry there were no sets in our database. \nReturning to Main Menu....\n\n\n");
      MainMenu ();
    }
    
    for(String listsets: sets)
    {
      System.out.println(i+". "+listsets);
      i++;
    }
    
    ps ("Which set would you like to study from? Pick a number: ");
    int choice = 0;
    if (scan.hasNextInt ())
    {
      choice = scan.nextInt ();
      while (choice < 1 || choice > i)
      {
        ps ("Sorry there was an error. Which set would you like to study from? Pick a number: ");
        choice = scan.nextInt ();
      }
    }
    else
    {
      while (!scan.hasNextInt())
      {
        System.out.println("Invalid entry. Please enter a number.");
        scan.next();
      }
      choice = scan.nextInt ();
      while (choice < 1 || choice > i)
      {
        ps ("Which set would you like to study from? Pick a number: ");
        choice = scan.nextInt ();
      }
    }
    
    displayFlashCards (choice);
  }
  
  public void displayFlashCards (int choice)
  {
    String conti = "y";
    while (!conti.equals ("n")) // user doens't want to see flash cards, thus returning to Main Menu
    {
      System.out.println ("\n\n*************************************************"); // border of flash card
      ps ("\n\n"+ terms.get (choice-1).get (tdn) + "\n\n");
      System.out.println ("*************************************************");
      
      ps ("\nWould you like to flip the card or move on? (f/m) ");
      String pick = scan.next ();
      while (!pick.equals ("f") && !pick.equals ("m"))
      {
        ps ("\nThere was an error. Please try again. \nWould you like to flip the card or move on? (f/m) ");
        pick = scan.next ();
      }
      
      if (pick.equals ("f")) // flipping flash card
      {
        System.out.println ("\n\n*************************************************");
        ps ("\n\n"+ definitions.get (choice-1).get (tdn) + "\n\n");
        System.out.println ("*************************************************");
        String flip = "n";
        while (!flip.equals ("y"))
        {
          ps ("Flip back? (y/n)  ");
          flip = scan.next ();
        }
        System.out.println ("\n\n*************************************************");
        ps ("\n\n"+ terms.get (choice-1).get (tdn) + "\n\n");
        System.out.println ("*************************************************");
      }
      else // next flash card
      {
        if ((tdn+1) < terms.get (choice-1).size ())
        {
          tdn++;  
          System.out.println ("\n\n*************************************************");
          ps ("\n\n"+ terms.get (choice-1).get (tdn) + "\n\n");
          System.out.println ("*************************************************");
        }
        else // no more flash cards in set
        {
          ps ("End of Set");
          conti = "n";
        }
      }
      
      ps ("Continue? (y/n)");
      conti = scan.next ();
    }
    // Return to Main Menu
    ps ("Returning to Main Menu.....\n\n\n");
    MainMenu ();
    
  }
  
  public void ps (String s) // ps stands for print slow, which makes the text look like its being typed.
  {
    for (int i = 0 ; i < s.length () ; i++)
    {
      System.out.print ("" + s.charAt (i));
      //sleep for a bit after printing a letter
      try
      {
        Thread.sleep (35);
      }
      catch (InterruptedException m)
      {
        ;
      }
    }
    System.out.println ();
  } // end of ps
  
}

