package com.example.profiles.Runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.profiles.Repository.ProductRepository;
import com.example.profiles.Repository.VendorRepositpry;
import com.example.profiles.entity.Product;
import com.example.profiles.entity.Vendor;

@Component
public class TestRunOperations implements CommandLineRunner {
	@Autowired
	private ProductRepository Prepo;
	@Autowired
	private VendorRepositpry Vrepo;

	@Override
	public void run(String... args) throws Exception {
		Vendor v1= new Vendor(100,"ABC");
		Vrepo.save(v1);
		

		Product P1=new Product(11,"pen",20,v1);
		Product P2=new Product(12,"pencil",30,v1);
		Product P3=new Product(13,"Eraser",15,v1);
		
		Prepo.save(P1);
		Prepo.save(P2);
		Prepo.save(P3);
		
		List<Object[]> list1 = Prepo.getproductnameVendornames();
		for(Object[] ob:list1) {
			System.out.println(ob[0]+" --HAS A-- "+ob[1]);
		}
		
		
	}

}
