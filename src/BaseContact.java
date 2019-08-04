public class BaseContact {
    private int number;
    private String name;
    private String phone;
    private Photo[] photos = new Photo[10];
    private Location location;
    private PersonContact personContact;
    private BusinessContact businessContact;

    public BaseContact(int number, String name, String phone, Location location){
        this.number = number;
        this.name = name;
        this.phone = phone;
        this.photos = photos;
        this.location = location;
    }

    public BaseContact(int number, String name, String phone, Photo[] photos, Location location, PersonContact personContact,
                BusinessContact businessContact){
        this.number = number;
        this.name = name;
        this.phone = phone;
        this.photos = photos;
        this.location = location;
        this.personContact = personContact;
        this.businessContact = businessContact;
    }

    public BaseContact() {
    }
}
