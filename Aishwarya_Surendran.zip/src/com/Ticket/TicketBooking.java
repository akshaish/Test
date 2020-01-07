package com.Ticket;

import java.sql.Array;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

public class TicketBooking {

	private static Date d1;

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		SimpleDateFormat df = new SimpleDateFormat("MM-dd-yyyy");
		 d1 = (Date) df.parse("12-10-2011");
		TicketDao td1 =new TicketDao(1,"aishu",d1,"12:30","available");
		//TicketDao td2 =new TicketDao(2,"dil",31/12/1998,12:46,"available");
		System.out.println(td1);
		
	
		
		
		
		

	}

}
