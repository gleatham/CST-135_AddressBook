import java.util.Scanner;
import java.util.regex.*;

public class AddressBook {
    PersonContact[] personContact = new PersonContact[200];
    BusinessContact[] businessContact = new BusinessContact[200];

    private int totalContacts; //Keeps track of total contacts
    private int personContactIndex = 0; //Where are we in the array?
    private int businessContactIndex = 0; //Where are we in the array?

    //Scanner for the entire class
    Scanner input = new Scanner(System.in);

    public void add(){
        //BaseCcontact variables
        int number = 0; //contact number will be it's index in the array...maybe
        String name;
        String phone;

        //Location and needed variables for location
        Location location;
        int locationId; //might change to string
        String street;
        String city;
        String state;

        //Person Contact
        String dob;
        String description;
        //Relatives: It will need to be an array. I need to figure out a good way to implement it

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
        locationId = input.nextInt();
        input.nextLine(); //clear machine BS

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

            System.out.print("Would you like to add a photo?\n1. Yes\n2.No");
            int temp;
            temp = input.nextInt();
            if(temp == 1){
                Photo newPhoto = addPhoto();
                personContactNew.addPhoto(newPhoto);
            }

            personContact[personContactIndex] = personContactNew;
            personContactIndex++;
        }
        else if(option == 2){
            //Add a business contact
            System.out.print("Business Hours: ");
            businessHours = input.nextLine();
            System.out.print("Website: ");
            url = input.nextLine();

            BusinessContact businessContactNew = new BusinessContact(businessHours, url, number, name, phone, location);

            System.out.print("Would you like to add a photo?\n1. Yes\n2.No");
            int temp;
            temp = input.nextInt();
            if(temp == 1){
                Photo newPhoto = addPhoto();
                businessContactNew.addPhoto(newPhoto);
            }

            businessContact[businessContactIndex] = businessContactNew;
            businessContactIndex++;
        }
        else{
            System.out.println("Invalid input!");
        }
    }

    public Photo addPhoto(){
        //Photo variables
        int photoIdNum;
        String fileName;
        String dateOfPhoto;
        String photoDescription;

        System.out.println("Please enter the following");
        System.out.print("Photo ID number: ");
        photoIdNum = input.nextInt();
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

    public void remove(){
        //Change contact to null
        //Move all contacts one space in the array
        //decrement index
        System.out.println("Press 1 to remove a Personal Contact.\nPress 2 to remove a Business Contact");
    }

    public void displayOne(){
        //display selected contact
        //required array index
    }

    public void displayAll(){
        //Print every contact
        for(int i = 0; i < personContact.length; i++){
            if(personContact[i] == null){
                break;
            }
            else {
                System.out.println("Name: " + personContact[i].getName());
                System.out.println("Contact Number: " + personContact[i].getNumber());
                System.out.println("Phone number: " + personContact[i].getPhone());
                System.out.println("Address: " + personContact[i].getLocation().getStreet() +
                                    personContact[i].getLocation().getCity() + personContact[i].getLocation().getState()
                                    + "\nLocation ID: " + personContact[i].getLocation().getLocationId());
                System.out.println("***Photo Info***"); //Write a seperate method as it will be used for both types
            }
        }
    }

    public void sort(){
        //use built in String sort?
    }

    public void search(){
        //java.util.regex.*; use regular expression to search

        //search business contact array for a match
        int i = 0;
        while(this.businessContact[i] != null && i < 200){
            //if
            i++;
        }
    }
}
