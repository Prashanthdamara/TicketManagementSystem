package com.project.binding;


public class PassengerInfo {
	
	private Integer pId;
	private String pName;
	private String srcStation;
	private String destStation;
	public Integer getpId() {
		return pId;
	}
	public void setpId(Integer pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getSrcStation() {
		return srcStation;
	}
	public void setSrcStation(String srcStation) {
		this.srcStation = srcStation;
	}
	public String getDestStation() {
		return destStation;
	}
	public void setDestStation(String destStation) {
		this.destStation = destStation;
	}
	@Override
	public String toString() {
		return "PassengerInfo [pId=" + pId + ", pName=" + pName + ", srcStation=" + srcStation + ", destStation="
				+ destStation + "]";
	}
	
	
	
	
	
	

}
