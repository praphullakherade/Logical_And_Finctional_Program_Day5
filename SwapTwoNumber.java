package com.company;

import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String args[]){
        int num1=0; 
        int num2=0;
        int swap;
        Scanner scan = new Scanner(System.in);
      
        //printing user input before swaping and get user input
        System.out.print("Enter Two Number : ");
        System.out.print("\nFirst Number : ");
        num1 = scan.nextInt();
        System.out.print("Second Number : ");
        num2 = scan.nextInt();
       
       //condition for swapping 
        swap = num1;
        num1 = num2;
        num2 = swap;

       //printing user input after swaping
        System.out.print("The Value of the First and Second Number after Swapping is \n");
        System.out.print("First Number = " +num1);
        System.out.print("\nSecond Number = " +num2);
    }
}
