package assignment;

public class AddMatrix {
		public static void main(String args[]){  
		//creating two matrices    
		int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
		int b[][]={{1,3,4},{2,4,3},{1,2,4}}; 
		System.out.println("the 1st matrix is:-");
		    for(int i=0;i<3;i++)
		    {
		    	for(int j=0;j<3;j++) {
		    		System.out.print(a[i][j]+" ");
		    	}
		    	System.out.println();
		    }
		 System.out.println("2nd matrix is:-"); 
		 for(int i=0;i<3;i++)
		    {
		    	for(int j=0;j<3;j++) {
		    		System.out.print(b[i][j]+" ");
		    	}
		    	System.out.println();
		    }
		//creating another matrix to store the sum of two matrices    
		int c[][]=new int[3][3];  //3 rows and 3 columns  
		    
		//adding and printing addition of 2 matrices  
		System.out.println("sum of the 2 mtrixes are:-");
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		c[i][j]=a[i][j]+b[i][j];    //use - for subtraction  
		System.out.print(c[i][j]+" ");    
		}    
		System.out.println();//new line    
		}    
		}
}
