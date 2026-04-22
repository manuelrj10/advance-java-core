class MyTask implements Runnable{
	public void run(){
		int count=0;
		for(int i=0;i<5;i++){
			count++;
			System.out.println(Thread.currentThread().getName() + " : " + count);
		}
	}
}
class Mtable{
	public static void main(String[] args){
		MyTask tsk=new MyTask();
		Thread t1=new Thread(tsk);
		Thread t2=new Thread(tsk);

		t1.start();
		t2.start();

	}
}