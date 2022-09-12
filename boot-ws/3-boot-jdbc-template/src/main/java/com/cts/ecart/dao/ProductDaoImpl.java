package com.cts.ecart.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cts.ecart.entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	@Autowired
	private JdbcTemplate jt;

	@Override
	public Product save(Product product) {
		jt.update("insert into product values(?,?,?,?)",product.getId(),product.getName(),product.getPrice(),product.getDescription());
		return product;
	}

	@Override
	public Product findById(int id) {
		System.out.println(">>> ProductDaoImpl::findById");
		
		return jt.queryForObject(
                "select * from product where id=?",(rs, rowNum) ->
                           new Product(
                                rs.getInt("id"),
                                rs.getString("name"),
                                rs.getDouble("price"),
                                rs.getString("description")
                               ),id);
		}

	@Override
	public List<Product> findAll() {
		
		return jt.query(
                "select * from product",
                (rs, rowNum) ->
                        new Product(
                                rs.getInt("id"),
                                rs.getString("name"),
                                rs.getDouble("price"),
                                rs.getString("description")
                        )
        );

	}

}
