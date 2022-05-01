import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contacts> myContacts;  //build an arraylist comes from class Contacts

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contacts>();  //arraylist initialized:new and blank
    }

    public String getMyNumber() {
        return myNumber;
    }

    public ArrayList<Contacts> getMyContacts() {
        return myContacts;
    }

    public void printMyContacts(){
        System.out.println("You have " + myContacts.size() + " contacts in your contacts list");
        for (int i=0;i< myContacts.size(); i++){
            System.out.println((i+1) + "." + myContacts.get(i).getName() + " " + myContacts.get(i).getNumber());
        }
    }

    public boolean addContacts(Contacts contacts){
        if(findContacts(contacts.getName()) >= 0){
            System.out.println("Contact already existed");
            return false;
        }
        myContacts.add(contacts);
        return true;
    }

    public boolean updateContacts(Contacts oldContact,Contacts newContact){
        int position = findContacts(oldContact);
        if (findContacts(oldContact) < 0){
            System.out.println("Contact not found");
            return false;
        } else if (findContacts(newContact.getName()) != -1){
            System.out.println("Contact with name " + newContact.getName() + " already exists");
            return false;
        }
        this.myContacts.set(position,newContact);
        System.out.println("Contact " + newContact.getName() + " has been updated.");
        return true;
    }

    public boolean removeContacts(Contacts contacts){
        int position = findContacts(contacts);
        if (findContacts(contacts) < 0){
            System.out.println("Contact is not found");
        return false;
        }
        myContacts.remove(position);
        System.out.println("Contact " + contacts.getName() + " has been removed.");
        return true;
    }

    public String queryContact(Contacts contacts){
        if (findContacts(contacts) >= 0){
            return contacts.getName();
        }
        return null;
    }

    public Contacts queryContact(String name){
        int position = findContacts(name);
        if (position >= 0){
            return this.myContacts.get(position);
        }
        return null;
    }

    private int findContacts(Contacts contacts){  //find the index of contact
        return this.myContacts.indexOf(contacts);
    }

    private int findContacts(String contactName){  //find the index of contact through contact's name
        for (int i=0;i< myContacts.size(); i++){
            Contacts contacts = this.myContacts.get(i);
            if (contacts.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

}
