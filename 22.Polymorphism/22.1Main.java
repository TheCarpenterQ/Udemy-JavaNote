//Polymorphism:assign different functionality depending
//on the type of objects that we've created
class Movie{
    private String name;
    public Movie(String name){  //initialize
        this.name = name;
    }

    public String plot(){ //a method called plot
        return "no plot here";
    }

    public String getName() {  //getter
        return name;
    }
}

class Jaws extends Movie{  //5 extend classes inherit from the movie class
    public Jaws(){  //initialize via the constructor
        super("Jaws");
    }

    public String plot(){  //get own plot method
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie {

    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}

class MazeRunner extends Movie{
    public MazeRunner() {
        super("MazeRunner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}

class StarWars extends Movie{
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the universe";
    }
}


class Forgetable extends Movie{
    public Forgetable() {
        super("Forgetable");
    }
    //no spot method.so just directly inherit from the base class
}

public class Main {

    public static void main(String[] args) {
        for (int i = 1;i < 11;i ++){
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + ":" +movie.getName() + "\n" + "Plot:" + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie(){
        int randomNumber = (int)(Math.random() * 5) + 1;  //Math.random:random a number between >=0 && <1.We cast it into an integer
        System.out.println("Random number generated was :" + randomNumber);
        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }
        return null;
    }
}
