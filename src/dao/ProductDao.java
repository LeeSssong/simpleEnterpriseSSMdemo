/*
 * ͨ����Ʒ���Ʋ��Ҳ�Ʒ��Ϣ
 */
package dao;

import org.springframework.stereotype.Repository;
import entity.Product;
@Repository
public interface ProductDao {
	public Product findProductByProductName(String productname);
}
