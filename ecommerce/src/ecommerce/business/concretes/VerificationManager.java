package ecommerce.business.concretes;

import java.util.ArrayList;
import java.util.List;

import ecommerce.business.abstracts.VerificationService;

public class VerificationManager implements VerificationService {
	
	List<String> emailList = new ArrayList<String>();

	@Override
	public void sendToVerifyEmail(String email) {
		System.out.println("We sent an email to " + email + ". Please verify your account! ");
		
	}

	@Override
	public void verifyEmail(String email) {
		emailList.add(email);
		System.out.println("Verify is succed! ");
		
	}

	@Override
	public boolean controlVerifyAccount(String email) {
		if(emailList.contains(email)) {
			return true;
		}
		return false;
	}

}
