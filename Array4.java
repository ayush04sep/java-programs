import java,util,*;
class Array5
{
	public static void main(String []ar)
	{
	scanner sc=new Scanner (System.in);
	system.out.println("enter the size of array: ");
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("enter the array elements: ");
	for(int i=0;i<n;i++)
		a[i]=new int[n];
	for(i=0;i<a.length;i++)
	{
		for(j=0;j<=i;j++)
		{
		System.out.print(a[j]);
		}
	System.out.println();
	}
	}
}