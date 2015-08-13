package com.pojo;

public class NewReportView {
	//private int id;
	private String com_modity;
	private String part_number;
	private String part_desc;
	private String eol_npi_reg;
	
	private String m_0;
	private String orig;
	
	public NewReportView( String com_modity, String part_number, String part_desc, String eol_npi_reg,
			String m_0, String orig) {
		
		this.com_modity = com_modity;
		this.part_number = part_number;
		this.part_desc = part_desc;
		this.eol_npi_reg = eol_npi_reg;
		this.m_0 = m_0;
		this.orig = orig;
	}
	
	
	
	public NewReportView() {
	}



	
	public String getCom_modity() {
		return com_modity;
	}
	public void setCom_modity(String com_modity) {
		this.com_modity = com_modity;
	}
	public String getPart_number() {
		return part_number;
	}
	public void setPart_number(String part_number) {
		this.part_number = part_number;
	}
	public String getPart_desc() {
		return part_desc;
	}
	public void setPart_desc(String part_desc) {
		this.part_desc = part_desc;
	}
	public String getEol_npi_reg() {
		return eol_npi_reg;
	}
	public void setEol_npi_reg(String eol_npi_reg) {
		this.eol_npi_reg = eol_npi_reg;
	}
	public String getM_0() {
		return m_0;
	}
	public void setM_0(String m_0) {
		this.m_0 = m_0;
	}
	public String getOrig() {
		return orig;
	}
	public void setOrig(String orig) {
		this.orig = orig;
	}
	
	
}
