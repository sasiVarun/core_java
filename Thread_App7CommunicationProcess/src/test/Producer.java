package test;

public class Producer implements Runnable {
	public StringBuffer sb;
	public Producer() {
		this.sb=new StringBuffer();
	}
	@Override
	public void run() {
		synchronized(sb) {
			for(int i=1;i<6;i++) {
				sb.append(i+":");//Adding to data buffer
				System.out.println("Producer adding data to buffer");
				try {
					Thread.sleep(2000);
				}catch(InterruptedException ie) {
					ie.printStackTrace();
				}
			}// end of loop
			sb.notify();//Unlock buffer & send message to Consumer			
		}//end of lock
	}
}
