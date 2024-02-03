package busreservation;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {

	public static void main(String[] args) throws ParseException, SQLException {
             
BusDAO busdao=new BusDAO();
	busdao.displayBusInfo();	
			
		  int useropt =1;
		  Scanner  scanner =new Scanner(System.in);
		  
          while(useropt==1)   {  
		System.out.println("Enter 1 to booking 2 to Exit");
		  useropt= scanner.nextInt();
		 if(useropt==1) {
			  Booking booking =new Booking();
			  
			  if(booking.isAvailable()) {
				  BookingDAO bookingdao=new BookingDAO();
				  bookingdao.addBooking(booking);
				  System.out.println("Your Booking is cofirmed...");
			  }else {
				  System.out.println("Sorry Bus is Full ! try another date or another bus");
			  }
		 }
	}
	}
}
