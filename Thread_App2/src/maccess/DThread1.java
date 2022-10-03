package maccess;
public class DThread1 {

	public static void main(String[] args) {
//		Runnable ob1 = () ->
//		{
//				for(int i=1;i<=5;i++) {
//					System.out.println("Task_One:"+i);
//					try {
//						Thread.sleep(2000);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//				}//end of loop
//		};
//		Runnable ob2 = ()->
//		{
//				for(int i=101;i<=105;i++) {
//					System.out.println("Task_two:"+i);
//					try {
//						Thread.sleep(2000);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//				}//end of loop
//		};
//		
//		Thread t1 = new Thread(ob1);
//		Thread t2 = new Thread(ob2);

		//		In place of ob1, ob2 sending LambdaExpression as parameter in Thread
		Thread t1 = new Thread(() ->
		{
			for(int i=1;i<=5;i++) {
				System.out.println("Task_One:"+i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}//end of loop
	});
		Thread t2 = new Thread(()->
		{
			for(int i=101;i<=105;i++) {
				System.out.println("Task_two:"+i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}//end of loop
	});
		
		t1.start();
		t2.start();
	}

}
