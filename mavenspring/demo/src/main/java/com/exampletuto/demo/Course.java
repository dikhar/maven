package com.exampletuto.demo;

public class Course {
	private int id;
	private String course;
	
	public Course(int id, String course) {
		// TODO Auto-generated constructor stub
		super();
		this.id=id;
		this.course=course;
	}
	public int getId() {
		return id;
	}
	public String getCourse() {
		return course;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", course=" + course + "]";
	}
	
}
