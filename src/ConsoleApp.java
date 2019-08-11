import java.util.Scanner;

public class ConsoleApp {
    public static void main(String[] args){

        AddressBook addressBook = new AddressBook();

        Scanner input = new Scanner(System.in);
        String a = "i";
        Boolean run = true;

        while(run){
            System.out.println("Pick an option");
            System.out.println("1. Add a contact");
            System.out.println("2. Display a contact");
            System.out.println("3. Display all contacts");

            a = input.nextLine();

            if(a.equals("q")){
                break;
            }
            if(a.equals("1")){
                addressBook.add();
            }
            if(a.equals("2")){
                System.out.println("Enter contact number between 1 and " + addressBook.getAddressBook().size());
                int number = input.nextInt();
                input.nextLine();
                addressBook.displayOne(number);
            }
            if(a.equals("3")){
                addressBook.displayAll();
            }
        }

    }
}
