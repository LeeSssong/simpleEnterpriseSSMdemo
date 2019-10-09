/**
 * 通过姓名查找用户
 * 添加管理人员
 */

package dao;

import org.springframework.stereotype.Repository;

import entity.LoginRegister;

@Repository
public interface LoginRegisterDao {
	public LoginRegister findUsersByUsername(String manager_name);
	
	public int addUser(LoginRegister manager);
}
