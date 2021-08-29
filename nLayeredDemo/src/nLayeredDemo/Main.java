//For testing purpose.
package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
//import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.dataAccess.concretes.NewPackageProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		
		// Bad Code
		// Spring IoC use!
		//ProductService productService = new ProductManager(new HibernateProductDao());
		ProductService productService = new ProductManager(new NewPackageProductDao());
		
		// Change second 1 to 2
		Product product = new Product(1, 2, "Apple", 12,50);
		productService.add(product);

	}

}
 