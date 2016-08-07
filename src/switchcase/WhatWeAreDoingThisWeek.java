package switchcase;

import java.util.Scanner;

public class WhatWeAreDoingThisWeek {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		WeekDay day = new WeekDay();
		System.out.println("Enter your day: ");
		String dayGiven = sc.nextLine();
		String whatToDo = day.getWeekDay(dayGiven);
		System.out.println(whatToDo);

	}


}
