package inheritance;

public class Main {

	public static void main(String[] args) {

		IndividualCustomer ici = new IndividualCustomer();
		ici.customerNumber = "12345";

		CorporateCustomer yemekSepeti = new CorporateCustomer();
		yemekSepeti.customerNumber = "789";
		Customer p = new IndividualCustomer();
		((IndividualCustomer) p).firstName = "ilhan";
		
		Customer[] customers = {ici , yemekSepeti, p};
		

		CustomerManager customerManager = new CustomerManager();
		customerManager.add(yemekSepeti);
		customerManager.add(ici);
		customerManager.add(p);
		
		customerManager.addMultiple(customers);
	//	System.out.println(((IndividualCustomer) p).firstName);
	}

}
