public class MultiThreading {
	public static void main(String[] args){
		Worker t1 = new Worker("daksh-thread-1");
		Worker t2 = new Worker("abhyudaya-thread-1");
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("dono thread chalo ho gye");
	}
}
class Worker extends Thread{
	String name;
	Worker(String name) {
		this.name = name;
	}
	public void run(){
		for(int i=1;i<=3;i++){
			System.out.println(name +": " +i);
			try{
				Thread.sleep(500);
			}catch(InterruptedExecution e){
				e.printStackTrace();
			}
		}
	}
}

 
