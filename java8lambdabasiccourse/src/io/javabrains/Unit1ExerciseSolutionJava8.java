package io.javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionJava8 {

public static void main(String[] args) {
		
		List<Person> people =Arrays.asList(
				new Person("Krunal" , "Contractor" , 40),
				new Person("Shubhechha" , "Contractor" , 35),
				new Person("Aarav" , "Contractor" , 12),
				new Person("Aarsh" , "Contractor" , 6)
				);
		// step1 sort list by last name

		java.util.Collections.sort(people ,(p1,p2) ->p1.getFirstName().compareTo(p2.getFirstName()));
		
		// Step2 : Create a method that prints all elements in the list
		printConditionally(people,p-> true);
		
		// STep3  : create a method that print all people that have First name beginning with A
		printConditionally(people ,p -> p.getFirstName().startsWith("K"));
		printConditionally(people ,p->p.getFirstName().startsWith("A"));
	}


	private static void printConditionally(List<Person> people, ConditionObj condition) {
		for (Person person : people) {
			if(condition.test(person))		System.out.println(person);
		}
	}
}
