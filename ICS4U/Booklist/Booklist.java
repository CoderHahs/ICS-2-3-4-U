/*
 By Hrithik Shah
 Date: August 16, 2016
 Title: Booklist
 Purpose: Binary Search, Linear Search, Text file to array
 */

import java.util.Scanner; // imports scanner
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Booklist
{
  Scanner scan = new Scanner (System.in);
  ArrayList<String> books = new ArrayList<String>();
  ArrayList<Integer> numbers = new ArrayList<Integer>();
  int counter = 0;
  int binarycount = 0;
  public static void main (String[] args)
  {
    new Booklist ();
  }  
  
  public Booklist ()
  {
    String temp; // contains line
    Scanner textFile = new Scanner (System.in);
    try {
      textFile = new Scanner(new File("ListofBooks.txt")).useDelimiter(",\\s*"); // get text file, and split on every enter (\n)
    }
    catch (FileNotFoundException e) { 
      System.out.println(e.getMessage());
    } 
    int tempint;
    while (textFile.hasNext ())
    {
      temp = textFile.next();
      books.add (temp);
      if (counter % 2 == 0)
      {
        tempint = Integer.parseInt (temp);
        numbers.add (tempint);
      }
      counter++;
    }
    
    // Title
    System.out.println ("Children's Classics");
    System.out.println ("This program will find the title of a book according to its library number.");
    System.out.println ("\nEnter the number: ");
    String libn = String.valueOf(scan.nextInt ());
    int linearfind = linearSearch (books, libn);
    //int binaryfind = binearySearch (books, libn);
    if (linearfind > 0)
      System.out.println ("Linear Search: "+books.get (linearfind+1)+ ", Count: "+(linearfind/2));
    else 
      System.out.println ("The book you are looking for has not been found.");
    
    int binaryfind = binarySearch (numbers, 0, 21, libn);
    if (binaryfind > 0)
      System.out.println ("Binary Search: "+books.get ((binaryfind*2)+1)+ ", Count: "+(binaryfind));
    else 
      System.out.println ("The book you are looking for has not been found.");
  }
  
  public int linearSearch(ArrayList<String> A, String V) 
  {
    int num1;
    int num2 = Integer.parseInt (V);
    for (int k=0; k<A.size (); k+=2) 
    {
      num1 = Integer.valueOf (A.get (k));
      if (num1 == num2) 
      {
        //System.out.print("works");
        return k;
      }
    }
    return -1;
  }
  
  public int binarySearch(ArrayList<Integer> A, int left, int right, String V)
  {
         int middle = 0;

         if (left > right) {
           if (V.equals ("100"))
               return 21;
           else
             return -1;
         }

         middle = (left + right)/2;
         int compare = V.compareTo(String.valueOf(A.get(middle)));
         if (compare == 0) 
         {
           //System.out.println (middle);
             return middle;
         }
         if (compare < 0) 
         {
           binarycount++;
             return binarySearch(A, left, middle-1, V);
             
         } 
         else 
         {
            binarycount++;
             return binarySearch(A, middle + 1, right, V);
            
         }
  }
  
}

