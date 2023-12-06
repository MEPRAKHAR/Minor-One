package com.ppa.geneticalgorithm.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.ppa.geneticalgorithm.domain.*;


public class DataProvider {

	private List<Room> rooms;
	private List<Teacher> teachers;
	private List<Subject> subjects;
	private List<Department> departments;
	private List<TimeSlot> timeslots;
	private int numberOfClasses = 0;

	public DataProvider() {
		super();
		initialize();
	}

	private DataProvider initialize() {

		Room r1 = new Room("11011", 100);
		Room r2 = new Room("11012", 75);
		Room r3 = new Room("11013", 80);
		rooms = new ArrayList<Room>(Arrays.asList(r1, r2, r3));

		TimeSlot ts1 = new TimeSlot("TS1", "M 9:00 - 9:30");
		TimeSlot ts2 = new TimeSlot("TS2", "M 9:30 - 10:00");
		TimeSlot ts3 = new TimeSlot("TS3", "M 10:00 - 10:30");
		TimeSlot ts4 = new TimeSlot("TS4", "M 10:30 - 11:00");
		TimeSlot ts5 = new TimeSlot("TS5", "M 11:00 - 11:30");
		TimeSlot ts6 = new TimeSlot("TS6", "M 11:30 - 12:00");
		TimeSlot ts7 = new TimeSlot("TS7", "M 12:00 - 12:30");
		TimeSlot ts8 = new TimeSlot("TS8", "M 12:30 - 01:00");

		timeslots = new ArrayList<>(Arrays.asList(ts1, ts2, ts3, ts4, ts5 , ts6,ts7,ts8 ));

		Teacher t1 = new Teacher("T1", "Dr D.K. Sharma ");
		Teacher t2 = new Teacher("T2", "Dr H.K. Sharma ");
		Teacher t3 = new Teacher("T3", "Arjun Arora    ");
		Teacher t4 = new Teacher("T4", "Amar Jindal    ");
		Teacher t5 = new Teacher("T5", "Vibhu Jately   ");
		Teacher t6 = new Teacher("T6", "Ashutosh Shukla");
		teachers = new ArrayList<Teacher>(Arrays.asList(t1, t2, t3, t4,t5,t6));

		Subject s1 = new Subject("S1", "CICD            ", 75, new ArrayList<Teacher>(Arrays.asList(t1, t2)));
		Subject s2 = new Subject("S2", "Compiler Design ", 25, new ArrayList<Teacher>(Arrays.asList(t4)));
		Subject s3 = new Subject("S3", "MicroProcesser  ", 100, new ArrayList<Teacher>(Arrays.asList(t5, t6)));
		Subject s4 = new Subject("S4", "Devops          ", 65, new ArrayList<Teacher>(Arrays.asList(t1, t2)));
		Subject s5 = new Subject("S5", "Cloud Computing ", 90, new ArrayList<Teacher>(Arrays.asList(t4)));
		Subject s6 = new Subject("S6", "Machine Learning", 70, new ArrayList<Teacher>(Arrays.asList(t1, t3)));
		Subject s7 = new Subject("S7", "OOPS            ", 80, new ArrayList<Teacher>(Arrays.asList(t2, t4)));
		subjects = new ArrayList<Subject>(Arrays.asList(s1, s2, s3, s4, s5, s6, s7));

		Department d1 = new Department("Devops", new ArrayList<Subject>(Arrays.asList(s1, s3,s7)));
		Department d2 = new Department("AIML  ", new ArrayList<Subject>(Arrays.asList(s6, s4, s7)));
		Department d3 = new Department("CCVT  ", new ArrayList<Subject>(Arrays.asList(s3,s5, s7)));
		departments = new ArrayList<Department>(Arrays.asList(d1, d2, d3));
		departments.forEach(x -> numberOfClasses += x.getSubjects().size());

		return this;
	}

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	public List<TimeSlot> getTimeslots() {
		return timeslots;
	}

	public void setTimeslots(List<TimeSlot> timeslots) {
		this.timeslots = timeslots;
	}

	public int getNumberOfClasses() {
		return numberOfClasses;
	}

	public void setNumberOfClasses(int numberOfClasses) {
		this.numberOfClasses = numberOfClasses;
	}

}
