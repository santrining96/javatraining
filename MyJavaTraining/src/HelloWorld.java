
public class HelloWorld {

	public static void main(String[] args) {
		int a;
		int b;
		a =10;
		b =31;
		String trainingOutput = "SWITCH";

		// TODO Auto-generated method stub
		//datatypes
		//Control Statement
		//if and else
		//if(condition) { } else {}
		//if (bus has problem) { take train } else { continue travel in bus}
		//if(bus available ) {take bus } else if (train is availble) {take train } else { walk}
		//if(condition) { if (condition) { } else {}} else if (condition) {} else {}
		//Syntax
		//if(bus available) {traveling in bus if(problem with bus) { take train if (tain has problem) {walk}}}
		if(trainingOutput.equals("HELLOWORLD"))
		{
			System.out.println("my HelloWorld");
			System.out.println("Sum of (a+b)"+(a+b));
			System.out.println("Sum of (a+b)"+a+b);
		}
		//Simple if single statement
		else if(trainingOutput.equals("IFELSE1"))
		{
			if(a>b)
				System.out.println("a is greater than b");
			else
				System.out.println("b is greater than a");
		}
		else if(trainingOutput.equals("IFELSE2"))
		{	
			//Simple if with multiple statements
			if(a>b)
			{
				//System.out.println("a is greater than b");
				System.out.println(a+" is greater than "+b);
				//10 is greater than 20
			}
			else
			{
				//System.out.println("b is greater than a");
				System.out.println(b+" is greater than "+a);
			}
		}
		else if(trainingOutput.equals("MULTIPLEIF"))
		{
			//Nested if....
			if(a>b)
			{
				System.out.println(a+" is greater than "+b);
			}
			else if(b>50)
			{
				System.out.println(b+" is greater than 50");
			}
			else
			{
				System.out.println(b+" is smaller than 50 and greater than "+a);
			}
		}
		//switch(condition){ case value: statement; break; case value2: statement}
		else if (trainingOutput.equals("SWITCH"))
		{
			switch(b) {
			case 10: 
				System.out.println("Switch b value is 10");
				break;
			case 20:
				System.out.println("Switch b values is 20");
				break;
			case 30:
				System.out.println("Switch b values is 30");
				break;
			case 40:
				System.out.println("Switch b values is 40");
				break;
	
			}
			if(b==10)
				System.out.println("IF b value is 10");
			else if(b==20)
				System.out.println("IF b value is 20");
			else if(b==30)
				System.out.println("IF b value is 30");
			else
				System.out.println("IF b value is 40");
				

		}
		
		
	}

}
