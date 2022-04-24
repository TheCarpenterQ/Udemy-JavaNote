public class SpecificCar extends Car{
    private int month;

    public SpecificCar( int month) {
        super("Specific", "white",4, 4, 6, false);
        this.month = month;
    }

    public void accelerate(int rate){
        int newVelocity = getCurrentSpeed() + rate;
        if (newVelocity == 0){
            stop();
            gear(1);
        } else if (newVelocity > 0 && newVelocity <= 10){
            gear(1);
        } else if (newVelocity > 10 && newVelocity <= 20){
            gear(2);
        } else if (newVelocity > 20 && newVelocity <=30){
            gear(3);
        } else {
            gear(4);
        }
        if (newVelocity > 0){
            speed(newVelocity,getCurrentDirection());
        }
    }
}
