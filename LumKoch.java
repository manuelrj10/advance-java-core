package threadex;

class Lum implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("luminar");
            try {
                Thread.sleep(50); // Small pause to let the other thread speak
            } catch (InterruptedException e) { }
        }
    }
}

class Koch implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("kochi");
            try {
                Thread.sleep(50); 
            } catch (InterruptedException e) { }
        }
    }
}

public class LumKoch {
    public static void main(String[] args) {
        new Thread(new Lum()).start();
        new Thread(new Koch()).start();
    }
}