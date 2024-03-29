/**
 * Stand along class.
 * Used by BaseContact to add a location
 */
public class Location {
    private String locationId;
    private String street;
    private String city;
    private String state;

    Location(String locationId, String street, String city, String state){
        this.locationId = locationId;
        this.street = street;
        this.city = city;
        this.state = state;
    }


    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
