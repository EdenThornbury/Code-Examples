import java.util.ArrayList;
import java.io.*;

public class sprint{
	
	/* sprint class created with the ability to store our task objects
	and resources objects in array lists */
	
	ArrayList<Resources> sprintResources;
	
	ArrayList<Task> sprintTasks;
	
	String sprintName;
	
	//constructor must initialise the array lists even when 'empty'
	public sprint(){
		
		sprintResources = new ArrayList<Resources>();
		
		sprintTasks = new ArrayList<Task>();
		
	}
	
	public sprint(Task t1, Resources r1){
		
		sprintResources = new ArrayList<Resources>();
		
		sprintTasks = new ArrayList<Task>();
		
		sprintResources.add(r1);
		
		sprintTasks.add(t1);
		
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
		
		sprintTasks.add(t1);
		
	}
	
	public String getActiveTaskName(){
		
		Task t = sprintTasks.get(0);
		return t.getTaskName();
		
	}
	// returning a count of the resources, in effect how many man hours avaliable
	public int getResourceCount(){
		
		return sprintResources.size();
		
	}
	
	
}