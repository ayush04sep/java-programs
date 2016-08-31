import java.util.*;
class Array7
{
	public static void main(String []ar)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the lenght of patter: ");
	int n = sc.nextInt();
	for(int i=0;i<n;i++)
	 {
		for(int j=i;j<n;j++)
		{
		System.out.print("*");
		}
	  System.out.println();
	 }
	}
}