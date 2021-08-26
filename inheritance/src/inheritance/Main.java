package inheritance;

public class Main {

	public static void main(String[] args) {
		
        IndividualCustomer Yusuf = new IndividualCustomer();
		Yusuf.customerNumber = "12345";
		
		
		CorporateCustomer WAI = new CorporateCustomer();
		WAI.customerNumber = "121876342";

		
		CustomerManager customerManager = new CustomerManager();
		//customerManager.add(WAI);
		//customerManager.add(Yusuf);
		
		Customer[] customers = {Yusuf, WAI};
		
		customerManager.addMultiple(customers);
	}

}
