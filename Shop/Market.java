package Shop;

import java.util.ArrayList;
import java.util.List;


public class Market implements MarketBehaviour, QueueBehaviour {
    
    public List<Human> people = new ArrayList<Human>();
    public List<Human> peopleQueue = new ArrayList<Human>();

    int byuers = 0;

    public void addMarketMan(Human person) {
        if (!(people.contains(person))) {
            people.add(person);
            System.out.println(person.getName() + " зашел в магазин");
        }
        else {
            System.out.println("Этот человек уже в магазине");
        }
    }
    
    public void removeMarketMan(Human person) {
        if (people.contains(person)) {
            people.remove(person);
            System.out.println(person.getName() + " ушел из магазина");
        }
        else {
            System.out.println("Этого человека нет в магазине");
        }
    }

    public void getNameAndProducts(Human person) {
        System.out.println(person.getName() + ": " +  person.getProducts());
    }

    public void peopleOfStores() {
        System.out.print("Список людей и взятых ими продуктов в магазине: {" );
        for(Human model : people) {
            System.out.print(model.getName()+ ": " + model.getProducts() +  ", " );
        }
        System.out.println("}");
    }

    public void peopleOfQueue() {
        System.out.print("Список людей и взятых ими продуктов в очереди: {" );
        for(Human model : peopleQueue) {
            System.out.print(model.getName()+ ": " + model.getProducts() +  ", " );
        }
        System.out.println("}");
    }

    public void addQueue(Human person) {
        if (people.contains(person)) {         
            if (!(peopleQueue.contains(person))) {
                peopleQueue.add(person);
                System.out.println(person.getName() + " встал в очередь");
            }
            else {
                System.out.println("Этот человек уже в очереди");
            }
        }
        else {
            System.out.println("Этот человек не в магазине");
        }
    }

    public void removeQueue(Human person) {
        
        if (peopleQueue.contains(person)) {
            peopleQueue.remove(person);
            System.out.println(person.getName() + " ушел из очереди");
        }
        else {
            System.out.println("Этого человека нет в очереди");
        }
    }

    public void paidProducts() {
        peopleQueue.remove(0);
        people.remove(0);
        byuers+=1;
        System.out.println(byuers + " человек в очереди оплатил свои продукты");    
    }

    public void update(){
        
        for (Human human : people) {
            addQueue(human);
        }
        while (peopleQueue.size() > 0) {
            paidProducts();
        }
    }
}
