import java.io.*;
import java.util.Scanner;

public class planner{
	
	// Planner class uses task, resources and sprint to create the app, some functions are hardcoded 
	// version 0.1 expansion required
	
	int totalValue;
	
	double productivity;
	
	public static void main (String args[]){
		//creates a resource to be used in sprints with a productivity value of 1
		Resources r = new Resources();
		
		r.setResourceName("Generic Resource");
		r.setResourceProductivity(1);
		
		//creates scanner
		Scanner sc = new Scanner(System.in);
		
		//opening greeting
		System.out.println("Welcome to your sprint planner");
		
		System.out.println("+-------------------------------+");
		
		System.out.println("To start your sprint press 1");
		
		System.out.println("To exit press 0");
		
		System.out.println("+-------------------------------+");
		
		int holder = Integer.parseInt(sc.nextLine());
		boolean runState = true;
		
		//while loop to run the application and iterate through each 'refresh' of the sprint
		while(runState == true){
			
			if(holder == 1){
				//formatting task cards, currently hardcoded and awaiting expansion
				Task t = new Task("task 1", 1, 2);
				Task t2 = new Task("task 2", 2, 3);
				Task t3 = new Task("task 3", 3, 4);
				System.out.printf("+--------------------+\n" + 
								  "+------" + t.getTaskName()+ "--------+\n" + 
								  "+------value: " + t.getTaskValue() + "------+\n" +
								  "+------duration: " + t.getTaskDuration() + "---+\n" + 
								  "+--------------------+\n \n");
								  
				System.out.printf("+--------------------+\n" + 
								  "+------" + t2.getTaskName()+ "--------+\n" + 
								  "+------value: " + t2.getTaskValue() + "------+\n" +
								  "+------duration: " + t2.getTaskDuration() + "---+\n" + 
								  "+--------------------+\n \n");
								  
				System.out.printf("+--------------------+\n" + 
								  "+------" + t3.getTaskName()+ "--------+\n" + 
								  "+------value: " + t3.getTaskValue() + "------+\n" +
								  "+------duration: " + t3.getTaskDuration() + "---+\n" + 
								  "+--------------------+\n \n");
								  
				System.out.println("To start a new Sprint pick a task");
				
				
				int choice = Integer.parseInt(sc.nextLine());
				//begins the simulation
				if(choice == 1){
					
					
					
				}
			
			}
			else{
				//closes the app
				runState = false;
				
			}
		
		
		}
		
	}
	
}