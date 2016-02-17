package DayCalculator;

import java.util.Scanner;


public class DayCalculator {

	public static void daysInMonths(int monthStart, int monthEnd) {
		
	}
	
	public static boolean isLeapYear(int year) {
		boolean res = false;
		
	    if (  ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0) ) {
	            res = true;
	    } else { 
	    		res = false;
	    }
		return res;
	}
	
	public static int getDaysInMonth(int month, int year) {
		
		int days = 0;
		
		if (month == 2) {
			if(isLeapYear(year)) {
				days = 29;
			} else {
				days = 28;
			}
		} else if (month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
			days = 31;
		} else {
			days = 30;
		}
		return days;
	}

	public static int getTotalDates(int year, int month, int day) {
		int totDates = 0;
		
		
		
		return totDates;
	}
	
	public static void printDaysOfWeek(int td) {
		int flag = td % 7;
		
		switch(flag) {
			case 1:
				System.out.println("Sunday");
				break;
			case 2:
				System.out.println("Monday");
				break;
			case 3:
				System.out.println("Tuesday");
				break;
			case 4:
				System.out.println("Wedday");
				break;
			case 5:
				System.out.println("Thursday");
				break;
			case 6:
				System.out.println("Friday");
				break;
			case 0:
				System.out.println("Saturday");
				break;
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int totalDates = 1;  //Jan 1 , 1004
		
		System.out.println("Enter the year:");
		String yearStr = input.nextLine();
		int year = Integer.parseInt(yearStr);

		System.out.println("Enter the month:");
		String monthStr = input.nextLine();
		int month = Integer.parseInt(monthStr);
		
		System.out.println("Enter the day:");
		String dayStr = input.nextLine();
		int day = Integer.parseInt(dayStr);		
		
		totalDates = getTotalDates(year, month, day);
		
		printDaysOfWeek(totalDates);
		
	}
}
