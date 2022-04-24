public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();  //define an object of Car,call it Porsche
        Car holden = new Car();  //New:always have to use it when creating classes
        porsche.setModel("Carrera");  //calling the setModel method for the object and updating it with the value Carrera
        System.out.println("Model is " + porsche.getModel());
    }
}