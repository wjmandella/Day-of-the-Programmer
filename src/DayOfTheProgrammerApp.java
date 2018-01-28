// My solution to the HackerRank problem "Day of the Programmer."
// https://www.hackerrank.com/challenges/day-of-the-programmer/problem

import java.util.Scanner;

public class DayOfTheProgrammerApp {
    static String solve(int year){
        // Complete this function
    	String yearStr = Integer.toString(year);
    	String dateDOP = "";
    	
    	if(1700 <= year && year <= 1917) {
    		if(year % 4 == 0) {
    			dateDOP = "12.09."+ yearStr;    			    			    			
    		}
    		else {
    			dateDOP += "13.09."+yearStr;
    		}
    	}
    	else if(year == 1918) {
    		dateDOP = "26.09.1918";
    	}
    	else {
    		if((year % 400 == 0)|| (year % 4 == 0 && year % 100 != 0)) {
    			dateDOP = "12.09."+yearStr;
    		}
    		else {
    			dateDOP += "13.09."+yearStr;
    		}
    	}    	
    	return dateDOP;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a year (1700-2700): ");
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
        in.close();
    }
}
