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
		int tasksRunning;
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
								  
				System.out.println("To start a new Sprint pick a task");
				
				
				
				boolean sprintTracker = true;
				int timeCounter = 0;
				//creating a sprint object to store our resources and tasks
				sprint s = new sprint();
				s.addTask(tcard.printTaskCards());
				s.addResource(r);
				s.addResource(r);
				s.addResource(r);
				s.addResource(r);
				s.addResource(r);
				tasksRunning = 1;
				l.setTaskA(s.getActiveTaskName(1));
				l.setResourceA(s.getResourceCount());
				
				
				while (sprintTracker = true){
					
					//formatting output table so it looks pretty
					l.printLayout();
					
					// awaiting expansion - e.g adding functionality to the options
					System.out.printf("Sprint begun: Press 1 to refresh \n" +
									  "              Press 2 to add another task \n" + 
									  "              Press 3 to move a task \n");
					
					int choice2 = Integer.parseInt(sc.nextLine());
					
					if (choice2 == 1){
						if (tasksRunning == 1){
							Task t = s.getTask(1);
							t.setAnalyse();
							l.setCompA("complete");
						}
						else if(tasksRunning == 2){
							Task t1 = s.getTask(1);
							Task t2 = s.getTask(2);
							
							if(t1.checkA() == true && t2.checkP() == false){
								t2.setProgress();
								l.setCompP("complete");
								
							}else if(t2.checkP() == true && t1.checkA() == false){
								t1.setAnalyse();
								l.setCompA("complete");
							}
							else if (t1.getTaskDuration() < t2.getTaskDuration()){
								t1.setAnalyse();
								l.setCompA("complete");
							}
							else if(t2.checkP() == true && t1.checkA() == true){
								System.out.println("All Tasks complete");
							}
							else{
								t2.setProgress();
								l.setCompP("complete");
							}
						}
						else{
							Task t1 = s.getTask(1);
							Task t2 = s.getTask(2);
							Task t3 = s.getTask(3);
							
							if(t1.checkA() == true && t2.checkP() == false && t3.checkT() == true){
								t2.setProgress();
								l.setCompP("complete");
								
							}else if(t2.checkP() == true && t1.checkA() == false && t3.checkT() == true){
								t1.setAnalyse();
								l.setCompA("complete");
							}
							else if(t2.checkP() == true && t1.checkA() == true && t3.checkT() == false){
								t3.setTest();
								l.setCompT("complete");
							}
							
							else if(t2.checkP() == true && t1.checkA() == true && t3.checkT() == true){
								System.out.println("All Tasks complete");
							}
							else if (t1.checkA() == false && t2.checkP() == false && t3.checkT() == true){
								if (t1.getTaskDuration() < t2.getTaskDuration()){
									t1.setAnalyse();
									l.setCompA("complete");
								}
								else{
									t2.setAnalyse();
									l.setCompP("complete");
								}
							}
							else if (t1.checkA() == false && t2.checkP() == true && t3.checkT() == false){
								if (t1.getTaskDuration() < t3.getTaskDuration()){
									t1.setAnalyse();
									l.setCompA("complete");
								}
								else{
									t3.setTest();
									l.setCompT("complete");
								}
							}
							else if (t1.checkA() == true && t2.checkP() == false && t3.checkT() == false){
								if (t2.getTaskDuration() < t3.getTaskDuration()){
									t2.setProgress();
									l.setCompP("complete");
								}
								else{
									t3.setTest();
									l.setCompT("complete");
								}
							}
							else if (t1.checkA() == false && t2.checkP() == false && t3.checkT() == false){
								if (t2.getTaskDuration() < t3.getTaskDuration() && t2.getTaskDuration() < t1.getTaskDuration()){
									t2.setProgress();
									l.setCompP("complete");
								}
								else if(t1.getTaskDuration() < t3.getTaskDuration() && t1.getTaskDuration() < t2.getTaskDuration()){
									t1.setAnalyse();
									l.setCompA("complete");
								}
								else if(t3.getTaskDuration() < t1.getTaskDuration() && t3.getTaskDuration() < t2.getTaskDuration()){
									t3.setTest();
									l.setCompT("complete");
								}
								else{
									t3.setTest();
									l.setCompT("complete");
								}
							}
							
							
							else{
								t2.setProgress();
								l.setCompP("complete");
							}
						}
							
					}
					else if (choice2 == 2){
						
						if(s.getTask(1).checkA() == true){
							s.addTask(tcard.printTaskCards());
							tasksRunning = tasksRunning + 1;
							l.setTaskA(s.getActiveTaskName(1));
							l.setCompA("working ");
							
						}
						else{
							System.out.println("Please complete and move the currently working task");
						}
					}
					else if(choice2 == 3){
						System.out.println("Which colomn would you like to switch?");
						System.out.println("To move Analyse to In Progress enter 1");
						System.out.println("To move In Progress to Test enter 2");
						System.out.println("To move Test to Done enter 3");
						int choice3 = Integer.parseInt(sc.nextLine());
						
						if (choice3 == 1){
							
							l.setCompA("        ");
							l.setTaskA("      ");
							l.setTaskB(s.getActiveTaskName(1));
							l.setCompP("working ");
							s.setInProgress(s.getTask(1));
							
						}
						else if (choice3 == 2){

							l.setTaskB("      ");
							l.setTaskC(s.getActiveTaskName(2));
							l.setCompT("working ");
							s.setTest(s.getTask(2));
							
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