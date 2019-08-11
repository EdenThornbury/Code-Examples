import java.io.*;
import java.util.Scanner;
// Author E.T

public class planner{
	
	// Planner class uses task, resources and sprint to create the app, some functions are hardcoded 
	// version 0.1 expansion required
	
	int totalValue;
	
	double productivity;
	
	public static void main (String args[]){
		//creates a resource to be used in sprints with a productivity value of 1
		Resources r = new Resources();
		taskCard tcard = new taskCard();
		layout l = new layout();
		
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
				boolean sprintTracker = true;
				int timeCounter = 0;
				//creating a sprint object to store our resources and tasks
				sprint s = new sprint();
				if (choice == 1){
					//adding tasks and resources
					s.addTask(t);
					s.setSprintName("sprint 1");
					s.addResource(r);
					s.addResource(r);
					s.addResource(r);
					s.addResource(r);
					s.addResource(r);
					l.setTaskA(s.getActiveTaskName());
					l.setResourceA(s.getResourceCount());
					
					
				}
				else if(choice == 2){
					
					s.addTask(t2);
					s.setSprintName("sprint 1");
					s.addResource(r);
					s.addResource(r);
					s.addResource(r);
					s.addResource(r);
					s.addResource(r);
					l.setTaskA(s.getActiveTaskName());
					l.setResourceA(s.getResourceCount());
				}
				else if(choice == 3){
					
					s.addTask(t3);
					s.setSprintName("sprint 1");
					s.addResource(r);
					s.addResource(r);
					s.addResource(r);
					s.addResource(r);
					s.addResource(r);
					l.setTaskA(s.getActiveTaskName());
					l.setResourceA(s.getResourceCount());
				}
				else{
					runState = false;
				}
				
				
				while (sprintTracker = true){
					
					//formatting output table so it looks pretty
					l.printLayout(s);
					
					// awaiting expansion - e.g adding functionality to the options
					System.out.printf("Sprint begun: Press 1 to refresh \n" +
									  "              Press 2 to add another task \n" + 
									  "              Press 3 to move a task \n");
					
					int choice2 = Integer.parseInt(sc.nextLine());
					
					if (choice2 == 1){
						
					}
					else if (choice2 == 2){
						
						tcard.printTaskCards();
						
						int choice3 = Integer.parseInt(sc.nextLine());
						if (choice3 == 1){
							s.addTask(t);
						}
						else if (choice3 == 2){
							s.addTask(t2);
						}
						else if (choice3 == 3){
							s.addTask(t3);
						}
					}
					else if(choice2 == 3){
						System.out.println("Which colomn would you like to switch?");
						System.out.println("To move Analyse to In Progress enter 1");
						System.out.println("To move In Progress to Test enter 2");
						System.out.println("To move Test to Done enter 3");
						int choice3 = Integer.parseInt(sc.nextLine());
						
						if (choice3 == 1){
							l.setTaskA("      ");
							l.setTaskB(s.getActiveTaskName());
						}
						else if (choice3 == 2){

							l.setTaskB("      ");
							l.setTaskC(s.getActiveTaskName());
							
						}
						else if (choice3 == 2){

							l.setTaskC("      ");
							//l.setTaskC(s.getActiveTaskName());
							
						}
					}
				}
			}
			else{
				//closes the app
				runState = false;
				
			}
		
		
		}
		
	}
	
}