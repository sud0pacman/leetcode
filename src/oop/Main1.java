package oop;

public class Main1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.age = 17;
        person.height = 155;
        person.weight = 58;

        person.show();

        System.out.println();

        Car car = new Car();
        car.brand = "Cobalt";
        car.weight = 1.5;
        car.color = "oq";
        car.madeYear = 2015;

        car.show();
    }
}
