package chapter2;

import java.util.Scanner;

public class DrinksDayPerSeason {
    public static void main(String arg[]){
        //1. Get the season of the year
        System.out.println("Enter a season of the year");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        //2. Get then a whole number
        System.out.println("Enter a whole number");
        int whole_number = scanner.nextInt();

        //3. Finally, get an adjective
        System.out.println("To finish, enter an adjective");
        String adjective = scanner.next();

        //4. Display result
        System.out.print("On a " + adjective + " " + season + " day, I drink a minimum of " + whole_number + " cups of coffee");
    }

}
