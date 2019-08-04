import java.util.Scanner;

public class AddressBook {
    private BaseContact[] contacts = new BaseContact[200];
    PersonContact[] personContact = new PersonContact[200];
    BusinessContact[] businessContact = new BusinessContact[200];

    private int totalContacts; //Keeps track of total contacts
    private int baseContactIndex = 0; //Where are we in the array?
    private int personContactIndex = 0; //Where are we in the array?
    private int businessContactIndex = 0; //Where are we in the array?

    //Scanner for the entire class
    Scanner input = new Scanner(System.in);

    public void add(){
        int number = 0; //contact number will be it's index in the array...maybe
        String name;
        String phone;

        //Location and needed variables for location
        Location location;
        int locationId;
        String street;
        String city;
        String state;


        //Base contact
        System.out.println("Please enter the following: ");
        System.out.print("Name: ");
        name = input.nextLine();
        System.out.println();
        System.out.print("Phone Number: ");
        phone = input.nextLine();
        System.out.println();
        System.out.print("Location ID: ");
        locationId = input.nextInt();
        System.out.println();
        System.out.print("Street: ");
        street = input.nextLine();
        System.out.println();
        System.out.print("City: ");
        city = input.nextLine();
        System.out.println();
        System.out.print("State: ");
        state = input.nextLine();

        location = new Location(locationId, street, city, state);
        BaseContact baseContact = new BaseContact(number, name, phone, location);


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
