import java.util.Scanner;
class Ayush5
{ 
 public static int sumEven(int n1,int n2)
 { 
	int sume=0;
	for(int i=n1;i<n2;++i)
	{
		if(i%2==0)
		sume+=i;		
 	}
	return(sume);
 }
 public static int sumOdd(int n1,int n2)
{
	int sumo=0;
	for(int i=n1;i<n2;++i)
	{
		if(i%2!=0)
		sumo+=i;		
 	}
	return(sumo);
}
 public static void main(String []ar)
  {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the lower limit:");
	int n1=sc.nextInt();
	System.out.println("enter the upper limit:");
	int n2=sc.nextInt();

	System.out.println("even numbers between limit is: ");
	for(int i=n1;i<n2;++i)
	{
	if(i%2==0)
	System.out.println(i);
	}
	System.out.println("odd numbers between limit is: ");
	for(int i=n1;i<n2;++i)
	{
	if(i%2!=0)
	System.out.println(i);
	}
	System.out.println("sum of even no. between limit is: "+sumEven(n1,n2));
	System.out.println("sum of odd no. between limit is: "+sumOdd(n1,n2));
  }
}
	
	
	