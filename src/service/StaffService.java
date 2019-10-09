package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.StaffDao;
import entity.Staff;
@Service
public class StaffService {

	@Autowired
	private StaffDao staffDao;
	
	public boolean isStaffExist(String staff_name) {
		if( staffDao.findStaffByStaffName(staff_name) == null ) {
			return false;
		}else {
		return true;
		}
	}
	
	public Staff returnStaff(String staff_name) {
		return staffDao.findStaffByStaffName(staff_name);
	}
}

