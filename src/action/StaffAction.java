package action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import service.StaffService;
import entity.Staff;
@Controller
public class StaffAction {
	
	@Autowired
	private StaffService staffService;
	
	@RequestMapping(value="/staff", method = RequestMethod.POST)
	public String staff(@RequestParam("staff_name") String staff_name,
			ModelMap model) {
		if( staffService.isStaffExist(staff_name) ) {
			model.addAttribute("msg", "员工不存在");
			return "error";
		}else {
			//Staff staff = staffService.returnStaff(staff_name);
			model.addAttribute("staff_id", 1);
			model.addAttribute("staff_name", "员工1");
			return "staff";
		}
		
	}
}
