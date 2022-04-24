public class Dog extends Animal{  //EXTENDS:inherit class from Animal
                                    //need to call other constructor class to initialize it
    private int eyes;  //unique characteristics relating to a dog
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight,int eyes,int legs,int tail,int teeth,String coat) {
        super(name, 1,1, size, weight);  //SUPER:call the constructor that is for the class that we're extending from
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;  //initialize all the fields related to the dog
    }

    private void chew(){  //special method for dog for eating
        System.out.println("Dog.chew() called");
    }

    @Override //also can override the eat method from GENERATE
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();  //call the unique to the dog class
        super.eat();  //call the animal.eat class
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        move(5);  //call move() in animal class
                        //if there is a override move(),then it will execute the override one,
        // or it'll execute the move method in Animal
        //if there is a SUPER.MOVE(),it'll directly call the super class
    }

    public void run(){
        System.out.println("Dog.run() called");
        super.move(10);
    }

    private void movelegs(int speed){
        System.out.println("Dog.movelegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        movelegs(speed);
        super.move(speed);
    }
}
