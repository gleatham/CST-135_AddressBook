public class BaseContact {
    private int number;
    private String name;
    private int phone;
    //private Photo[] photos = new Photo[10];
    private Location location;
    private PersonContact personContact;
    private BusinessContact businessContact;

    BaseContact(int number, String name, int phone, Photo[] photo, Location location, PersonContact personContact,
                BusinessContact businessContact){
        this.number = number;
        this.name = name;
        this.phone = phone;
        //this.photos = photos;
        this.location = location;
        this.personContact = personContact;
        this.businessContact = businessContact;
    }
}
