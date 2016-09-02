import java.util.Scanner;
class Ayush6
{ 
 public static boolean neon(int n)
{
	int s=0;
	for(int i=1;i<=n;n/=10)
	{
	int n1=n%10;
	s+=n1; 
	}
	if(n==s)
	return (true);
	else
	return(false);
}
 public static void main(String []ar)
  {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter any number : ");
	int n=sc.nextInt();
	if(neon(n));
	System.out.println("Given no is neon");
	
  }
}
	
	
	