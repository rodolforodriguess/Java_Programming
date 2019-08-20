package chapter14;

import java.util.Random;

public class Coin {
    private String side;

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public static String HEADS = "Heads over heel";
    public static String TAILS = "Tails over heel";

    public static void main(String args[]){
        Coin coin = new Coin();
        String test = coin.flip();
        System.out.print(test);
    }




    public String flip(){
        Random random = new Random();
        if (random.nextBoolean()){
            setSide(HEADS);
        }else{
            setSide(TAILS);
        }
        return getSide();
    }


}
