package chapter3;

import java.util.Scanner;

public class DollarGame {
    public static void main(String args[]){

        //Initialize what we know
        int pennies = 1;
        int nickels = 5;
        int dimes = 10;
        int quarters = 25;

        //Get how many pennies
        System.out.println("Enter how many pennies would you like?");
        Scanner scanner  = new Scanner(System.in);
        int numberPennies = scanner.nextInt();

        //Get how many nickels
        System.out.print("Enter how many nickels would you like?");
        int numberNickels = scanner.nextInt();

        //Get how many dimes
        System.out.print("Enter how many dimes would you like?");
        int numberDimes = scanner.nextInt();

        //Get how many quarters
        System.out.print("Enter how many quarters would you like?");
        int numberQuarters = scanner.nextInt();
        scanner.close();

        //Make a decision
        int total = ((pennies * numberPennies) + (nickels * numberNickels) + (dimes * numberDimes)
                + (quarters * numberQuarters));

        if (total == 100){
            System.out.println("You are lucky! You won the game.");
        }else if (total < 100 ){
            System.out.println("You went " + (100 - total) + " under 1$. Sorry!");
        }else{
            System.out.println("You went " + (total - 100) + " over 1$. Sorry. That's more than one dollar");
        }
    }
}
