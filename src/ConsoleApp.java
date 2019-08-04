public class ConsoleApp {
    public static void main(String[] args){
        //call address book commands
        System.out.println("Pick an option");
        System.out.println("1. Add a contact");
        System.out.println("2. Display a contact");
        AddressBook addressBook = new AddressBook();
        addressBook.add();

    }
}
