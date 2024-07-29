import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    private Map<String, Customer> customerDatabase = new HashMap<>();

    public CustomerRepositoryImpl() {
        // Adding some dummy data
        customerDatabase.put("1", new Customer("1", "Kingshuk Roy"));
        customerDatabase.put("2", new Customer("2", "Proloy Saha"));
    }

    @Override
    public Customer findCustomerById(String id) {
        return customerDatabase.get(id);
    }
}
