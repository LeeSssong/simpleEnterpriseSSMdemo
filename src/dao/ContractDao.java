/**
 * ͨ����ͬ���ֲ��Һ�ͬ���������䣺��ͬid�����ܵ�Ա���������ͻ�������
 */

package dao;

import org.springframework.stereotype.Repository;

import entity.Contract;
@Repository
public interface ContractDao {
	Contract findContractByContractName(String contract_name);
}
