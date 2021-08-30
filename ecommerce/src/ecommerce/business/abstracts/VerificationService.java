package ecommerce.business.abstracts;

public interface VerificationService {
	void sendToVerifyEmail (String email);
	void verifyEmail (String email);
	boolean controlVerifyAccount (String email);
}
