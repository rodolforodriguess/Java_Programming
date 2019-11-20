package chapter10;

public class Banana extends Fruit{
    public Banana(){
        setCalories(59);
    }

    @Override
    public void makeJuice(){
        System.out.println("\nEating banana can bring a lot of long-term benefits for your health");
    }


    public void peel(){
        System.out.println("Banana is a very easy fruit to be eaten. You just have to peel without having to use" +
                "any cutlery");
    }
}
