import java.util.Scanner;

public class AddressBook {
    private BaseContact[] contacts = new BaseContact[100];
    private int index;
    Scanner input = new Scanner(System.in);

    public void add(){
        int number;
        String name;
        int phone;
        //photos somehow
        Location location;
        PersonContact personContact;
        BusinessContact businessContact;
        System.out.println("Please enter the following: ");
        System.out.print("Name: ");
        name = input.nextLine();

    }

    public void remove(){
        return;
    }

    public void displayOne(){
        return;
    }

    public void displayAll(){
        return;
    }

    public void sort(){
        return;
    }

    public void search(){
        return;
    }
}
