package threadex;
class BookingSystem implements Runnable {
    int availableSeats = 1;

    @Override
    public synchronized void run() {
        String name = Thread.currentThread().getName();
        if (availableSeats > 0) {
            System.out.println(name + " is trying to book the seat...");
            
            try { Thread.sleep(500); } catch (InterruptedException e) {}
            
            availableSeats--;
            System.out.println("SUCCESS: Seat booked for " + name);
        } else {
            System.out.println("FAILED: Sorry " + name + ", seat already taken.");
        }
    }

public class Main1 {
    public static void main(String[] args) {
        BookingSystem task = new BookingSystem();
        Thread user1 = new Thread(task, "User-A");
        Thread user2 = new Thread(task, "User-B");

        user1.start();
        user2.start();
    }
}