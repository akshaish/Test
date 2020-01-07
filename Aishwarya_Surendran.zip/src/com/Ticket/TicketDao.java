package com.Ticket;

import java.sql.Date;

public class TicketDao {
	int id;
	String name;
	Date showDate;
	String showTime;
	String status;
	
	
	public TicketDao(int id, String name, Date d1, String showTime,String status) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name =name ;
		this.showDate = d1;
		this.showTime = showTime;
		this.status = status;
	}
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getShowDate() {
		return showDate;
	}


	public void setShowDate(Date showDate) {
		this.showDate = showDate;
	}


	public String getShowTime() {
		return showTime;
	}


	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "TicketDao [id=" + id + ", name=" + name + ", showDate=" + showDate + ", status=" + status + "]";
	}
	

}
