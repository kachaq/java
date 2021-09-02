package coding.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import coding.northwind.business.abstracts.ProductService;
import coding.northwind.core.utilities.results.DataResult;
import coding.northwind.core.utilities.results.Result;
import coding.northwind.core.utilities.results.SuccessDataResult;
import coding.northwind.core.utilities.results.SuccessResult;
import coding.northwind.dataAccess.abstracts.ProductDao;
import coding.northwind.entities.concretes.Product;

@Service
public class ProductManager implements ProductService{
	
	private ProductDao productDao; 
	
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}
	

	@Override
	public DataResult<List<Product>> getAll() {
		return new SuccessDataResult<List<Product>>
		(this.productDao.findAll(), "Data Listed");			
		
	}


	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		return new SuccessResult("Product Added.");
	}

}
