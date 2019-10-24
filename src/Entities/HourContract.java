package Entities;

import java.util.Date;

public class HourContract {

	private Date date;
	private Double valuePerHour;
	private Integer hour;
	
	public HourContract(Date date, Double valePerHour, Integer hour) {
		
		this.date = date;
		this.valuePerHour = valePerHour;
		this.hour = hour;
		
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValePerHour() {
		return valuePerHour;
	}

	public void setValePerHour(Double valePerHour) {
		this.valuePerHour = valePerHour;
	}

	public Integer getHour() {
		return hour;
	}

	public void setHour(Integer hour) {
		this.hour = hour;
	}
	public double totalValue() {
		return valuePerHour * hour;
	}
	
}
