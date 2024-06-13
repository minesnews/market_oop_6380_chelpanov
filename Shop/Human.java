package Shop;

import java.util.ArrayList;
import java.util.List;

public class Human extends Actor {

    List<Products> products = new ArrayList<Products>();

    public Human(String name) {
        super(name);
    }

    public String getName() {
        return name;
    }

    public void buy(Products product) {
        products.add(product);
        System.out.println(this.getName() + " взял " + product.getTitle());
    }

    public void sell(Products product) {
        products.remove(product);
        System.out.println(this.getName() + " вернул на полку " + product.getTitle());
    }

    public List<Products> getProducts(){
        return products;
    }

}
