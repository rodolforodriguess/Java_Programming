package chapter7;

import java.util.Scanner;

public class DayOfTheWeek {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number from 1 to 7 to indicate a day of the week");
        int number = scanner.nextInt();

        System.out.println("Today is " + DaysOfWeek(number));

    }



    public static String DaysOfWeek(int number){
        String[] DaysWritten = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String name = "Empty";
        switch (number){
            case 1:
                name = DaysWritten[0];
                break;
            case 2:
                name = DaysWritten[1];
                break;
            case 3:
                name = DaysWritten[2];
                break;
            case 4:
                name = DaysWritten[3];
                break;
            case 5:
                name = DaysWritten[4];
                break;
            case 6:
                name = DaysWritten[5];
                break;
            case 7:
                name = DaysWritten[6];
                break;
        }
        return name;
    }

}
