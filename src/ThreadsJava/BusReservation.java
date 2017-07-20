package ThreadsJava;       
//This java file is inside package named ThreadsJava inside src folder.

	
	public class BusReservation
	{
	
		public static void main(String[] args)    
		//main function declaration. and because it is static, program execution starts from main function.
	
		{
			
			ReservationofSeat reserve = new ReservationofSeat();
			//Creating object of Reservation class.
		
			Passenger firstPerson = new Passenger(reserve,3);
			Passenger secondPerson = new Passenger(reserve,7);
			Passenger thirdPerson = new Passenger(reserve,9);
			
			//creating Three threads and passing Runnable implemented class objects and name of Thread in Constructor.
			Thread firstThread = new Thread(firstPerson,"Pragati");
			Thread secondThread = new Thread(secondPerson,"Lalit");
			Thread thirdThread = new Thread(thirdPerson,"Aditya");
			
			firstThread.start();
			secondThread.start();
			thirdThread.start();
		}  
	
	}  