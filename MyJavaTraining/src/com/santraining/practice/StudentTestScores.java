/*You are given a list of students’ names and their test scores. Write a program to do the following:
(i) 	Calculate the average test scores
(ii) 	Determines and prints the names of all the students whose test score is below the average test score
(iii)	Determines the highest test score
(iv)	Prints the names of all the students whose test score is the same as the highest test score
*/
package com.santraining.practice;

/**
 * @author santraining96
 *
 */
public class StudentTestScores {
	public static void main(String[] args)
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
		System.out.println(highestTestScore);
			System.out.println("The list of people with the same score as the highest test score are ");
			for(int k=0;k<testScores.length;k++)
			{
				if(testScores[k]==highestTestScore)
					System.out.println(studentNames[k]);
			}
		}
}
