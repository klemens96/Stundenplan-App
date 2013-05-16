package com.classes; 


public class Timetable {
	
	// Feld zur Verwaltung aller Fächer der Woche
	Subject [][] field; 
	int daynr; 
	int hournr; 
	
	public Timetable(){
		daynr = 5;
		hournr = 12; 
		field = new Subject [daynr][hournr];
	}
	
	// Ändert den Speicherplatz im angegebenen Feld auf das angegebe Fach
	public void changeSubject(Subject newSubject, int x, int y){
		field[x][y] = newSubject; 
	}
	
	// Gibt die ersten drei Buchstaben des Faches wieder; diese können dann zB. in die Buttons der MainActivity eingetragen werden
	public String substrSubject(int x, int y){
		
		Subject subject = field[x][y];
		String subjectName = subject.getSubject();
		
		return subjectName.substring(0,3); 
	}
}
