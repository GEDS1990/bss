package cn.bjtc.view;

public class StockDetView extends Pagination {
	private Integer stockdetid;
	private String warehouse;
	private String position;
	private String batchno;
	private Long indt;
	private Long expirydt;
	private Integer stocknum;
	private Integer stockid;
	
	public Integer getStockdetid() {
		return stockdetid;
	}
	public void setStockdetid(Integer stockdetid) {
		this.stockdetid = stockdetid;
	}
	public String getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getBatchno() {
		return batchno;
	}
	public void setBatchno(String batchno) {
		this.batchno = batchno;
	}
	public Long getIndt() {
		return indt;
	}
	public void setIndt(Long indt) {
		this.indt = indt;
	}
	public Long getExpirydt() {
		return expirydt;
	}
	public void setExpirydt(Long expirydt) {
		this.expirydt = expirydt;
	}
	public Integer getStocknum() {
		return stocknum;
	}
	public void setStocknum(Integer stocknum) {
		this.stocknum = stocknum;
	}
	public Integer getStockid() {
		return stockid;
	}
	public void setStockid(Integer stockid) {
		this.stockid = stockid;
	}
}
