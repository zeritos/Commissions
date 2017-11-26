package org.app;

public class RateFile {
	
	private String prod;
	private String type;
	private String cover;
	private String startDate;
	private String endDate;
	private String rate;
	
	public RateFile (RateFile otro) {
		this(otro.prod, otro.type, otro.cover, otro.startDate, otro.endDate, otro.rate);
	}
	
	public String getProd() {
		return prod;
	}
	public void setProd(String prod) {
		this.prod = prod;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCover() {
		return cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}
	public String getStartDate() {
		return startDate;
	}
	public RateFile(String prod, String type, String cover, String startDate, String endDate, String rate) {
		super();
		this.prod = prod;
		this.type = type;
		this.cover = cover;
		this.startDate = startDate;
		this.endDate = endDate;
		this.rate = rate;
	}
	
	public RateFile() {
		
	}
	
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "RateFile [prod=" + prod + ", type=" + type + ", cover=" + cover + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", rate=" + rate + "]";
	}
	
	

}
