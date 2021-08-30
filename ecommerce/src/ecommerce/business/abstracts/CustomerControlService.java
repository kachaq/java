package ecommerce.business.abstracts;

import ecommerce.entities.concretes.Customer;

public interface CustomerControlService {
	boolean controlFirstName (Customer customer);
	boolean controlLastName (Customer customer);
	boolean controlEmail (Customer customer);
	boolean controlPassword (Customer customer);
	boolean uniqueEmail (Customer customer);
	boolean isValid (Customer customer);
	
}
