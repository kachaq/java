package ecommerce;

import ecommerce.business.concretes.CustomerControlManager;
import ecommerce.business.concretes.CustomerManager;
import ecommerce.business.concretes.VerificationManager;
import ecommerce.dataAccess.concretes.HibernateCustomerDao;
import ecommerce.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer();
		customer1.setCustomerId(1);
		customer1.setFirstName("Yusuf");
		customer1.setLastName("Butun");
		customer1.setEmail("arbutun@gmail.com");
		customer1.setPassword("123456qwe");
		
		
		
		CustomerManager customerManager = new CustomerManager(
				new CustomerControlManager(),
				new VerificationManager(),
				new HibernateCustomerDao()
				);
		
		customerManager.signup(customer1);
		
		//customerManager.login(customer1);

	}

}
