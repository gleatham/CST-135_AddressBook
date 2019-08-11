/**
 * Child of BaseContact
 * Parent of BusinessContact
 */
public class PersonContact extends BaseContact {
    private String dob;
    private String description;
    //Still need to add relatives array

    PersonContact(String dob, String description){
        this.dob = dob;
        this.description = description;
    }

    PersonContact(String dob, String description, int number, String name, String phone, Location location){
        super(number, name, phone, location);
        this.dob = dob;
        this.description = description;
    }

    PersonContact(int number, String name, String phone, Location location){
        super(number, name, phone, location);
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
