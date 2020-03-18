package com.syntax.class05;

public class Recap2 {
	public static void main(String[] args) {
		
		/*If hour between 1-11--> morning
		 * if hour between 12-15-->afternoon
		 * if hour between 16-20-->evening
		 * if hour between 21-24-->night
		 */
		
		int hour = 34;
		String timeOfday;
		
		if(hour>=1 && hour<=11) {
			timeOfday="Morning";
		}
		else if(hour>=12 && hour<=15) {
			timeOfday="Afternoon";
		}
		else if(hour>=16 && hour<=20) {
			timeOfday="Evening";
		}
		else if(hour>=21 && hour<=24) {
			timeOfday="Night";
		}
		else {
			timeOfday="unknown";
		}
		
	//if time of the day is not unknown-->only then i want to see the message
	if(!timeOfday.equals("unknown")) {
		System.out.println("Right now is "+timeOfday);
	}
	
	}
}
