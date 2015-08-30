package com.santraining.practice;

import java.util.Scanner;

/*1) Write a program to accept 10 integers and calculate mean, median and mode

8 8 9 10 10 11 11 11 12 13 8
*/

public class MeanMedianMode {
	static Scanner console=new Scanner(System.in);
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[]=new int[10];
		int temp=0;
		double mean=0.0,median;
		int n=a.length;
		System.out.println("Enter any 10 integers");
		for(int i=0;i<a.length;i++)
		{
			a[i]=console.nextInt();
			mean=mean+a[i];
		}
		System.out.println("The Mean is "+(mean/n));
		    int maxValue=0, maxCount=0;
		    /*for (int i = 0; i < a.length; ++i) 
		    {
		    	System.out.println(i);
		        int count = 0;
		        for (int j = 0; j < a.length; ++j) 
		        {
		        	System.out.println(j);
		            if (a[j] == a[i])
		            {
		            	System.out.println(count);
		            	++count;
		            	System.out.println(count);
		            }
		        }
		        if (count > maxCount) {
		            maxCount = count;
		            maxValue = a[i];
		        }
		    }
		    System.out.println("The Mode is "+maxValue);
		    */

		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
					count++;			    
			}
				if(count>maxCount)
				{
					maxCount=count;
				    maxValue=a[i];
				}
		}
				System.out.println("The Mode is "+maxValue);
		if(n%2==0)
			median=(a[n/2]+a[(n/2)+1])/2;
		else
			median=a[(n+1)/2];
		System.out.println("The Median is "+median);	
	}
}
