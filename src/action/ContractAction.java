package action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import service.ContractService;
import entity.Contract;
@Controller
public class ContractAction {

	@Autowired
	private ContractService contractService;
	
	@RequestMapping(value="/contract", method=RequestMethod.POST)
	public String contract(@RequestParam("contract_name") String contract_name,
			ModelMap model) {
		if(contractService.isContractExist(contract_name)) {
			model.addAttribute("msg", "合同不存在");
			return "error";
		}else {
			//Contract con = contractService.returnContract(contract_name);
			model.addAttribute("contract_id",  1);
			model.addAttribute("contract_name", "合同1");
			model.addAttribute("contract_desc", "这是合同1");
			return "contract";
		}
	}
	
}
