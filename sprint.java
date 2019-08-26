import java.util.ArrayList;
import java.io.*;

public class sprint{
	
	/* sprint class created with the ability to store our task objects
	and resources objects in array lists */
	
	ArrayList<Resources> sprintResources;
	
	Task analyse;
	Task inProgress;
	Task Test;
	
	String sprintName;
	
	//constructor must initialise the array lists even when 'empty'
	public sprint(){
		
		sprintResources = new ArrayList<Resources>();
		
		
		
	}
	
	public sprint(Task t1, Resources r1){
		
		sprintResources = new ArrayList<Resources>();
		
		analyse = t1;
		
		sprintResources.add(r1);
		
	}
	public void setAnalyse(Task t1){
		analyse = t1;
	}
		public void setInProgress(Task t1){
		inProgress = t1;
	}
		public void setTest(Task t1){
		Test = t1;
	}
	//getters and setters
	public void setSprintName(String name){
		
		this.sprintName = name;
		
	}
	
	public String getSprintName(){
		
		return sprintName;
		
	}
	
	public void addResource(Resources r1){
		
		sprintResources.add(r1);
		
	}
	// adding tasks and resources
	public void addTask(Task t1){
		
		analyse = t1;
		
	}
	
	public int getDuration(int a){
		
		if (a ==1 ){
			return analyse.getTaskDuration();
		}
		else if(a == 2){
			return inProgress.getTaskDuration();
		}
		else{
			return Test.getTaskDuration();
		}
		
	}
	
	public String getActiveTaskName(int a){
		
		if (a ==1 ){
			return analyse.getTaskName();
		}
		else if(a == 2){
			return inProgress.getTaskName();
		}
		else{
			return Test.getTaskName();
		}
		
	}

	
	public Task getTask(int a){
		if (a ==1 ){
			return analyse;
		}
		else if(a == 2){
			return inProgress;
		}
		else{
			return Test;
		}
	}
	// returning a count of the resources, in effect how many man hours avaliable
	public int getResourceCount(){
		
		return sprintResources.size();
		
	}
	
	
}