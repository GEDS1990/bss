package cn.bjtc.model;

public class Parameters {

	private Integer id;
	private String paramname;
	private String paramdesc;
	private Integer paramtype;
	private Integer paramst;
    private String paramvalue;
	
	
	public String getParamvalue() {
		return paramvalue;
	}
	public void setParamvalue(String paramvalue) {
		this.paramvalue = paramvalue;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getParamname() {
		return paramname;
	}
	public void setParamname(String paramname) {
		this.paramname = paramname;
	}
	public String getParamdesc() {
		return paramdesc;
	}
	public void setParamdesc(String paramdesc) {
		this.paramdesc = paramdesc;
	}
	public Integer getParamtype() {
		return paramtype;
	}
	public void setParamtype(Integer paramtype) {
		this.paramtype = paramtype;
	}
	public Integer getParamst() {
		return paramst;
	}
	public void setParamst(Integer paramst) {
		this.paramst = paramst;
	}
}
