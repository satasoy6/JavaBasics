package com.syntax.class20;

public static class scrumTeam extends employee {

	String ceremonies;
	
	void attendMeetings() {
		System.out.println("Scrum team attend "+ceremonies);		
	}
  }

 class productOwner extends scrumTeam{
	 void prioritizeBacklog() {
		System.out.println("PO prioritize product backlog"); 		 
	 }	 
 }
 class scrumMaster extends scrumTeam{
	 void navigateTeam() {
	System.out.println("Scrummaster faciliates Scrum team");	 		 
	 }	 	 
 }
 class developer extends scrumTeam{
	 void coding() {
	System.out.println("Developer writes codes");	 
	}	 	 
 }
 class tester extends scrumTeam{
	 void test() {	
		 System.out.println("Tester ensures quality of coding");
	 }
	 
	 
 }
 class businessAnalyst extends scrumTeam{
	 void gatherRequirements() {
		 System.out.println("BA gets requirement from customer");		 
	 }
	 
	 
 }