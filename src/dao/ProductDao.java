/*
 * 通过产品名称查找产品信息
 */
package dao;

import org.springframework.stereotype.Repository;
import entity.Product;
@Repository
public interface ProductDao {
	public Product findProductByProductName(String productname);
}
