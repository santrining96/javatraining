package com.santraining.initial;

public class LoopingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while, do-while and for loop
		//weekly classs
		//every Tues and Thurs (Condition
		//begin
		//Take bus at 2 PM
		//Get at university
		//Walk to the class
		//End
		//Until u get graduated. (Exit condition)
		// 1 and 100 you want to print odd and even numbers
		//4/2= 2 and reminder 0
		//Pass arguments from and use it in our test

		int i =1;
		
		System.out.println("******** while loop ********");
		
		while(i<10) //condition check
		{
			
			if (i%2==0)
			{
				System.out.println(i+" is even number");
			}
			else if(i%3==0)
			{
				System.out.println(i+" is multiple of 3");
			}
			else
			{
				System.out.println(i+" is odd number");
			}
			i++;//++ i = i+1
		}
		
		System.out.println("******* do loop **********");
		i = 1;
		do //condition check
		{
			
			if (i%2==0)
			{
				System.out.println(i+" is even number");
			}
			else if(i%3==0)
			{
				System.out.println(i+" is multiple of 3");
			}
			else
			{
				System.out.println(i+" is odd number");
			}
			i++;//++ i = i+1
		} while(i<10);
		
		//for(initialization;termination;increment)
		//statements
		System.out.println("********** for loop **************");
		for(int j=1;j<10;j++)
		{
			if (j%2==0)
			{
				System.out.println(j+" is even number");
			}
			else if(j%3==0)
			{
				System.out.println(j+" is multiple of 3");
			}
			else
			{
				System.out.println(j+" is odd number");
			}
		}
		

	}

}
