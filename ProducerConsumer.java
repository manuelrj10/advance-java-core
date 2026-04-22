package threadex;

class HotelException extends Exception {
    public HotelException(String message) {
        super(message);
    }
}

class Store {
    private boolean orderPlaced = false;

    synchronized void produce() throws InterruptedException {
        while (!orderPlaced) {
            wait();
        }
        System.out.println("order rEADY");
        orderPlaced = false;
    }

    synchronized void order() {
        System.out.println("order recieved");
        orderPlaced = true;
        notify();
    }
}

class Consumer extends Thread {
    Store s;
    Consumer(Store s) {
        this.s = s;
    }
    public void run() {
        s.order();
    }
}

class Producer extends Thread {
    Store s;
    Producer(Store s) {
        this.s = s;
    }
    public void run() {
        try {
            s.produce();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        Store s = new Store();
        Consumer c = new Consumer(s);
        Producer p = new Producer(s);
        p.start();
        c.start();
    }
}