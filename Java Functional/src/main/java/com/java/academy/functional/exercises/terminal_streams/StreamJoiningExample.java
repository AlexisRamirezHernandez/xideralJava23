package com.java.academy.functional.exercises.terminal_streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.java.academy.functional.exercises.repo.Person;
import com.java.academy.functional.exercises.repo.PersonRepository;

public class StreamJoiningExample {
	
	static String joiningExample() {
		String s = PersonRepository.getAllPersons()
				.stream()
				.map(Person :: getName)
				//.collect(Collectors.joining());
				//.collect(Collectors.joining("-"));
				.collect(Collectors.joining("-","[","]"));
		return s;
	}

	public static void main(String[] args) {
		char[] ch = {'a','b','c','d','e'};
		String join = Stream.of(ch).map(arr -> new String(arr)).collect(Collectors.joining("-","[","]"));
		//System.out.println("Joined Data :"+join);
		System.out.println("Joining Output :"+joiningExample());
	}

}