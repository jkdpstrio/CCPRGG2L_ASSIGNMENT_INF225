public class App {
    public static void main(String[] args) throws Exception {
    Groceryitem item1 = new Groceryitem();
        item1.name = "Durex Performa";
        item1.price = 170;
        item1.showItemName();

        Groceryitem item2 = new Toothbrush(); 
        item2.name = "Oral B";
        item2.price = 50;
        item2.showItemName();

        Groceryitem item3 = new Toothpaste();
        item3.name = "Colgate";
        item3.price = 100;
        item3.showItemName();

        Cashier c1 = new Cashier();
        c1.checkOut(item2);
        c1.showPrice(item2);

        c1.checkOut(item3);
        c1.showPrice(item3);

        Groceryitem[] itemArray = new Groceryitem[2];
        itemArray[0] = item2;
        itemArray[1] = item3;

        for (int i = 0; i < itemArray.length; i++) {
            itemArray[i].showItemName();

        }
        Cat myCat = new Cat();
        myCat.eat();

        Lion myLion = new Lion();
        myLion.walk();
        myLion.run();




    }
}
