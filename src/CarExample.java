import model.Car;

public class CarExample {
    
    public static void main(String[] args) throws Exception {

        System.out.println("Hello Student, let's create couple of cars using our Car class!");
       
        Car hondaCivic = new Car("Honda", "Civic", 2022, 170); // a new instance of a car

        hondaCivic.startTheEngine();
        hondaCivic.drive();
        hondaCivic.makeATurn();
        hondaCivic.stop();

        System.out.println("--------------------");

        Car toyotaCorolla = new Car("Toyota", "Corolla", 2025, 150); // a new instance of a car

        toyotaCorolla.startTheEngine();
        toyotaCorolla.drive();
        toyotaCorolla.makeATurn();
        toyotaCorolla.stop();

        hondaCivic.setModelName("Civic Type R");
        hondaCivic.drive();
   
    }



}
