package chapter10;

public class Apple extends Fruit {

    public Apple(){
        setCalories(32);
    }
    @Override
    public void makeJuice(){
        System.out.println("A delicious apple juice is ready for you to taste");
    }
    public void removeSeeds(){
        System.out.println("Now you are able to eat this yummy apple because you have removed the seeds");
    }
}
