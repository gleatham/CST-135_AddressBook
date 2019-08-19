import java.io.*;
import java.util.Scanner;

/**
 * Currently just adds 6 contacts to AddressBook addressBook.
 * Will eventually read from and save to a file
 */
public class FileAccessService implements DataAccessService {
    @Override
    public void readAllContacts(AddressBook addressBook, String fileName) throws FileNotFoundException {
        Location location1 = new Location("25", "Street 1", "Los Angeles", "CA");
        Location location2 = new Location("20", "Street 2", "New York", "NY");
        Location location3 = new Location("09", "Street 3", "Cleveland", "OH");

        int number = 0;
        //new file, new scanner
        File file = new File(fileName);
        Scanner fin = new Scanner(file);
        //loop through file contacts.txt
        while (fin.hasNextLine()){
            String temp = fin.nextLine();
            String [] fields = new String[5]; //9 fields in the end, until Photo is added
            fields = temp.split(",", 0);

            //name, number, isBusiness, field4, field5
            String name = fields[0];
            String phone = fields[1];
            Boolean isBusiness = Boolean.valueOf(fields[2]);
            String field4 = fields[3];
            String field5 = fields[4];

            if(!isBusiness) {
                BusinessContact c = new BusinessContact(field4, field5, number, name, phone, location1);
                addressBook.getAddressBook().add(c);
            } else {
                BusinessContact c = new BusinessContact(field4, field5, number, name, phone,
                        location2, isBusiness);
                addressBook.getAddressBook().add(c);
            }
            number++;
        }
/*
        addressBook.add("05/11/1990", "Cool Red head", 0,
                "Steven Leatham", "380-420-4200", location1);
        addressBook.add("05/20/1996", "Awesome dude!", 1,
                "Nate", "360-098-0345", location2);
        addressBook.add("01/28/1994", "Twin",
                2, "Rebecca", "760-320-0000", location3);
        addressBook.add("9-5", "website.com", 3,
                "Business 1", "555-555-5555", location1, true);
        addressBook.add("11-7", "Business2.com", 4,
                "Business2", "800-123-45678", location2, true);
        addressBook.add("24/7", "24hours.com", 5,
                "Business3", "800-333-0000", location3, true);
*/
    }

    @Override
    public void saveAllContacts(String fileName, String text, Boolean append, int counter) throws IOException {
        //When saving a file the first append is false, after that they all need to be true.
        //if(counter == 0){
          //  File file = new File(fileName);
            //FileWriter fw = new FileWriter(file, false);
            //PrintWriter pw = new PrintWriter(fw, false);
            //pw.println("");
        //}

        File file = new File(fileName);
        FileWriter fw = new FileWriter(file, append);
        PrintWriter pw = new PrintWriter(fw, append);

        pw.println(text);
    }

    public void clearFile(String filenName) throws IOException{
        File file = new File(filenName);
        FileWriter fw = new FileWriter(file, false);
        PrintWriter pw = new PrintWriter(fw, true);
        pw.print("");
    }
}
