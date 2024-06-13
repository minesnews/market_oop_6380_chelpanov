
import Shop.Human;
import Shop.Market;
import Shop.Products;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        System.out.println( "--------------------------------Фруктовый магазин--------------------------------");
        Human man = new Human("Nikolay");
        Human man1 = new Human("Boris");
        System.out.println(man.getName());
        Market market = new Market();
        market.addMarketMan(man);
        market.addMarketMan(man1);
        market.getNameAndProducts(man);
        man.buy(Products.APPLE);
        market.getNameAndProducts(man);
        man.buy(Products.WATERMELON);
        market.getNameAndProducts(man);
        market.getNameAndProducts(man1);
        man1.buy(Products.PEAR);
        market.peopleOfStores();
        market.peopleOfQueue();
        market.update();
        market.peopleOfStores();        
        market.peopleOfQueue();
        System.out.println( "---------------------------------------------------------------------------------");
        
    }
}