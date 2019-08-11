public class FileAccessService implements DataAccessService {
    @Override
    public void readAllContacts(AddressBook addressBook) {
        Location location1 = new Location("25", "Street 1", "Los Angeles", "CA");
        Location location2 = new Location("20", "Street 2", "New York", "NY");
        Location location3 = new Location("09", "Street 3", "Cleveland", "OH");
        //Three person contacts
        /*
        BusinessContact person1 = new BusinessContact("05/11/1990", "Cool Red head", 0,
                "Steven Leatham", "380-420-4200", location1);
        BusinessContact person2 = new BusinessContact("05/20/1996", "Awesome dude!", 1,
                "Nate", "360-098-0345", location2);
        BusinessContact person3 = new BusinessContact("01/28/1994", "Twin",
                2, "Rebecca", "760-320-0000", location3);
        //Three business contacts
        BusinessContact business1 = new BusinessContact("9-5", "website.com", 3,
                "Business 1", "555-555-5555", location1, true);
        BusinessContact business2 = new BusinessContact("11-7", "Business2.com", 4,
                "Business2", "800-123-45678", location2, true);
        BusinessContact business3 = new BusinessContact("24/7", "24hours.com", 5,
                "Business3", "800-333-0000", location3, true);

         */

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

    }

    @Override
    public void saveAllContacts() {

    }
}
