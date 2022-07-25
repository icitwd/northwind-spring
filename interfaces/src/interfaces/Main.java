package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = { new SmsLogger(), new FileLogger() };
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer icci = new Customer(1, "ilhan", "can");
		
		customerManager.add(icci);

	}

}
