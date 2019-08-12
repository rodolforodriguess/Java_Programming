package chapter9;

public class TasteTester {

    public static void main(String[] args){
        BirthdayCake birth = new BirthdayCake();
        birth.setPrice(50);

        System.out.println("The BirthdayCake is " + birth.getFlavor() + " and the price is " + birth.getPrice());

        WeddingCake wed = new WeddingCake();
        wed.setPrice(45);

        System.out.println("The WeddingCake is " + wed.getFlavor() + " and the price is " + wed.getPrice());
    }


}
