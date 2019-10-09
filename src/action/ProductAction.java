package action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import entity.Product;
import service.ProductService;
@Controller
public class ProductAction {

	@Autowired
	private ProductService proService;
	
	@RequestMapping(value="/product", method=RequestMethod.POST)
	public String product(@RequestParam("product_name") String product_name,
			ModelMap model) {
		
		if(proService.isProductExist(product_name)) {
			model.addAttribute("msg", "产品不存在");
			return "error";
		}else {
			Product pro = proService.returnProduct(product_name);
			model.addAttribute("product_id", 1);
			model.addAttribute("product_name", "产品1");
			model.addAttribute("product_desc", "这是产品1");
			return "product";
		}
	}
}
