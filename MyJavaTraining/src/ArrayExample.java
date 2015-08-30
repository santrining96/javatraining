
public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//datatype[] variablename = {}; sperated by comma
		//datatype variablename[] = {}; sperated by comma
		int[] values = {1,10,1};//collection same data types
		
		
		int[] arrayInt = new int[3]; //index 0 and ends at length - 1
		arrayInt[0] = 1;
		arrayInt[1] = 10;
		arrayInt[2] = 1;
		
		
		for(int i=0;i<values.length;i++)
		{
			System.out.println("values index "+i+" it's value is "+values[i]);
		}
		
		values[0] = 20; 
		values[1] = 20; 
		values[2] = 20; 
		
		for(int i=0;i<values.length;i++)
		{
			System.out.println("after updatding values index "+i+" it's value is "+values[i]);
		}
		
		for(int i=0;i<arrayInt.length;i++)
		{
			System.out.println("arrayInt index "+i+" it's value is "+arrayInt[i]);
		}
		
		//write a program array of 10 numbers and print out odd and even numbers

		
	}

}
