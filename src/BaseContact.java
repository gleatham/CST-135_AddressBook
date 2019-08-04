public class BaseContact {
    private int number;
    private String name;
    private String phone;
    private Photo[] photos = new Photo[10];
    int photoIndex = 0;
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

    public void addPhoto(Photo photo){
        photos[photoIndex] = photo;
        photoIndex++;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Photo[] getPhotos() {
        return photos;
    }

    public void setPhotos(Photo[] photos) {
        this.photos = photos;
    }

    public int getPhotoIndex() {
        return photoIndex;
    }

    public void setPhotoIndex(int photoIndex) {
        this.photoIndex = photoIndex;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PersonContact getPersonContact() {
        return personContact;
    }

    public void setPersonContact(PersonContact personContact) {
        this.personContact = personContact;
    }

    public BusinessContact getBusinessContact() {
        return businessContact;
    }

    public void setBusinessContact(BusinessContact businessContact) {
        this.businessContact = businessContact;
    }
}
