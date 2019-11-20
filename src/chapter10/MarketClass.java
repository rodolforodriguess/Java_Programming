package chapter10;

public class MarketClass {
    public static void main(String[] args){
        Fruit waterMelon = new Fruit();
        waterMelon.makeJuice();

        Fruit mamba = new Banana();
        System.out.print(mamba.getCalories());
        mamba.makeJuice();

        mamba = new Apple();
        mamba.makeJuice();
        ((Apple) mamba).removeSeeds();

    }
}
