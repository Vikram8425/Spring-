package com.example.demo.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Product;

@Repository
public class ProductDao {
	
@Autowired
private JdbcTemplate jdbctemplate;
private int update;

public Product saveProduct(Product p) {
	String qry="insert into product(product_id,name,prize,descrip,stock) values(?,?,?,?,?)";
	int a=jdbctemplate.update(qry,
			p.getProductId()
			,p.getProductName()
			,p.getProductPrize(),
			p.getProductDesc(),
			p.isStock());
	System.out.println("Row inserted"+a);
	return p;
}

	public Product getProductById(int product_id) {
		String qry="select * from product where product_id=?";
		Product product=jdbctemplate.queryForObject(qry,new RowMapper<Product>() {

			@Override
			public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
				Product p=new Product();
				p.setProductId(rs.getInt("product_id"));
				p.setProductName(rs.getString("name"));
				p.setProductPrize(rs.getDouble("prize"));
				p.setProductDesc(rs.getString("descrip"));
				p.setStock(rs.getBoolean("stock"));
				return p;
			}
			
		},product_id);
		
		return product;
	}
	
	
	public int  deleteById(int pid) {
		
		String qry="DELETE from PRODUCT WHERE product_id=?";
		int a=jdbctemplate.update(qry,pid);
		System.out.println("Delete Row"+a);
		
		return a;
	}
	
	public Product updateById(int pid,Product p){
		
		String qry="UPDATE product set name=?,prize=?,descrip=?,stock=? where product_id=?";
	int a= jdbctemplate.update(qry,p.getProductName(),p.getProductPrize(),p.getProductDesc(),p.isStock(),pid);
		System.out.println("UPDATE Rows"+a);
		return p;
	}
	
	
	
	
	
	
}
