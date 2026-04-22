package threadex;


class Chef extends Thread{
	Hotel h;
	Chef(Hotel h){
		this.h=h;
	}
	public void run() {
		h.cook();
	}
	
	
}
class Customer5 extends Thread{
	Hotel h;
	Customer5(Hotel h){
		this.h=h;
	}
	public void run() {
		h.placeorder();
	}
	
}
class Waiter extends Thread{
	Hotel h;
	Waiter(Hotel h){
		this.h=h;
	}
	public void run() {
		h.delieverorder();
	}
	
}

class Hotel{
	private String dish;
	private boolean order=false;
	private boolean ready=false;
	Hotel(String dish){
		this.dish=dish;
	}
	synchronized void placeorder() {
		order=true;
		System.out.println("order for"+dish+"has been placed");
		notifyAll();
		
	}
	synchronized void cook() {
	    while(!order) {
	        try {
	            System.out.println("Chef: Waiting for an order...");
	            wait();
	        } catch(InterruptedException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	    System.out.println("Chef: Cooking " + dish + "...");
	    ready = true;
	    notifyAll(); // Tells the waiter the food is ready
	}
	synchronized void delieverorder() {
		while(!ready) {
			try {
			System.out.println("waiting for the chef to complete"+dish);
			wait();
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		}
		System.out.println("Waiter: Delivering " + dish + " to the table!");
			
	}
}


public class Customer1 {

	public static void main(String[] args) {
	    Hotel h = new Hotel("pizza");
	    Customer5 c = new Customer5(h); // Ensure this is lowercase 'c'
	    Chef cf = new Chef(h);        // Ensure this is lowercase 'c'
	    Waiter w = new Waiter(h);     // Ensure this is lowercase 'w'
	    
	    c.start();
	    cf.start();
	    w.start();
	}
}
