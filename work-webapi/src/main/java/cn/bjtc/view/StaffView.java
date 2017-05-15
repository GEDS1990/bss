package cn.bjtc.view;

import cn.bjtc.api.BaseDictType;
import cn.bjtc.common.ApplicationDataManager;

public class StaffView extends Pagination {

	private Integer staffid;
	private String staffname;
	private Integer gender;
	private Long mobile;
	private String idcard;
	private String telephone;
	private String email;
	private Integer edu;
	private Integer jobstation;
	private String passwd;
	private String address;
	private Integer departid;
	private String emername;
	private Integer emerphone;
	private Integer staffst;
	private Integer leavetime;
	private Integer jointime;
	private Integer creator;
	private String departname;
	public Integer getStaffid() {
		return staffid;
	}
	public void setStaffid(Integer staffid) {
		this.staffid = staffid;
	}
	public String getStaffname() {
		return staffname;
	}
	public void setStaffname(String staffname) {
		this.staffname = staffname;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getEdu() {
		return edu;
	}
	public void setEdu(Integer edu) {
		this.edu = edu;
	}
	public Integer getJobstation() {
		return jobstation;
	}
	public void setJobstation(Integer jobstation) {
		this.jobstation = jobstation;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getDepartid() {
		return departid;
	}
	public void setDepartid(Integer departid) {
		this.departid = departid;
	}
	public String getEmername() {
		return emername;
	}
	public void setEmername(String emername) {
		this.emername = emername;
	}
	public Integer getEmerphone() {
		return emerphone;
	}
	public void setEmerphone(Integer emerphone) {
		this.emerphone = emerphone;
	}
	public Integer getStaffst() {
		return staffst;
	}
	public void setStaffst(Integer staffst) {
		this.staffst = staffst;
	}
	public Integer getLeavetime() {
		return leavetime;
	}
	public void setLeavetime(Integer leavetime) {
		this.leavetime = leavetime;
	}
	public Integer getJointime() {
		return jointime;
	}
	public void setJointime(Integer jointime) {
		this.jointime = jointime;
	}
	public Integer getCreator() {
		return creator;
	}
	public void setCreator(Integer creator) {
		this.creator = creator;
	}
	public String getGenderStr() {
		return ApplicationDataManager.getDictValueByTypeValue(BaseDictType.DICT_GENDER.toString(), String.valueOf(gender));
	}
	public String getStaffStr() {
		return ApplicationDataManager.getDictValueByTypeValue(BaseDictType.DICT_STAFFST.toString(), String.valueOf(staffst));
	}
	public String getEduStr() {
		return ApplicationDataManager.getDictValueByTypeValue(BaseDictType.DICT_EDU.toString(), String.valueOf(edu));
	}
	public String getDepartname() {
		return departname;
	}
	public void setDepartname(String departname) {
		this.departname = departname;
	}
}
