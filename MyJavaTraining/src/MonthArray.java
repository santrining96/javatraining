public class MonthArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int monthArray[]={3,4,10,6,12};
			String monthStringArr[]={"Jan","Feb","Mar","Apr","May","Jun","July","Aug","Sep","Oct","Nov","Dec"};
					
				for(int i=0;i<monthArray.length;i++)
				{
					if(monthArray[i]<=monthStringArr.length)
					{
						System.out.println(monthStringArr[monthArray[i]-1]);
						
					}
					else
						System.out.println("Invalid Number");
				}
			
			}
}
