class Car{
    private String name;
    private boolean engine;
    private int wheels;
    private int cylinders;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.wheels = 4;
        this.cylinders = cylinders;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine(){
        return "Car -> startEngine";
    }

    public String accelerate(){
        return "Car -> accelerate";
    }

    public String brake(){
        return "Car -> brake";
    }

}
class Mitsubishi extends Car{
    public Mitsubishi(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> startEngine";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> accelerate";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> brake";
    }
}


public class Main {

    public static void main(String[] args) {
    Car car = new Car("Base Car",8);
    System.out.println(car.startEngine());
    System.out.println(car.accelerate());
    System.out.println(car.brake());

    Mitsubishi mitsubishi = new Mitsubishi("Outlander",6);
    System.out.println(mitsubishi.startEngine());
    System.out.println(mitsubishi.accelerate());
    System.out.println(mitsubishi.brake());

    Ford ford = new Ford("Falcon",6);
    System.out.println(ford.startEngine());
    System.out.println(ford.accelerate());
    System.out.println(ford.brake());

    }


    static class Ford extends Car{
        public Ford(String name, int cylinders) {
            super(name, cylinders);
        }

        @Override
        public String startEngine() {
            return "Main.Ford -> startEngine";
        }

        @Override
        public String accelerate() {
            return "Main.Ford -> accelerate";
        }

        @Override
        public String brake() {
            return "Main.Ford -> brake";
        }
    }
}