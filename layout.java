import java.io.*;

public class layout{
	
	int resourceA = 0;
	int resourceB = 0;
	int resourceC = 0;
	String TaskA = "      ";
	String TaskB = "      ";
	String TaskC = "      ";
	public void layout(){
		
		
	}
	public void setResourceA(int i){
		this.resourceA = i;
	}
	
	public void setResourceB(int i){
		this.resourceB = i;
	}
	
		
	public void setResourceC(int i){
		this.resourceC = i;
	}

	public void setTaskA(String s){
		this.TaskA = s;
	}
	
	public void setTaskB(String s){
		this.TaskB = s;
	}
	
	public void setTaskC(String s){
		this.TaskC = s;
	}
	
	public void printLayout(sprint sp){
		
		System.out.printf("+-------------------------------------------------+\n" +
									  "| Resources|    %d    |      %d      |    %d   |-------|\n" +
									  "| Back Log | Analyse | In Progress | Test   | Done  |\n" +
									  "|          | %s  |   %s    | %s |       |\n" +
									  "|          |         |             |        |       |\n" +
									  "|          |         |             |        |       |\n", resourceA, resourceB, resourceC, TaskA, TaskB, TaskC );
		
	}
}