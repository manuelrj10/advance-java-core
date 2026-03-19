package threadex;

public class Mtable {
	synchronized void  mutliplaictionTable(int n) {
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
