package cn.bjtc.view;

import cn.bjtc.api.BaseDictType;
import cn.bjtc.common.ApplicationDataManager;

public class ChannelView extends Pagination {
	private Integer chanid;
	private String channame;
	private Integer chantype;
	private Long mobile;
	private String contact;
	private Integer province;
	private Integer city;
	private Integer district;
	private Integer town;
	private Integer village;
	private String address;
	private Integer parentid;
	private Integer chanst;
	
	public Integer getChanid() {
		return chanid;
	}
	public void setChanid(Integer chanid) {
		this.chanid = chanid;
	}
	public String getChanname() {
		return channame;
	}
	public void setChanname(String channame) {
		this.channame = channame;
	}
	public Integer getChantype() {
		return chantype;
	}
	public void setChantype(Integer chantype) {
		this.chantype = chantype;
	}
	public String getChantypeStr() {
		return ApplicationDataManager.getDictValueByTypeValue(BaseDictType.DICT_CHANTYPE.toString(),String.valueOf(chantype));
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public Integer getProvince() {
		return province;
	}
	public void setProvince(Integer province) {
		this.province = province;
	}
	public Integer getCity() {
		return city;
	}
	public void setCity(Integer city) {
		this.city = city;
	}
	public Integer getDistrict() {
		return district;
	}
	public void setDistrict(Integer district) {
		this.district = district;
	}
	public Integer getTown() {
		return town;
	}
	public void setTown(Integer town) {
		this.town = town;
	}
	public Integer getVillage() {
		return village;
	}
	public void setVillage(Integer village) {
		this.village = village;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getParentid() {
		return parentid;
	}
	public void setParentid(Integer parentid) {
		this.parentid = parentid;
	}
	public Integer getChanst() {
		return chanst;
	}
	public void setChanst(Integer chanst) {
		this.chanst = chanst;
	}
	public String getChanstStr() {
		return ApplicationDataManager.getDictValueByTypeValue(BaseDictType.DICT_CHANST.toString(),String.valueOf(chanst));
	}
}
