package com.sl;

//Student.java
public class Student {
	private int id;
	private String name;
	private String course;
	private int age;

	// Constructor
	public Student(int id, String name, String course, int age) {
		this.id = id;
		this.name = name;
		this.course = course;
		this.age = age;
	}

	// Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}