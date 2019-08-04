public class BusinessContact extends BaseContact {
    private String businessHours;
    private String url;

    BusinessContact(String businessHours, String url){
        this.businessHours = businessHours;
        this.url = url;
    }

    BusinessContact(String businessHours, String url, int number, String name, String phone, Photo[] photos, Location location){
        super(number, name, phone, location);
        this.businessHours = businessHours;
        this.url = url;
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
}
