package chapter8;

import java.util.Scanner;

public class PasswordValidator {
    Scanner scanner = new Scanner(System.in);
    //private String username;
    //private String currentPassword;

    private boolean valid;
    private String errorMessage;

    //public PasswordValidator(String username, String currentPassword){
    //    this.username = username;
    //    this.currentPassword = currentPassword;
    //}

    public boolean IsValid(){
        return valid;
    }

    public String getErrorMessage(){
        return errorMessage;
    }


    public static void main(String[] args){
        PasswordValidator bike = new PasswordValidator();

        System.out.println("Enter the username");
        String username = bike.scanner.nextLine();

        System.out.println("Enter the password");
        String password = bike.scanner.nextLine();

        System.out.println("Enter your new password");
        String newPassword = bike.scanner.nextLine();

        var result = bike.changePassword(username, newPassword);

        do{
            System.out.println(bike.errorMessage);
        }while (result == false);

    }
    public boolean changePassword(String username, String newPassword){
        valid = true;
        errorMessage = "";

        if (newPassword.toUpperCase().contains(username.toUpperCase())) {
            valid = false;
             errorMessage += "\n Your password cannot contain your username";
        }
        return valid;
    }

}
