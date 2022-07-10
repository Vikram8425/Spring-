package com.example.demo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class ExampleApplication implements CommandLineRunner{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public static void main(String[] args) {
		SpringApplication.run(ExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*System.out.println("Application Started");
		
		String qry="select * from product";
		
		List<Map<String, Object>> list = jdbcTemplate.queryForList(qry);
		
		
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(0));
//			
//		}
		
		list.forEach(row ->{
			System.out.print(row.get("product_id")+"\t");
			System.out.print(row.get("name")+"\t");
			System.out.print(row.get("prize")+"\t");
			System.out.println(row.get("descrip"));
			System.out.println("______________________");
		}
				
		);
	
	*/
	}
	}
