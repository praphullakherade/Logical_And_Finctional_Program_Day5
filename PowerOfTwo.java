import java.util.Scanner;
public class PowerOfTwo{  
   public static void main(String[] args){  
        System.out.println("Enter the Value: ");
       Scanner sc= new Scanner(System.in);
       int num = sc.nextInt();
    
      int power;
      for (int i=1; i<=num; i++){
          power = (int) Math.pow(2, i);
          System.out.println(2 + " Power of " + i + " is " + power);
      } 
   }  
} 
