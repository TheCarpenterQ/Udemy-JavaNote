public class Car extends Vehicle{
    private int wheels;
    private int doors;
    private int gear;
    private boolean isManual;

    private int currentGear;

    public Car(String name, String colour, int wheels, int doors, int gear, boolean isManual) {
        super(name, colour);
        this.wheels = wheels;
        this.doors = doors;
        this.gear = gear;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void gear(int gear){
        currentGear = gear;
        System.out.println("Current gear is " + currentGear);
    }

    public void speed(int speed,int direction){
        System.out.println("Current change velocity is :" + speed + ", and the direction is " + direction);
        move(speed,direction);
    }

//    @Override
//    public void stop() {
//        super.stop();
//    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public int getGear() {
        return gear;
    }

    public boolean isManual() {
        return isManual;
    }

    public int getCurrentGear() {
        return currentGear;
    }
}
