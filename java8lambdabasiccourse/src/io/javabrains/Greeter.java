package io.javabrains;

public class Greeter {

	public void greet( Greeting greeting) {
		greeting.perform();
	}
	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		Greeting helloWorldGreeting = new HelloWorldGreeting();
		Greeting lambdaGreeting = ()-> System.out.println("Hello World Lambada!");
		
		//lambdaGreeting.perform();
		//helloWorldGreeting.perform();
		//greeter.greet(helloWorldGreeting);
		
		
		
		Greeting innerClassGreeting = new Greeting() {
			@Override
			public void perform() {
					System.out.println("Hello World Inner class!");				
			}
		};
		//innerClassGreeting.perform();
		greeter.greet(innerClassGreeting);
		greeter.greet(lambdaGreeting);
	}

}
//
//interface  MyLambda{
//	void foo();
//}
//interface MyAdd{
//	int add(int x, int y);
//}
