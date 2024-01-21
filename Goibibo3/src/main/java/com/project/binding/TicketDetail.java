package com.project.binding;


public class TicketDetail {
	
	private Integer ticketID;
	private String pnrNo;
	private String pName;
	private String srcStation;
	private String destStation;
	public Integer getTicketID() {
		return ticketID;
	}
	public void setTicketID(Integer ticketID) {
		this.ticketID = ticketID;
	}
	public String getPnrNo() {
		return pnrNo;
	}
	public void setPnrNo(String pnrNo) {
		this.pnrNo = pnrNo;
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
		return "TicketDetail [ticketID=" + ticketID + ", pnrNo=" + pnrNo + ", pName=" + pName + ", srcStation="
				+ srcStation + ", destStation=" + destStation + "]";
	}
	
	
	
	
}
