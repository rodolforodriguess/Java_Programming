package chapter13;

public class DivisionIsFun {

    public static void main(String args[]){
        DivisionOperation();
    }

    public static void DivisionOperation(){
        try{
            int c = 30/0;
        }catch (ArithmeticException e){
            System.out.println("Division cannot be done by zero");
        }finally {
            System.out.print(("Division is fun"));
        }
    }
}
