package ecommerce.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import ecommerce.business.abstracts.CustomerControlService;
import ecommerce.entities.concretes.Customer;

public class CustomerControlManager implements CustomerControlService{
	List<String> eMail = new ArrayList<String>();

	@Override
	public boolean controlFirstName(Customer customer) {
		if(customer.getFirstName().isEmpty()) {
			System.out.println("Name section can not be empty! ");
			return false;
		}
		return true;
	}

	@Override
	public boolean controlLastName(Customer customer) {
		if(customer.getLastName().isEmpty()) {
			System.out.println("Last name section can not be empty! ");
			return false;
		}
		return true;
	}

	@Override
	public boolean controlEmail(Customer customer) {
		String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		
		if(customer.getEmail().isEmpty()) {
			System.out.println("E-mail space can not be empty! ");
			return false;
		}
		else if(pattern.matcher(customer.getEmail()).find() == false) {
			System.out.println("Your email address is wrong. Please enter valid email address! ");
			return false;
		}
		return true;
	}

	@Override
	public boolean controlPassword(Customer customer) {
		if(customer.getPassword().isEmpty()) {
			System.out.println("Password space can not be empty! ");
			
			return false;
	       }
		else if(customer.getPassword().length() < 6) {
			System.out.println("Your password should atleast 6 charcter! ");
			return false;
		}
		return true;
	}

	@Override
	public boolean uniqueEmail(Customer customer) {
		boolean result = true;
		if(eMail.contains(customer.getEmail()) ) {
			System.out.println("This email address is already in use! ");
			result = false;
		}
		else {
			result = true;
			eMail.add(customer.getEmail());
		}
		return result;
	}

	@Override
	public boolean isValid(Customer customer) {
		if(controlFirstName(customer) && controlLastName(customer) && controlEmail(customer) 
				&& controlPassword(customer) && uniqueEmail(customer) == true) {
			return true;
		}
		return false;
	}
}
