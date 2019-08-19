import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Interface used by FileAccessService and DataBaseAccessService
 */

public interface DataAccessService {

    public void readAllContacts(AddressBook addressBook, String fileName) throws FileNotFoundException;
    public void saveAllContacts(String fileName, String text, Boolean append, int counter) throws IOException;
}
