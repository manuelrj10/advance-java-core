package threadex;

class ThreadDemox extends Thread {
    public void run() {
        while (true) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("luminar");
        }
    }
}

class ThreadDemoy extends Thread {
    public void run() {
        while (true) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("kochi");
        }
    }
}

public class ThreadDemo2 {
    public static void main(String[] args) {
        ThreadDemox th = new ThreadDemox();
        ThreadDemoy ty = new ThreadDemoy();
        
        th.start();
        ty.start();
    }
}