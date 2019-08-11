/**
 * Child of PersonContact
 * Used by AddressBook to create both Person and Business contacts
 * Boolean isBusiness used to add and display the proper info for each contact.
 */
public class BusinessContact extends PersonContact {
    private String businessHours;
    private String url;
    Boolean isBusiness = false;


    BusinessContact(int number, String name, String phone, Location location){
        super(number, name, phone, location);
    }


    BusinessContact(String dob, String description, int number, String name, String phone, Location location){
        super(dob, description, number, name, phone, location);
    }


    BusinessContact(String businessHours, String url, int number, String name, String phone, Location location,
                    Boolean isBusiness){
        super(number, name, phone, location);
        this.businessHours = businessHours;
        this.url = url;
        this.isBusiness = isBusiness;
    }

    public String getBusinessHours() {
        return businessHours;
    }

    public void setBusinessHours(String businessHours) {
        this.businessHours = businessHours;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getIsBusiness() {
        return isBusiness;
    }
}
