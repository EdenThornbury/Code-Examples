import java.io.*;
import java.util.ArrayList;
import java.util.Random;


public class taskCard{
	Random rand = new Random();
	ArrayList<Task> taskList = new ArrayList<Task>();
	
	public taskCard(){
		
		char[] alphabet = "abc defghijklmnopqrstuvwxyz".toCharArray();
				for(int i = 0; i <= 25; i++){
					char hold = alphabet[i];
					int n = rand.nextInt(10);
					n += 1; 
					int n2 = rand.nextInt(10);
					n2 += 1;
					String hold2 = "Task " + hold;
					Task t = new Task(hold2, n, n2);
					taskList.add(t);
				}
	}
	
	public void printTaskCards(){
		
		for(int j = 0; j <= taskList.size(); j += 3){
		System.out.printf("+--------------------+\n" + 
								  "+------" + taskList.get(j).getTaskName()+ "--------+\n" + 
								  "+------value: " + taskList.get(j).getTaskValue() + "------+\n" +
								  "+------duration: " + taskList.get(j).getTaskDuration() + "---+\n" + 
								  "+--------------------+\n \n");

		}
	}
	
	public void removeTask(){
		
		
		
	}

}