/**
 * ͨ�����������û�
 * ��ӹ�����Ա
 */

package dao;

import org.springframework.stereotype.Repository;

import entity.LoginRegister;

@Repository
public interface LoginRegisterDao {
	public LoginRegister findUsersByUsername(String manager_name);
	
	public int addUser(LoginRegister manager);
}
