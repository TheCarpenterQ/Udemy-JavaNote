public class Car {  //The first character of the class's name should be uppercase
                    //public:other classes that we create can access to this class
    private int doors;  //Fields:the state of Car
    private int wheels;  //private:don't allow the class outside of the class Car to access these vars
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model){  //a method to update the field
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera")||validModel.equals("commodore")){
            this.model = model;
        } else {
            this.model = "Unknown";
        }
        this.model = model;  //update THIS MODEL here with the contents of the parameter model that was passed to us
    }
    public String getModel(){
        return this.model;
    }
}
