public class Vehicle {
    private String name;
    private String colour;
    private int currentDirection;
    private int currentSpeed;

    public Vehicle(String name, String colour) {
        this.name = name;
        this.colour = colour;
        this.currentDirection = 0;
        this.currentSpeed = 0;
    }

    public void steer(int direction){
        currentDirection +=direction;
        System.out.println("Current direction is " + currentDirection);
    }

    public void move(int speed,int direction){
        currentSpeed = speed;
        currentDirection = direction;
        System.out.println("Current speed is " + speed + ",current direction is " + direction);
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void stop(){
        this.currentSpeed = 0;
    }
}
