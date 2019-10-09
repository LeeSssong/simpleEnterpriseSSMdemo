/*
 * 通过员工名字查找员工信息
 */
package dao;
import org.springframework.stereotype.Repository;

import entity.Staff;

@Repository
public interface StaffDao {
	public Staff findStaffByStaffName(String staffname);
}
