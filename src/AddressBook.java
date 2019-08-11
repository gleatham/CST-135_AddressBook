import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;

/**
 * AddressBook holds an ArrayList of BusinessContact objects.
 * BusinessContact is a subclass of PersonContact which is a subclass of BaseContact
 */
public class AddressBook {
    private ArrayList<BusinessContact> addressBook = new ArrayList<>();
    private int contactNumber = 0; //will be used to assign number, corresponds to index location

    //Scanner for the entire class
    Scanner input = new Scanner(System.in);


    public void add(){
        //BaseContact variables
        String name;
        String phone;

        //Location and needed variables for location
        Location location;
        String locationId;
        String street;
        String city;
        String state;

        //Person Contact
        String dob;
        String description;
        ArrayList<BaseContact> relatives = new ArrayList<BaseContact>();

        //Business contact variables
        String businessHours;
        String url;

        int option;
        System.out.println("What kind of contact do you want to add?\n1. Personal Contact\n2. Business Contact");
        option = input.nextInt();
        input.nextLine();//clear machine garbage


        //BaseContact info; this is used in personal and business contacts
        System.out.println("Please enter the following");
        System.out.print("Name: ");
        name = input.nextLine();

        System.out.print("Phone Number: ");
        phone = input.nextLine();

        System.out.print("Location ID: ");
        locationId = input.nextLine();

        System.out.print("Street: ");
        street = input.nextLine();

        System.out.print("City: ");
        city = input.nextLine();

        System.out.print("State: ");
        state = input.nextLine();
        location = new Location(locationId, street, city, state);

        if(option == 1) {
            System.out.print("Date of birth: ");
            dob = input.nextLine();
            System.out.print("Description: ");
            description = input.nextLine();

            //PersonContact personContactNew = new PersonContact(dob, description, contactNumber, name, phone, location);

            //Actually a person contact
            BusinessContact businessContactNew = new BusinessContact(dob, description, contactNumber, name, phone, location);

            System.out.print("Would you like to add a photo?\n1. Yes\n2.No");
            int temp;
            temp = input.nextInt();
            if(temp == 1){
                Photo newPhoto = addPhoto();
                businessContactNew.addPhoto(newPhoto);
            }

            addressBook.add(businessContactNew);
            contactNumber++;
        }
        else if(option == 2){
            //Add a business contact
            System.out.print("Business Hours: ");
            businessHours = input.nextLine();
            System.out.print("Website: ");
            url = input.nextLine();
            Boolean isBusiness = true;

            BusinessContact businessContactNew = new BusinessContact(businessHours, url, contactNumber, name, phone, location,
                    isBusiness);

            System.out.print("Would you like to add a photo?\n1. Yes\n2.No");
            int temp;
            temp = input.nextInt();
            if(temp == 1){
                Photo newPhoto = addPhoto();
                businessContactNew.addPhoto(newPhoto);
            }

            addressBook.add(businessContactNew);
            contactNumber++;
        }
        else{
            System.out.println("Invalid input!");
        }
    }

    public void add(String dob, String description, int number, String name, String phone, Location location){
        BusinessContact businessContactNew = new BusinessContact(dob, description, number, name, phone, location);
        number = this.contactNumber;
        addressBook.add(businessContactNew);
        contactNumber++;
    }

    public void add(String dob, String description, int number, String name, String phone, Location location,
                    Boolean isBusiness){
        number = this.contactNumber;
        BusinessContact businessContactNew = new BusinessContact(dob, description, number, name, phone, location);
        addressBook.add(businessContactNew);
        contactNumber++;
    }

    //This method is called if the user chooses to add a photo.
    //A photo is not needed for the default constructors
    public Photo addPhoto(){
        //Photo variables
        String photoIdNum;
        String fileName;
        String dateOfPhoto;
        String photoDescription;

        System.out.println("Please enter the following");
        System.out.print("Photo ID number: ");
        photoIdNum = input.nextLine();
        input.nextLine(); //clear \n and other garbage from nextInt()
        System.out.println("File name: ");
        fileName = input.nextLine();
        System.out.print("Date the photo was taken: ");
        dateOfPhoto = input.nextLine();
        System.out.print("Description: ");
        photoDescription = input.nextLine();
        Photo photo = new Photo(photoIdNum, fileName, dateOfPhoto, photoDescription);

        return photo;
    }

    public void displayOne(int index){
        try {
            System.out.println("Name: " + addressBook.get(index).getName());
            System.out.println("Contact Number: " + addressBook.get(index).getNumber());
            System.out.println("Phone: " + addressBook.get(index).getPhone());
            System.out.println("Street: " + addressBook.get(index).getLocation().getStreet());
            System.out.println("City: " + addressBook.get(index).getLocation().getCity());
            System.out.println("State: " + addressBook.get(index).getLocation().getState());
            System.out.println("Location ID: " + addressBook.get(index).getLocation().getLocationId());

            if (addressBook.get(index).getIsBusiness()) {
                System.out.println("Business Hours: " + addressBook.get(index).getBusinessHours());
                System.out.println("Website: " + addressBook.get(index).getUrl());
            } else {
                System.out.println("Date of Birth: " + addressBook.get(index).getDob());
                System.out.println("Description: " + addressBook.get(index).getDescription());
            }
        }
        catch (java.lang.IndexOutOfBoundsException addressBook){
            System.out.println("Invalid input, returning to main menu.");
        }

    }

    public void displayAll(){
        for(int i = 0; i < addressBook.size(); i++){
            System.out.println("Name: " + addressBook.get(i).getName());
            System.out.println("Contact Number: " + addressBook.get(i).getNumber());
            System.out.println("Phone: " + addressBook.get(i).getPhone());
            System.out.println("Street: " + addressBook.get(i).getLocation().getStreet());
            System.out.println("City: " + addressBook.get(i).getLocation().getCity());
            System.out.println("State: " + addressBook.get(i).getLocation().getState());
            System.out.println("Location ID: " + addressBook.get(i).getLocation().getLocationId());

            if(addressBook.get(i).getIsBusiness()){
                System.out.println("Business Hours: " + addressBook.get(i).getBusinessHours());
                System.out.println("Website: " + addressBook.get(i).getUrl());
            }
            else {
                System.out.println("Date of Birth: " + addressBook.get(i).getDob());
                System.out.println("Description: " + addressBook.get(i).getDescription());
            }
        }
    }

    public void removeOne(int index){
        addressBook.remove(index);
    }

    public void editContact(int index){
        System.out.println("Select an option");
        System.out.println("1. Edit Name\nEdit Phone\nEdit Location\nEdit Description");
        String a = input.nextLine();
        if(a.equals("1")){
            System.out.print("Name: ");
            String b = input.nextLine();
            addressBook.get(index).setName(b);
        }
    }

    public ArrayList getAddressBook(){
        return addressBook;
    }

    public void search(String search){
        int[] contains = new int[15];
        int index = 0;
        for(BusinessContact i : addressBook){
            if(i.getName() != null && i.getName().contains(search)){
                //System.out.println("Contact number: " + i.getNumber() + " contains " + search);

            }
        }

    }
}
