
package com.santraining.practice;
import java.util.Arrays;

//importing classes
import com.santraining.bean.Student;

/**
 * @author santraining96
 *
 *You are given a list of students’ names and their test scores. Write a program to do the following:
 *(i) 	Calculate the average test scores
 *(ii) 	Determines and prints the names of all the students whose test score is below the average test score
 *(iii)	Determines the highest test score
 *(iv)	Prints the names of all the students whose test score is the same as the highest test score
*/
public class StudentTestScores {
	public static void main(String[] args)
	{
		StudentTestScores t = new StudentTestScores();
		//System.out.println("Nitin code *********");
		//t.nitinCode(args);
		System.out.println("Refactor code *********");
		t.refactorCode(args);
	}
	
	public void nitinCode(String[] args)
	{
		// TODO Auto-generated method stub
		String studentNames[]={"Nitin","Arun","Harsha","Nischal","Anand"};
		double testScores[]={88,64,94,87,54};
		double avgTestScore,highestTestScore=0,sum=0,temp=0;
		for(int i=0;i<testScores.length;i++)
		{
			sum=sum+testScores[i];
		}
		avgTestScore=sum/testScores.length;
		System.out.println("The Average Test Score of the Class is "+avgTestScore);
		System.out.println("The following is the list of stduents whose test score is below the Average Test Score ");
		for(int i=0;i<testScores.length;i++)
		{
			if(testScores[i]<avgTestScore)
				System.out.println(studentNames[i]);
		}
		for(int i=0;i<testScores.length;i++)
		{
			for(int j=0;j<testScores.length;j++)
				{
					if(testScores[i]<testScores[j])
					{
						temp=testScores[j];
						testScores[j]=testScores[i];
						testScores[i]=temp;
					}
				}
			
			if(i==testScores.length-1)
			{
				highestTestScore=testScores[i];
				System.out.println("The highest test score is  "+highestTestScore);
			}
		}
		//testScores = 94,88,87
		System.out.println(highestTestScore);
			System.out.println("The list of people with the same score as the highest test score are ");
			for(int k=0;k<testScores.length;k++)
			{
				if(testScores[k]==highestTestScore)
					System.out.println(studentNames[k]);
			}
		}
	
	public void refactorCode(String[] args)
	{
		// TODO Auto-generated method stub
		String studentNames[]={"Nitin","Arun","Harsha","Nischal","Anand"};
		double testScores[]={88,64,94,87,54};
		//location variable pos1,pos2,pos3,pos4,pos5
		
		double avgTestScore,highestTestScore=0,sum=0,temp=0;
		
		for(int i=0;i<testScores.length;i++)
		{
			sum=sum+testScores[i];
		}
		avgTestScore=sum/testScores.length;
		System.out.println("The Average Test Score of the Class is "+avgTestScore);
		System.out.println("The following is the list of stduents whose test score is below the Average Test Score ");
		
		//All students having score less than average
		for(int i=0;i<testScores.length;i++)
		{
			if(testScores[i]<avgTestScore)
				System.out.println(studentNames[i]);
		}
		
		// Find the student having highest test score
		// 60,80,40,21,45
		// 60 > 80
		//double[] highestTestScoreArr = testScores;
		double[] highestTestScoreArr = Arrays.copyOf(testScores, testScores.length);
		
		for(int i=0;i<highestTestScoreArr.length;i++)
		{
			for(int j=0;j<highestTestScoreArr.length;j++)
				{
					if(highestTestScoreArr[i]<highestTestScoreArr[j])
					{
						temp=highestTestScoreArr[j];
						highestTestScoreArr[j]=highestTestScoreArr[i];
						highestTestScoreArr[i]=temp;
					}
				}
			if(i==highestTestScoreArr.length-1)
			{
				highestTestScore=highestTestScoreArr[i];
				System.out.println("The highest test score is  "+highestTestScore);
			}
		}		

		
		//System.out.println(highestTestScore);
			System.out.println("The list of people with the same score as the highest test score are ");
			for(int k=0;k<testScores.length;k++)
			{
				if(testScores[k]==highestTestScore)
					System.out.println(studentNames[k]);
			}
	}
	
	public int getTotal(Student s) {
		int totalMarks = 0;
		for(int mark: s.getTestScores()) {
			totalMarks += mark;
		}
		return totalMarks;
	}

	public double getAverageScore(Student s) {
		double  averageMarks = 0;
		int totalMarks = 0;
		for(int mark: s.getTestScores()) {
			totalMarks += mark;
		}
		averageMarks = totalMarks/s.getTestScores().length;
		return averageMarks;
	}
	
	public int getHighestTestScore(int[] testScores) {
		int highestTestScore = 0;
		for(int mark: testScores) {
			
		}
		return highestTestScore;
	}
	
}
