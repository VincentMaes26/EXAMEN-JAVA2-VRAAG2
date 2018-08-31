package edu.ap.spring;

import java.awt.Point;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;

@Component
public class Exam {
	
	// Maak gebruik van lambdas en streams om een array met alle
	// getallen terug te geven die deelbaar zijn door twee
	// 2 punten
	public int[] getTimesTwo(int[] numbers) {
		List<Integer> nums = new ArrayList<Integer>();
		for(int i : numbers)
			nums.add(i);
		int[] intArray = nums
						 .stream()
						 .filter(i -> i % 2 == 0)
						 .mapToInt(i->i)
						 .toArray();
		return intArray;
	}
	
	// Maak gebruik van lambdas en streams om alle uppercase characters
	// te tellen in de gegeven string
	// 1 punt
	public int countUppercaseCharacters(String sentence) {
		int count = (int) sentence.chars().filter(Character::isUpperCase).count();
		return count;
	}
	
	// Maak gebruik van lambdas en streams om het aantal keren te tellen
	// dat string s voorkomt (zowel uppercase als lowercase) in de lijst names
	// 1 punt
	public int countChar(List<String> names, String s) {
		int count = 0;
		names.stream().forEach(n -> {
			if(n.contains(s)) {
				count++;
			}
			
		});
		return count;
	}
	
	// Maak gebruik van lambdas en streams om het hoogste Y coordinaat
	// te vinden
	// 2 punten
	public int getMaxY(List<Point> points) {
		int highest = 0;
		points.stream()
			  .max(Comparator.comparing(i -> i.getY()))
			  .ifPresent(max -> highest = (int) max.getY());
	}	
}