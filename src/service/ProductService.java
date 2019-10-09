package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dao.ProductDao;
import entity.Product;
@Service
public class ProductService {

	@Autowired
	private ProductDao productDao;
	
	//判断产品是否存在
	public boolean isProductExist(String product_name) {
		if( productDao.findProductByProductName(product_name) == null) {
			return false;
		}else{
			return true;
		}
	}
	
	public Product returnProduct(String product_name) {
		return productDao.findProductByProductName(product_name);
	}
}
