package com.classes; 


public class Subject {
		
	
	protected String name, teacher; 

	
	
	public Subject (String newsubject, String newteacher){
		name = newsubject; 
		teacher = newteacher; 
	}
	
	
	// get-Methoden für die protected-Variablen
	public String getSubject() {
		return name; 
	}
	
	public String getTeacher() {
		return teacher; 
	}
	
	
	// Re-Initialisierung der einzelnen Variablen (z.B bei Lehreränderung zum Halbjahr)
	public void setSubject(String newSubject) {
		name = newSubject;
	}
	
	public void setTeacher(String newTeacher) {
		teacher = newTeacher;  
	}
}
