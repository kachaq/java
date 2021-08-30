package ecommerce.business.abstracts;

import ecommerce.entities.concretes.Customer;

public interface CustomerService {
	void login (Customer customer);
	void signup (Customer customer);
}
