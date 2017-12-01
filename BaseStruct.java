package org.application;

public class BaseStruct {

	private String product;
	private String year;
	private String tipCover;
	private String level;
	private String codCover;
	private String startDate;
	private String endDate;
	private String channel;
	private String rate;
	private String table;
	
	@Override
	public String toString() {
		return "BaseStruct [product=" + product + ", year=" + year + ", tipCover=" + tipCover + ", level=" + level
				+ ", codCover=" + codCover + ", startDate=" + startDate + ", endDate=" + endDate + ", channel="
				+ channel + ", rate=" + rate + ", table=" + table + "]";
	}
	
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	
	public BaseStruct (BaseStruct otro) {
		this(otro.product, otro.year, otro.tipCover, otro.level, otro.codCover, otro.startDate, otro.endDate, 
			otro.channel, otro.rate, otro.table);
	}
	
	
	public BaseStruct(String product, String year, String tipCover, String level, String codCover, 
					  String startDate, String endDate, String channel, String rate, String table) {
			
		this.product = product;
		this.year = year;
		this.tipCover = tipCover;
		this.level = level;
		this.codCover = codCover;
		this.startDate = startDate;
		this.endDate = endDate;
		this.channel = channel;
		this.rate = rate;
		this.table = table;
	}

	public String escribeSalida () {
		return product + ";" + year + ";" + tipCover + ";" + level
				+ ";" + codCover + ";" + startDate + ";" + endDate + ";"
				+ channel + ";" + rate + ";" + table;
	}
	
	
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getTipCover() {
		return tipCover;
	}
	public void setTipCover(String tipCover) {
		this.tipCover = tipCover;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getCodCover() {
		return codCover;
	}
	public void setCodCover(String codCover) {
		this.codCover = codCover;
	}
	public String getStartDate() {
		return startDate;
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
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getTable() {
		return table;
	}
	public void setTable(String table) {
		this.table = table;
	}
	
	
	
	
	
}
