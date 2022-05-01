public class Contacts {

    private String number;
    private String name;

    public Contacts(String number, String name) {
        this.number = number;
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public static Contacts createContact(String number,String name){
        return new Contacts(number,name);
        //create a new contact record by calling this construction
    }
}
