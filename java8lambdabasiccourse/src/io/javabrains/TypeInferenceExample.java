package io.javabrains;

public class TypeInferenceExample {

	public static void main(String[] args) {
		StringLengthLambda myLambda =  s -> s.length();
		System.out.println(myLambda.getLength("Hello Krunal"));
		
		printLambda(s -> s.length());
		
	}
	
	public static void printLambda(StringLengthLambda l) {
		System.out.println(l.getLength("Hello MEthod"));
	}
	interface StringLengthLambda{
		
		int getLength(String s);
		
	}

}
