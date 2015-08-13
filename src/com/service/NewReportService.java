package com.service;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.pojo.NewReportView;

@ManagedBean
@ViewScoped
public class NewReportService {
	private final static String[] com_modity;
	private final static String[] part_number;
	private final static String[] part_desc;
	private final static String[] eol_npi_reg;
	
	private final static String[] m_0;
	private final static String[] orig;
	
	static{
		com_modity=new String[5];
		com_modity[0]="MEMORY";
		com_modity[1]="MEMORY";
		com_modity[2]="MEMORY";
		com_modity[3]="MEMORY";
		com_modity[4]="MEMORY";
		
		part_number=new String[5];
		part_number[0]="XXXXXX12";
		part_number[1]="XXXXXX14";
		part_number[2]="XXXXXX17";
		part_number[3]="XXXXXX13";
		part_number[4]="XXXXXX15";
		
		part_desc=new String[5];
		part_desc[0]="EOL";
		part_desc[1]="REG";
		part_desc[2]="NPI";
		part_desc[3]="REG";
		part_desc[4]="NPI";
		
		eol_npi_reg=new String[5];
		eol_npi_reg[0]="EDL";
		eol_npi_reg[1]="REG";
		eol_npi_reg[2]="NPI";
		eol_npi_reg[3]="REG";
		eol_npi_reg[4]="EDL";
		
		m_0=new String[5];
		m_0[0]="1";
		m_0[1]="3";
		m_0[2]="4";
		m_0[3]="6";
		m_0[4]="5";
		
		orig=new String[5];
		orig[0]="XXX";
		orig[1]="XXX";
		orig[2]="XXX";
		orig[3]="XXX";
		orig[4]="XXX";
	}
	
	private List<NewReportView> list;
	public List<NewReportView> crateList(int size){
		System.out.println("in list");
		list=new ArrayList<NewReportView>();
		for(int i=0;i<size;i++){
			list.add(new NewReportView(getComModity(), getPartNumber(), getPartDesc(), getEolNpiReg(), getM0(), getOrig()));
		}
		return list;
	}
	public  String getComModity() {
		return com_modity[(int) (Math.random() * 4)];
	}
	public  String getPartNumber() {
		return part_number[(int) (Math.random() * 4)];
	}
	public  String getPartDesc() {
		return part_desc[(int) (Math.random() * 4)];
	}
	public  String getEolNpiReg() {
		return eol_npi_reg[(int) (Math.random() * 4)];
	}
	public  String getM0() {
		return m_0[(int) (Math.random() * 4)];
	}
	public  String getOrig() {
		return orig[(int) (Math.random() * 4)];
	}
	
	/*public static void main(String[] args) {
		NewReportService n=new NewReportService();
		for(int i=0;i<10;i++)
		System.out.println(n.getComModity()+"\t"+ n.getPartNumber()+"\t"+ n.getPartDesc()+"\t"+ n.getEolNpiReg()+"\t"+ n.getM0()+"\t"+ n.getOrig());
	}*/
	
}
