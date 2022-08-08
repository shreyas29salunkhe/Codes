package com.student.service;


import java.util.Arrays;
import java.util.List;

import com.desktopallocation.service.DesktopAllocator;
import com.infy.timeallocation.service.TimeAllocator;

public class Student {
	private String name;
	private int rollNumber;
	private String desktopNumber;
	private String examSlot;
	static DesktopAllocator d=new DesktopAllocator();
	static TimeAllocator t=new TimeAllocator();
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getDesktopNumber() {
		
		desktopNumber=d.allocateDesktopNumber(getRollNumber());
		return desktopNumber;
	}

	public void setDesktopNumber(String desktopNumber) {
		
		
		this.desktopNumber = desktopNumber;
	}

	public String getExamSlot() {
		
		examSlot=t.allocateTimeSlot(getDesktopNumber());
		return examSlot;
	}

	public void setExamSlot(String examSlot) {
		this.examSlot = examSlot;
	}
	static void display(List<Student>li)
	{
		System.out.println("Exam Slot Details");
		System.out.println("-------------------");
		for(Student s:li)
		{
			System.out.println("-------------------");
			System.out.println("Student Details");
			System.out.println("Name:- "+s.getName()+"\nRoll Number:- "+s.getRollNumber()+"\nDesktop Number:- "+s.getDesktopNumber()+"\nExam SlotMorning:- "+s.getExamSlot()+"\n");
			System.out.println("-------------------");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.setName("Mathew");
		s1.setRollNumber(15);
		Student s2=new Student();
		s2.setName("Thomas");
		s2.setRollNumber(42);
		List<Student>li=Arrays.asList(s1,s2);
		display(li);
		

	}

}
