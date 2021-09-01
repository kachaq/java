package coding.northwind.business.abstracts;

import java.util.List;

import coding.northwind.entities.concretes.Product;

public interface ProductService {
	List<Product> getAll();
}
