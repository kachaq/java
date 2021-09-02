package coding.northwind.business.abstracts;

import java.util.List;

import coding.northwind.core.utilities.results.DataResult;
import coding.northwind.core.utilities.results.Result;
import coding.northwind.entities.concretes.Product;

public interface ProductService {
	DataResult<List<Product>>  getAll();
	Result add(Product product);
}
