import java.util.Scanner;
class Ayush3
{
 public static boolean isPrime(int a)
 { 
  	for(int i=2;i<=a/2;++i)
	{
	if(a%i==0)
	 return false;
	}
	return true;
 }
 public static void main(String []ar)
  {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter any number:");
	int a=sc.nextInt();

	if(isPrime(a))
	 System.out.println("entered no. is prime");
	else
	 System.out.println("entered no. is not prime");

  }
}
	
	
	