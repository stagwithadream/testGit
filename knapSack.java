public class knapSack{
	public static int max(int a,int b)
	{return (a>b)? a:b ;}
	
	public static int run(int W,int[] w,int[] val,int n){
			if(n==0||W==0){return 0;} //base case;//case 1
			
			if(w[n-1]>W){return run(W,w,val,n-1);} //case 2
			
			else{
				
			return max(val[n-1]+run(W-w[n-1],w,val,n-1),run(W,w,val,n-1));}
			
		}
}