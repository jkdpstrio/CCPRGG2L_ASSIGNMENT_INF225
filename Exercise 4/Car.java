public class Car {
    
    String name;
    Myself owner;

    Car(  String carName, Myself ownerName){
        this.name=carName;
        this.owner=ownerName;
    }

    void showCar(){
        System.out.println("car model: "+ this.name + ",  owner name: " + owner.name);
    }
}
