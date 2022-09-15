package hello;

public class Primelimit {

	public static void main(String[] args) {
		int i,j,c;
		for(i=1;i<=100;i++)
			{
			c=0;
			for(j=2;j<=i/2;j++)
			{
	 if(i%j==0){
			c++;
			break;
			}
		}
			
    if(c==0 && i!=1) 
    {
    	System.out.println(i);
    }}}}
