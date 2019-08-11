import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;

public class AddressBook {
    private ArrayList<BusinessContact> addressBook = new ArrayList<>();

    //Scanner for the entire class
    Scanner input = new Scanner(System.in);

    public void add(){
        //BaseContact variables
        int number = 0; //Contacts index in the array. ID Number
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

            PersonContact personContactNew = new PersonContact(dob, description, number, name, phone, location);
            BusinessContact businessContactNew = new BusinessContact(dob, description, number, name, phone, location);

            System.out.print("Would you like to add a photo?\n1. Yes\n2.No");
            int temp;
            temp = input.nextInt();
            if(temp == 1){
                Photo newPhoto = addPhoto();
                personContactNew.addPhoto(newPhoto);
            }

            addressBook.add(businessContactNew);
        }
        else if(option == 2){
            //Add a business contact
            System.out.print("Business Hours: ");
            businessHours = input.nextLine();
            System.out.print("Website: ");
            url = input.nextLine();
            Boolean isBusiness = true;

            BusinessContact businessContactNew = new BusinessContact(businessHours, url, number, name, phone, location,
                    isBusiness);

            System.out.print("Would you like to add a photo?\n1. Yes\n2.No");
            int temp;
            temp = input.nextInt();
            if(temp == 1){
                Photo newPhoto = addPhoto();
                businessContactNew.addPhoto(newPhoto);
            }

            addressBook.add(businessContactNew);
        }
        else{
            System.out.println("Invalid input!");
        }
    }

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

    public void displayOne(int number){
        System.out.println(addressBook.get(number).getName());
        System.out.println(addressBook.get(number).getPhone());
        System.out.println(addressBook.get(number).getLocation().getStreet());
        System.out.println(addressBook.get(number).getLocation().getCity());
        System.out.println(addressBook.get(number).getLocation().getState());
        System.out.println(addressBook.get(number).getLocation().getLocationId());

        if(addressBook.get(number).getIsBusiness()){
            System.out.println(addressBook.get(number).getBusinessHours());
            System.out.println(addressBook.get(number).getUrl());
        }
        else {
            System.out.println(addressBook.get(number).getDob());
            System.out.println(addressBook.get(number).getDescription());
        }

    }

    public void displayAll(){
        for(int i = 0; i < addressBook.size(); i++){
            System.out.println(addressBook.get(i).getName());
            System.out.println(addressBook.get(i).getPhone());
            System.out.println(addressBook.get(i).getLocation().getStreet());
            System.out.println(addressBook.get(i).getLocation().getCity());
            System.out.println(addressBook.get(i).getLocation().getState());
            System.out.println(addressBook.get(i).getLocation().getLocationId());

            if(addressBook.get(i).getIsBusiness()){
                System.out.println(addressBook.get(i).getBusinessHours());
                System.out.println(addressBook.get(i).getUrl());
            }
            else {
                System.out.println(addressBook.get(i).getDob());
                System.out.println(addressBook.get(i).getDescription());
            }
        }
    }

    public ArrayList getAddressBook(){
        return addressBook;
    }
}
