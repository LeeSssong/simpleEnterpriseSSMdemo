package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dao.CustomerDao;
import entity.Customer;
@Service
public class CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	public boolean isCustomerExist(String customer_name) {
		if( customerDao.findCustomerByCustomerName(customer_name) == null ) {
			return false;
		}else{
			return true;
		}
	}
	
	public Customer returnCustomer(String customer_name) {
		return customerDao.findCustomerByCustomerName(customer_name);
	}
}
