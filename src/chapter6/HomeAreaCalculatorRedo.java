package chapter6;

import java.util.Scanner;

/*
1 - The scanner method is called by importing the scanner class which needs to be imported given its outside the package
of this class

2 - An instance of the same class has to be created inside its main method in order to make this method able
to call non-static method like getRoom for example. That's because the main method is static and static methods
can only call or work with static data.

3 - Gets the values of the length and width by using the scanner method.
The values area stored inside variables(length and width) within the getRoom method and then,
this method returns as final values these variables as an object of the type Rectangle which a class

4 - In the main method which controls the flow of the program, two variables area created, kitchen and bathroom
 to store the results of the getRoom method which is called to pass the values processed in the previous step.

5 - The variable area is created to get the results of data processed by the calling of the method calculateTotalArea
which receive two objects/variables created in the previous steps in order to pass them as parameters (kitchen and bathroom)

6 - The area of the kitchen and of the bathroom are printed as a sum

7 - The scanner is closed because there won't be any other requests to the user to input data
 */

public class HomeAreaCalculatorRedo {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){

        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();

        double area = calculator.calculateTotalArea(kitchen, bathroom);

        System.out.println("The total area is: " + area);

        calculator.scanner.close();

    }

    public Rectangle getRoom(){

        System.out.println("Enter the length of your room:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room:");
        double width = scanner.nextDouble();

        return new Rectangle(length, width);
    }

    public  double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}
