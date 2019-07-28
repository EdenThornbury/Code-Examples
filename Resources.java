import java.io.*;

public class Resources{
	// the resource class designed for potential expansion later on
	// e.g custom resources with more or less productivity
	String resourceName;
	int resourceProductivity;
	
	//constructor
	public Resources(){
		
	}
	
	//getters and setters
	public void setResourceName(String name){
		
		this.resourceName = name;
		
	}
	
	public String getResourceName(){
		
		return this.resourceName;
		
	}
	
	public void setResourceProductivity(int productivity){
		
		this.resourceProductivity = productivity;
		
	}
	
	public int getResourceProductivity(){
		
		return this.resourceProductivity;
		
	}
	
	
	
	
}