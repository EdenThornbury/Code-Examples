import java.util.ArrayList;
import java.io.*;

public class sprint{
	
	ArrayList<Resources> sprintResources;
	
	ArrayList<Task> sprintTasks;
	
	String sprintName;
	
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
	
	public void setSprintName(String name){
		
		this.sprintName = name;
		
	}
	
	public String getSprintName(){
		
		return sprintName;
		
	}
	
	public void addResource(Resources r1){
		
		sprintResources.add(r1);
		
	}
	
	public void addTask(Task t1){
		
		sprintTasks.add(t1);
		
	}
	
	public String getActiveTaskName(){
		
		Task t = sprintTasks.get(0);
		return t.getTaskName();
		
	}
	
	public int getResourceCount(){
		
		return sprintResources.size();
		
	}
	
	
}