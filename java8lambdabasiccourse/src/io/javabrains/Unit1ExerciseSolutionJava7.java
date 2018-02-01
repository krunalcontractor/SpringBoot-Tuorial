package io.javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionJava7 {

public static void main(String[] args) {
		
		List<Person> people =Arrays.asList(
				new Person("Krunal" , "Contractor" , 40),
				new Person("Shubhechha" , "Contractor" , 35),
				new Person("Aarav" , "Contractor" , 12),
				new Person("Aarsh" , "Contractor" , 6)
				);
		// step1 sort list by last name
		Comparator<Person> cc = new Comparator<Person>() {
			public int compare(Person o1, Person o2) {
	            return (o1.getFirstName()).compareTo((o2.getFirstName()));
			}
		};
		java.util.Collections.sort(people ,cc);
	//	System.out.println(people.toString());
		
		
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
	            return (o1.getFirstName()).compareTo((o2.getFirstName()));
			}
		});
		
		// Step2 : Create a method that prints all elements in the list
		printAll(people);
		
		// STep3  : create a method that print all people that have First name beginning with A
		
		printLastNameBeginningWithC(people);
		

	}

	private static void printLastNameBeginningWithC(List<Person> people) {
		for (Person person : people) {
			if(person.getFirstName().startsWith("A"))		System.out.println(person);
		}	
	}

	private static void printAll(List<Person> people) {

		for (Person person : people) {
			System.out.println(person);
		}
	}

}
