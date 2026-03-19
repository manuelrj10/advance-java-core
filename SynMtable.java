package threadex;

public class Mtable {
	 void  mutliplaictionTable(int n) {
		synchronized(this) {
		for(int i=0;i<=10;i++) {
			System.out.println(i+"*"+n+"="+n*i);
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	 }
}
