package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product();
		product1.setId(1);
		product1.setName("Lenovo V14");
		product1.setDetail("16 GB Ram");
		product1.setDiscount(10);
		product1.setUnitPrice(15000);
		
		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setDetail("26 GB Ram");
		product2.setDiscount(10);
		product2.setUnitPrice(25000);

		Product product3 = new Product();
		product3.setId(3);
		product3.setName("Lenovo V16");
		product3.setDetail("36 GB Ram");
		product3.setDiscount(10);
		product3.setUnitPrice(35000);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
	
		Category category1 = new Category();
		
		category1.setId(1);
		category1.setName("Yiyecek");
		
		Category category2 = new Category();
		
		category2.setId(2);
		category2.setName("Icecek");
		
		
	 System.out.println(category1.getName());
	 System.out.println(category2.getName());
	
	
	
	
	
	
	
	
			
		

	}

}
