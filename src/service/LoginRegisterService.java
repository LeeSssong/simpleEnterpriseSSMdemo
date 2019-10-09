package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dao.LoginRegisterDao;
import entity.LoginRegister;
@Service
public class LoginRegisterService{
	
	@Autowired
	private LoginRegisterDao lrDao;
	
	//查找经理是否已存在
	public boolean isMangerExist(String manager_name) {
		if(lrDao.findUsersByUsername(manager_name) == null )
		{
			return false;
		}else {
			return true;
		}
	}
	
	//根据名称返回密码
	public String getPasswordByManagername(String manager_name) {
		String manager_password = "1234";//...
		return manager_password;
	}
	
	//注册
	public void addManager(String manager_name, String manager_password) {
		LoginRegister lr = new LoginRegister();
		lr.setManager_name(manager_name);
		lr.setManager_password(manager_password);
		lrDao.addUser(lr);
	}
	
}