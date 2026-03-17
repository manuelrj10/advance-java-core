package threadex;


class ThreadDemo11 extends Thread {
    public void run() {
    	System.out.println("hi");
    }
}

class ThreadDemo123 extends Thread {
    public void run() {
        
          System.out.println("hello");
    }
}
class ThreadDemo114 extends Thread {
    public void run() {
    	System.out.println("manuel");
    }
}



public class demoPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo11 t1=new ThreadDemo11();
		ThreadDemo123 t2=new ThreadDemo123();
		ThreadDemo114 t3=new ThreadDemo114();
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.setPriority(5);
		t2.setPriority(10);
		t3.setPriority(1);
		
		
	

	}

}
