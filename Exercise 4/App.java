public class App {
    public static void main(String[] args) throws Exception {
      
      Person friend =  new Person(18,"Ashe");
      Myself Me = new Myself(19,"Jk");

      Me.addFriend(friend);

      Pet cat = new Pet("Snow", friend);
      cat.showOwnerName();

      Car car = new Car("Supraaa", Me);
      car.showCar();
    }
}
