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
		
		Customer customer2 = new Customer();
		customer2.setCustomerId(2);
		customer2.setFirstName("Yunus");
		customer2.setLastName("Butun");
		customer2.setEmail("yunus@example.com");
		customer2.setPassword("123a5");
		
		Customer customer3 = new Customer();
		customer3.setCustomerId(3);
		customer3.setFirstName("Osman");
		customer3.setLastName("Butun");
		customer3.setEmail("osmanexample.com");
		customer3.setPassword("123456osman");
		
		CustomerManager customerManager = new CustomerManager(new CustomerControlManager()
				, new VerificationManager()
				, new HibernateCustomerDao());
		
		customerManager.signup(customer1);
		customerManager.signup(customer2);
		customerManager.signup(customer3);
		customerManager.login(customer1);
		customerManager.login(customer2);
		customerManager.login(customer3);

	}

}
