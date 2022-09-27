package ttn;

public class Program 
{

	public static void main(String[] args) 
	{
	  int arr[][]= {{2,3,4},{4,9,7},{3,5,8}};
	  int rowsum=0,columnsum=0;
	  System.out.println("Sum of each element of every column");
      //Sum of each Column value
      for(int i=0;i<3;i++)
      {
    	  for(int j=0;j<3;j++)
    	  {
    		 columnsum=columnsum + arr[j][i]; 
    	  }
    	  System.out.println(i +"column sum: "+columnsum);
    	  columnsum=0;
      }
        System.out.println();
	  System.out.println("Sum of each element of every row");
      for(int i=0;i<3;i++)
      {
    	  for(int j=0;j<3;j++)
    	  {
    		 rowsum=rowsum + arr[i][j]; 
    	  }
    	  System.out.println(i +"row sum: "+rowsum);
    	  rowsum=0;
      }
     
      
	}

}
