/*
 * ͨ��Ա�����ֲ���Ա����Ϣ
 */
package dao;
import org.springframework.stereotype.Repository;

import entity.Staff;

@Repository
public interface StaffDao {
	public Staff findStaffByStaffName(String staffname);
}
