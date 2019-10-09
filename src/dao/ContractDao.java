/**
 * 通过合同名字查找合同，并返回其：合同id，经管的员工姓名，客户，描述
 */

package dao;

import org.springframework.stereotype.Repository;

import entity.Contract;
@Repository
public interface ContractDao {
	Contract findContractByContractName(String contract_name);
}
