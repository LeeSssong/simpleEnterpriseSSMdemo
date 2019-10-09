package entity;

public class Contract {
	
	private Integer contract_id;
	private String contract_name;
	private String contract_desc;
	
	public Integer getContract_id() {
		return contract_id;
	}
	public void setContract_id(Integer contract_id) {
		this.contract_id = contract_id;
	}
	public String getContract_name() {
		return contract_name;
	}
	public void setContract_name(String contract_name) {
		this.contract_name = contract_name;
	}
	
	public String getContract_desc() {
		return contract_desc;
	}
	public void setContract_desc(String contract_desc) {
		this.contract_desc = contract_desc;
	}
	
}
