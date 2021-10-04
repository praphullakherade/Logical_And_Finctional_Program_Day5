package com.company;
 
import java.util.Scanner;

public class LeapYearOrNot  {
     public static void main(String[] args) {
       int year;
       Scanner scan = new Scanner(System.in);
      
       System.out.print("Enter Year : ");
       year = scan.nextInt();
      
       if((year%4 == 0) && (year%100!=0))
       {
           System.out.print("This is a Leap Year");
       }
       else if((year%100 == 0) && (year%400 == 0))
       {
           System.out.print("This is a Leap Year");
       }
       else if(year%400 == 0)
       {
           System.out.print("This is a Leap Year");
       }
       else
       {
           System.out.print("This is not a Leap Year");
       } 
    }
}
