package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {
				new SmsLogger(), 
				new EmailLogger(), 
				new DatabaseLogger(),
				new FileLogger() 		
		};
		
		CustomerManager customerManager = new CustomerManager(loggers);
		
		
		Customer Yusuf = new Customer(1, "Yusuf", "Butun");
		customerManager.add(Yusuf);
		
		Customer Mehmet = new Customer(2, "Mehmet", "Butun");
		customerManager.add(Mehmet);

	}
 
}
