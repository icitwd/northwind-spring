package nLayeredDemo;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.jLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
	
		//ToDo Spring IoC
		ProductService productService = new ProductManager(new HibernateProductDao(), new jLoggerManagerAdapter());
			
		
		Product product = new Product(1,2,"Elma",12,50);
		productService.add(product);
			
		
	}

}
