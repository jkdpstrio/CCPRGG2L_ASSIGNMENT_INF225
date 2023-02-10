public class App {
    public static void main(String[] args) throws Exception {
        
        Person Me = new Person();

        //Me.name;

        Me.setName( "Kenny");

        String myName = Me.getName();

        System.out.println("My name is " + myName);

        Me.setNum(69504);

        int myCCnum = Me.getNum();
        System.out.println("My credit card number is " + myCCnum);

        Son me = new Son();

        System.out.println("My surname is " + me.surname);
    }
}
