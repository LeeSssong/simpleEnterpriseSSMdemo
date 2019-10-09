package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dao.ContractDao;
import entity.Contract;
@Service
public class ContractService {
	
	@Autowired
	private ContractDao contractDao;
	
	//�жϸú�ͬ�Ƿ����
	public boolean isContractExist(String contract_name) {
		if( contractDao.findContractByContractName(contract_name) == null ) {
			return false;
		}else{
		return true;
		}
	}
	
	//����һ��Contractʵ��
	public Contract returnContract(String contract_name) {
		return contractDao.findContractByContractName(contract_name);
	}
	
}
