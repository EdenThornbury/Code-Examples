import java.io.*;
import java.util.Random;
import java.util.ArrayList;


public class Task {
	// task class with value and duration elements
	String taskName;
	int taskDuration;
	int taskValue;
	Random rand = new Random();
	ArrayList taskList = new ArrayList<Task>();
	boolean analyse = false;
	boolean inProgress = false;
	boolean test = false;
	//generate list of tasks
	public Task(){
		
		
	}
	//constructors 
	public Task(String name, int val, int dur){
		
		this.taskDuration = dur;
		this.taskValue = val;
		this.taskName = name;
	}	
	// getters and setters
	public void setTaskName(String name){
	
		this.taskName = name;
		
	}
	
	public String getTaskName(){
		
		return this.taskName;
		
	}
	
	public void setTaskDuration(int duration){
		
		this.taskDuration = duration;
		
	}
	
	public int getTaskDuration(){
		
		return this.taskDuration;
		
	}
	
	public void setTaskValue(int value){
		
		this.taskValue = value;
		
	}
	
	public int getTaskValue(){
		
		return this.taskValue;
		
	}
	
	public void setAnalyse(){
	
		this.analyse = true;
		
	}
	
	public boolean checkA(){
		return analyse;
	}
	
	public boolean checkP(){
		return inProgress;
	}
	
	public boolean checkT(){
		return test;
	}
	
	
	public void setProgress(){
	
		this.inProgress = true;
		
	}
	
	public void setTest(){
	
		this.test = true;
		
	}
	
		
	
}