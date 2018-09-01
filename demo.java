public class demo{
	public static void main(String args[]){
		java.util.Scanner scan=new java.util.Scanner(System.in);
			System.out.println("Enter the number of items.");
			int n=scan.nextInt();
			int[] w=new int[n];
			int[] val=new int[n];
			
			System.out.println("Enter  knapSack capacity");
			int W=scan.nextInt();
			
			System.out.println("Enter the weight of the elements and the corresponding values"); 
			
			for(int i=0;i<n;i++)
			{	w[i]=scan.nextInt();
				val[i]=scan.nextInt();	
			}
			
			System.out.println("Maximum Value of the Knack Sack is :"+knapSack.run(W,w,val,n));
		}
	}