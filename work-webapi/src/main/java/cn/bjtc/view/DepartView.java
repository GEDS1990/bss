package cn.bjtc.view;

import cn.bjtc.api.BaseDictType;
import cn.bjtc.common.ApplicationDataManager;

public class DepartView extends Pagination {
	private Integer departid;
	private String departname;
	private Integer leader;
	private Integer parentid;
	private String address;
	private String telephone;
	private Integer departst;
	public Integer getDepartid() {
		return departid;
	}
	public void setDepartid(Integer departid) {
		this.departid = departid;
	}
	public String getDepartname() {
		return departname;
	}
	public void setDepartname(String departname) {
		this.departname = departname;
	}
	public Integer getLeader() {
		return leader;
	}
	public void setLeader(Integer leader) {
		this.leader = leader;
	}
	public Integer getParentid() {
		return parentid;
	}
	public void setParentid(Integer parentid) {
		this.parentid = parentid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Integer getDepartst() {
		return departst;
	}
	public void setDepartst(Integer departst) {
		this.departst = departst;
	}
	public String getDepartStr() {
		return ApplicationDataManager.getDictValueByTypeValue(BaseDictType.DICT_DEPARTST.toString(), String.valueOf(departst));
	}
}
