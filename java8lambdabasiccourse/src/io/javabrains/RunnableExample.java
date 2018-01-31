package io.javabrains;

public class RunnableExample {

	public static void main(String[] args) {
		
		Thread myThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Printed inside runnable");
			}
		});
		
		myThread.run();
		
		Thread myLambdThread = new Thread( ()-> System.out.println("Printed inside lambda runnable"));
		myLambdThread.run();
	}

}
