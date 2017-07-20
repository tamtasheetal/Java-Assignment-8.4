package ThreadsJava;    
//This java file is inside package named ThreadsJava inside src folder.
	
	public class Passenger implements Runnable   
	//Declaring class which implements Runnable interface.
	{
		ReservationofSeat reserveTickets;   
		//This will creat a Reference of Reservation class.
		int requestedSeats;     
		//To store the requested number of seats.
	
		public Passenger(ReservationofSeat reserve, int requestedSeats) 
		{	
			
			reserveTickets=reserve;
			//This will Initializ the class variables.
			this.requestedSeats=requestedSeats;
		}
	
		//overriding.
		public void run()
		{
		    reserveTickets.reserveSeat(requestedSeats);
		}
	
	}  
