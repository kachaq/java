package ecommerce.business.concretes;

import ecommerce.business.abstracts.CustomerControlService;
import ecommerce.business.abstracts.CustomerService;
import ecommerce.business.abstracts.VerificationService;
import ecommerce.dataAccess.abstracts.CustomerDao;
import ecommerce.entities.concretes.Customer;

public class CustomerManager implements CustomerService {
	
		CustomerControlService controlService;
		VerificationService verificationService;
		CustomerDao customerDao;
		
		public CustomerManager (
				CustomerControlService controlService,
				VerificationService verificationService,
				CustomerDao customerDao
				) {
				this.controlService = controlService;
				this.verificationService = verificationService;
				this.customerDao = customerDao;
		}

	@Override
	public void login(Customer customer) {
verificationService.verifyEmail(customer.getEmail());
		
		if(customerDao.getEmail(customer.getEmail()) && 
				customerDao.getPassword(customer.getPassword()) &&
				 verificationService.controlVerifyAccount(customer.getEmail() ) == true) {
				
				System.out.println("Welcome : " + customer.getFirstName() + " " + customer.getLastName());
		}
		else if(verificationService.controlVerifyAccount(customer.getEmail()) == false) {
			System.out.println("Please Verify Your Email! ");
		}
		else {
			System.out.println("Some information is missing or not valid. Please check all fields and try again. ");
		}
		
	}

	@Override
	public void signup(Customer customer) {
		if(controlService.isValid(customer) == true) {
			System.out.println("Thanks for signing up. : " + customer.getFirstName() + " " + customer.getLastName());
			verificationService.sendToVerifyEmail(customer.getEmail());
			customerDao.add(customer);
		}
		
	}

}
