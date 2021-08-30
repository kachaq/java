package ecommerce.dataAccess.abstracts;

import ecommerce.entities.concretes.Customer;
import java.util.List;

public interface CustomerDao {
	
	void add (Customer customer);
	void delete (Customer customer);
	void update (Customer customer);
	boolean getEmail (String email);
	boolean getPassword (String password);
	List<Customer> getAll();
	
	

}
