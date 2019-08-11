/**
 * Interface used by FileAccessService and DataBaseAccessService
 */

public interface DataAccessService {

    public void readAllContacts(AddressBook addressBook);
    public void saveAllContacts();
}
