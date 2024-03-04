/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crapsgame;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Administrator
 */
public class CrapsGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //declaring variables
         Random generator = new Random();
         int die1, die2, dieTotal = 0;
         int point;
         System.out.println("die1 die2 Total");
         boolean done = false;
         //setting the limit for the random generator.
         for(int x = 1; x <= 1; x++)
         {
             die1 = generator.nextInt(6) + 1;
             die2 = generator.nextInt(6) + 1;
             dieTotal = die1 + die2;
             System.out.printf("%3d %3d %3d\n", die1, die2, dieTotal);
            //all the outputs 
         }
         if((dieTotal) == 7)
         {
             System.out.println("It's a 7! We have a winner!");
         }
         else if((dieTotal) == 11)
         {
             System.out.println("It's an 11! We have a winner!");
         }
         else if((dieTotal) == 2)
         {
             System.out.println("It's a 2! You lose!");
         }
         else if((dieTotal) == 3)
         {
             System.out.println("It's a 3! You lose!");
         }
         else if((dieTotal) == 12)
         {
             System.out.println("It's a 12! You lose!");
         }
         else
         {
             System.out.println("The roll is " + dieTotal + "!");
             point = dieTotal;
             do
             {
                 die1 = generator.nextInt(6) + 1;
                 die2 = generator.nextInt(6) + 1;
                 dieTotal = die1 + die2;
                 System.out.println(" The roll is " + dieTotal);
                 if(dieTotal == point)
                 {
                     System.out.println("That's the POINT!");
                     done = true;
                 }
                 else if(dieTotal == 7)
                 {
                     System.out.println("It's a 7! You crapped out!");
                     done = true;
                 }
             }while(!done);
         }
         
    }
    
}
