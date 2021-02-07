import java.util.ArrayList;

public class Contacts {
    private String name;
    private String phoneNumber;

    public Contacts(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }

   public static Contacts createContact(String name, String phoneNumber){
        return new Contacts(name, phoneNumber);
    }

    ArrayList<String> contactList = new ArrayList<String>();
    public ArrayList<String> getContactList(){
        return contactList;
    }

    public void storeContacts(String names){
        System.out.println("You have " + contactList.size() + "Contacts in your list");
        for (int i = 0; i < contactList.size(); i++){
            System.out.println(i + " - " + contactList.get(i));
        }
    }
}
