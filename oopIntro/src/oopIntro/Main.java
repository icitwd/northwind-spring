package oopIntro;

public class Main {

	public static void main(String[] args) {
		
        Product p = new Product(1, "lenovo", 15000, "16 ram", 10);
		
		Product p1 = new Product();
		p1.setId(0);
		p1.setName(null);
		p1.setUnitPrice(0);
		p1.setDiscount(0); 
		p1.setDetail(null);
		System.out.println(p1.getDiscountPrice(0));
	}

}
   