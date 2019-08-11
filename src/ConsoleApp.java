import java.util.Scanner;

/**
 * Driver for Address book application.
 * Initializes AddressBook object
 */
public class ConsoleApp {
    public static void main(String[] args){

        AddressBook addressBook = new AddressBook();

        FileAccessService readFile = new FileAccessService();
        readFile.readAllContacts(addressBook);

        Scanner input = new Scanner(System.in);
        String a = "i";
        Boolean run = true;

        while(run){
            System.out.println("Pick an option");
            System.out.println("1. Add a contact");
            System.out.println("2. Display a contact");
            System.out.println("3. Display all contacts");
            System.out.println("4. Delete contact");
            System.out.println("5. Search");

            a = input.nextLine();

            if(a.equals("q")){
                break;
            }
            if(a.equals("1")){
                addressBook.add();
            }
            if(a.equals("2")){
                try {
                    System.out.println("Enter contact number between 1 and " + addressBook.getAddressBook().size());
                    int number = input.nextInt();
                    input.nextLine();
                    number--;
                    addressBook.displayOne(number);
                }
                catch(java.util.InputMismatchException number) {
                    System.out.println("Invalid Input! Please enter a number.");
                }
            }
            if(a.equals("3")){
                addressBook.displayAll();
            }
            if(a.equals("4")){
                System.out.println("Enter contact number to remove.");
                int index = input.nextInt();
                input.nextLine();
                addressBook.removeOne(index);
            }
            if(a.equals("5")){
                String search;
                System.out.print("Search: ");
                search = input.nextLine();
                addressBook.search(search);
            }
        }

    }

}
