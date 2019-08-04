import java.util.Scanner;

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


        //Base contact
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
            businessContact[businessContactIndex] = businessContactNew;
            businessContactIndex++;
        }
        else{
            System.out.println("Invalid input!");
        }
    }

    public void remove(){
        //Change contact to null
        //Move all contacts one space in the array
        //decrement index
    }

    public void displayOne(){
        //display selected contact
        //required array index
    }

    public void displayAll(){
        //Print every contact
        //BaseContact first
        //Person 2nd
        //business 3rd
    }

    public void sort(){
        //use built in String sort?
    }

    public void search(){
        //Look for built in search
    }
}
