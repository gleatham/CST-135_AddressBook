public class PersonContact {
    private String dob;
    private String description;
    //BaseContact[];

    //Add relatives. Array of BaseContact
    PersonContact(String dob, String description){
        this.dob = dob;
        this.description = description;
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
