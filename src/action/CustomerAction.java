package action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import service.CustomerService;
import entity.Customer;
@Controller
public class CustomerAction {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value="/customer", method=RequestMethod.POST)
	public String customer(@RequestParam("customer_name") String customer_name,
		Model model) {
		if(customerService.isCustomerExist(customer_name)) {
			model.addAttribute("msg", "用户不存在");
			return "error";
		}
		else {
			Customer cust = customerService.returnCustomer(customer_name);
			model.addAttribute("customer_id", 1);
			model.addAttribute("customer_name", "客户1");
			return "customer";
		}
	}
	
	
	
}
