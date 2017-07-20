package ThreadsJava;    
//This java file is inside package named ThreadsJava inside src folder.
	
	public class ReservationofSeat
	{
		static int availableSeats=20;   
		//To store the value of available seats.
		
		
		public synchronized void reserveSeat(int requestedSeats)
		//This is a Synchronized method to reserve seats.
		{

			System.out.println(Thread.currentThread().getName()+" entered");
			System.out.println("Total Available seats : " + availableSeats + " Requested seats : " + requestedSeats);
			
			if(availableSeats >= requestedSeats)
			{
				System.out.println("Seat Available...!!\n Reserve  Your Seat Now :-");
				try
				{
					Thread.sleep(100);  
				}
				catch (InterruptedException e)
				{
				    System.out.println("Thread interrupted");
				}
				
				System.out.println(requestedSeats + " Seats are Reserved by :- "+Thread.currentThread().getName());
			    availableSeats = availableSeats - requestedSeats;    
			  
			    System.out.println(availableSeats+" Seats are still Available");    
			}
			else
			{
				System.out.println("Sorry, Requested seats are not Available :-(");   
			}
			 
			System.out.println("\n\n");
		}
	}    

