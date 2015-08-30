package com.santraining.bean;

public class Student {
	//Class Variables or data
	private String name; //Modifier DataType variableName
	private int testScores[];
	
	//Default Constructor
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	//Parameter Constructor
	public Student(String name, int[] testScores) {
		super();
		this.name = name;
		this.testScores = testScores;
	}
	
	//Methods
	public String getName() {
		return name;
	}
	
	//Methods with parameter
	public void setName(String name) {
		this.name = name;
	}

	public int[] getTestScores() {
		return testScores;
	}

	public void setTestScores(int[] testScores) {
		this.testScores = testScores;
	}
	

}
