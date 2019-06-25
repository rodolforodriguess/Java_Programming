package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter base cost of the plan:");
        double baseCost = scanner.nextDouble();

        System.out.println("Enter the overage minutes:");
        double overageMinutes = scanner.nextInt();


        double overageCharges = calculateOverages(overageMinutes);
        double tax = calculateTax(baseCost + overageCharges);

        calculateAndPrintBiil(baseCost, overageCharges, tax);
        scanner.close();
    }


    public static double calculateOverages(double extraMinutes){
        double charge = 0.25;
        double overageTotal = extraMinutes * charge;
        return overageTotal;
    }

    public static double calculateTax(double subtotal){
        double taxSubtotal = 0.15;
        double tax = subtotal * taxSubtotal;
        return tax;
    }

    public static void calculateAndPrintBiil(double base, double overage, double tax){
        double finalTotal = base + overage + tax;

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $ " + String.format("%.2f", base));
        System.out.println("Overage: $ " + String.format("%.2f", overage));
        System.out.println("Tax: $ " + String.format("%.2f", tax));
        System.out.println("Total: $ " + String.format("%.2f", finalTotal));
    }
}

