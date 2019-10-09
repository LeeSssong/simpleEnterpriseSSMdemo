package action;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import service.LoginRegisterService;

@Controller
public class LoginRegisterAction {
	
	@Autowired
	private LoginRegisterService lrService;
	
	//处理登陆请求
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestParam("manager_name") String manager_name,
			@RequestParam("manager_password") String manager_password,
			ModelMap model) {
		if(lrService.isMangerExist(manager_name)) {
			model.addAttribute("msg", "用户不存在");
			return "error";
		}else {
			if(manager_password.equals(lrService.getPasswordByManagername(manager_name))) {
				model.addAttribute("msg", "登陆成功");
				return "operation";
			}else {
				model.addAttribute("msg", "密码错误");
				return "error";
			}
		}
	}
	
	//处理注册请求
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(@RequestParam("manager_name") String manager_name,
			@RequestParam("manager_password") String manager_password,
			ModelMap model) {
		if( lrService.isMangerExist(manager_name) ) {
			model.addAttribute("msg", "用户已存在");
			return "error";
		}else {
			lrService.addManager(manager_name, manager_password);
			model.addAttribute("msg", "注册成功");
			return "operation";
		}
	}
	
	
}
