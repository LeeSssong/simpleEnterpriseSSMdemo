/**
 * ͨ���ͻ��������ҿͻ�
 */
package dao;

import org.springframework.stereotype.Repository;
import entity.Customer;

@Repository
public interface CustomerDao {
	public Customer findCustomerByCustomerName(String customer_name);
}
