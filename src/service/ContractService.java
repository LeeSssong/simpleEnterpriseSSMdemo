package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dao.ContractDao;
import entity.Contract;
@Service
public class ContractService {
	
	@Autowired
	private ContractDao contractDao;
	
	//判断该合同是否存在
	public boolean isContractExist(String contract_name) {
		if( contractDao.findContractByContractName(contract_name) == null ) {
			return false;
		}else{
		return true;
		}
	}
	
	//返回一个Contract实体
	public Contract returnContract(String contract_name) {
		return contractDao.findContractByContractName(contract_name);
	}
	
}
