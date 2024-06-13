package Shop;

public enum Products {
    WATERMELON ("Арбуз"),
    APPLE ("Яблоко"),
    BANANA ("Банан"),
    ORANGE ("Апельсин"),
    PEAR ("Груша"),
    PINEAPPLE ("Ананас");

    private String title;

    Products(String string) {
        this.title = string;
    }

    public String getTitle() {
       return title;
   }
}
