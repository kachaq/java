package coding.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import coding.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product,Integer>{
	
}
