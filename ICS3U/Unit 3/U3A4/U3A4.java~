/*
 By Hrithik Shah
 Date: July 18, 2016
 Title: Unit 3 Assignment 4
 Purpose: Working with Arrays
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class U3A4
{
  
  public static void main (String[] args)
  {
    U3A4squares ();
    U3A4bubbles ();
    U3A4collection ();
  }
  
  
  public static void U3A4squares ()
  {
    // Title
    System.out.println ("Square ArrayList");
    
    // variables
    int [] number = new int [20];
    int [] square = new int [20];
    
    // for loop to calculate squares and output results
    for (int i = 0; i < 10; i++)
    {
      // calculations
      number [i] = i;
      square [i] = i * i;
      
      // final statement
      System.out.println ("Number: "+number [i]+" Square: "+square [i]);
    }
  }
  
  public static void U3A4bubbles ()
  {
    // Title
    System.out.println ("\n\nBubble Sort\n");
    
    // Scanner
    Scanner scan = new Scanner (System.in);
    
    // input
    int ninput;
    System.out.println ("Enter the number of values you would like to enter: ");
    
    if (scan.hasNextInt())
    {
      ninput = scan.nextInt ();
    }
    else
    {
      while (!scan.hasNextInt())
      {
        // catch error
        System.out.println("Invalid entry. Please enter only integers.");
        scan.next();
      }
      ninput = scan.nextInt();
    }
    
    // array
    int [] tosort = new int [ninput]; // going to be sorted
    int [] unsorted = new int [ninput]; // not going to be sorted
    for (int i = 0; i < ninput; i++)
    {
      System.out.println ("Please enter for index value of "+i+": ");
      if (scan.hasNextInt())
      {
        tosort [i] = scan.nextInt ();
        unsorted [i] = tosort[i];
      }
      else
      {
        while (!scan.hasNextInt() && scan.nextInt () > 0)
        {
          // catch error
          System.out.println("Invalid entry. Please enter only integers.");
          scan.next();
        }
        tosort [i] = scan.nextInt();
        unsorted [i] = tosort [i];
      }
    }
    
    // Bubble sort Algorithm
    int temp = 0;
    for(int k=0; k < ninput; k++)
    {
      for(int j=1; j < (ninput-k); j++)
      {
        if(tosort [j-1] > tosort [j])
        {
          temp = tosort [j-1];
          tosort [j-1] = tosort [j];
          tosort [j] = temp;
        }
      }  
    }
    
    System.out.println ("\nUnsorted List: ");
    for (int x = 0; x < ninput; x++)
    {
      System.out.print (unsorted [x] + " "); 
    }
    
    System.out.println ("\nSorted List: ");
    for (int y = 0; y < ninput; y++)
    {
      System.out.print (tosort [y] + " "); 
    }
    
    // Greatest number
    System.out.println ("\nGreatest Number: " + tosort [ninput-1]);
    
    // Least number
    System.out.println ("\nLeast Number: " + tosort [0]);
    
    // Median number
    double median = 0;
    if (ninput > 1)
    {
      if (ninput % 2 == 0)
      {
        median = (double) (tosort[ninput/2] + tosort [(ninput/2)-1]) / 2 ;
        System.out.println ("\nMedian Number: " + median);
        
      }
      else 
      {
        median = (double) tosort [(ninput-1) / 2];
        System.out.println ("\nMedian Number: " + median);
      }
    }
    else 
    {
      System.out.println ("\nMedian Number: " + tosort [0]);
    }
    // Average
    double average = 0;
    for (int z = 0; z < ninput; z++)
    {
      average += tosort [z];
    }
    average = average / ninput;
    System.out.println ("\nAverage Number: " + average);   
  }
  
  public static void U3A4collection ()
  {
    // loop stopping variable
    char stop = 'n';
    // other variables
    String option;
    String cdname;
    ArrayList<String> cdarray = new ArrayList <String>();
    int loopn = 0;
    boolean match = false; // used to see if a CD matches input for removal
    
    while (stop == 'n')
    {
      Scanner sc = new Scanner (System.in);
      
      System.out.println ("\nWould you like to add or remove CDs? \nOr would you like to exit the program. (a/r/e) ");
      option = sc.nextLine ();
      
      while (!"a".equals(option) && !"r".equals(option) && !"e".equals(option))
      {
        System.out.println ("Please try again. Would you like to add or remove CDs? \nOr would you like to exit the program. (a/r/e) ");
        option = sc.nextLine (); 
      }
      
      if (option.equals("a"))
      {
        System.out.println ("Enter the CD's name (Title - Artist): ");
        cdarray.add (sc.nextLine ());
      }
      else if (option.equals("r"))
      {
        System.out.println ("Enter the CD's name (Title - Artist): ");
        cdname = sc.nextLine ();
        if (cdarray.contains(cdname))
          cdarray.remove (cdname);
        else 
        {
          while (!cdarray.contains(cdname))
          {         
            System.out.println ("Sorry there was an error with input. \nMake sure CD's name is correct and matches the one in the display. \nEnter the CD's name: ");
            cdname = sc.nextLine ();
          }
          cdarray.remove (cdname);
        }
      }
      else
      {
        System.out.println ("\n\nGoodbye! ");
        stop = 'y';
      }
      
      if (stop == 'n')
      {
        // Print unsorted list
        System.out.println ("\nOriginal Order");
        for(String unsortedsong: cdarray){
          System.out.println(unsortedsong);
        }
        // sorting statement
        Collections.sort (cdarray);
        
        // Put array list in aplhabetical order
        System.out.println ("\nSorted Order");
        for(String sortedsong: cdarray){
          System.out.println(sortedsong);
        }
      }
      loopn++;
    }
    
  }
  
}

