public class Groceryitem {

    String name;
    double price;

    // Methods
    public void showItemName() {

        System.out.println("This is a " + this.name);
    }
    public void showPrice(Groceryitem Item) {
        System.out.println(this.price);
    }

}
