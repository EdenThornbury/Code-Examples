import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class taskCard{
	Random rand = new Random();
	ArrayList<Task> taskList = new ArrayList<Task>();
	
	public taskCard(){
		
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
				for(int i = 0; i <= 25; i++){
					char hold = alphabet[i];
					int n = rand.nextInt(9);
					n += 1; 
					int n2 = rand.nextInt(9);
					n2 += 1;
					String hold2 = "Task " + hold;
					Task t = new Task(hold2, n, n2);
					taskList.add(t);
				}
	}
	
	public Task printTaskCards(){
		Scanner sc = new Scanner(System.in);
		for(int j = 0; j <= taskList.size(); j += 3){
		System.out.printf("+--------------------+  +--------------------+ +--------------------+\n" + 
						"+------" + taskList.get(j).getTaskName()+ "--------+  +------" + taskList.get(j+1).getTaskName()+ "--------+  +------" + taskList.get(j+2).getTaskName()+ "--------+\n" + 
						"+------value: " + taskList.get(j).getTaskValue() + "------+  +------value: " + taskList.get(j+1).getTaskValue() + "------+  +------value: " + taskList.get(j+2).getTaskValue() + "------+\n" +
						"+------duration: " + taskList.get(j).getTaskDuration() + "---+  +------duration: " + taskList.get(j+1).getTaskDuration() + "---+  +------duration: " + taskList.get(j+2).getTaskDuration() + "---+\n" + 
						"+--------------------+  +--------------------+  +--------------------+\n \n");
			System.out.println("Choose Task 1-3 or 4 for more options");
			int choice = Integer.parseInt(sc.nextLine());
			boolean check = true;
			while(check == true){
				if (choice == 1 || choice == 2 || choice == 3){
					Task t = taskList.get(j + choice - 1);
					startTask(j + choice -1);
					
					return t;
				}
				else if (choice == 4){
					if(j == 24){
						j = 23;
						check = false;
					}
					else {
						check = false;
					}
					
				}
				else{
					System.out.println("sorry wrong input");
				}
			}
		}
		return taskList.get(0);
	}
	
	public void startTask(int a){
				
		taskList.remove(a);
		
	}

}