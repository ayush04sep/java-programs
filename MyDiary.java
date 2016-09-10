import java.io.*;
class MyDiary
{
	public static void main(String []ar) throws IOException
	{
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);

	while(true)
	{
	System.out.println("\n\n\t**************************************************");
	System.out.println("\n\t*WELCOME TO PASSWORD PROTECTED PERSONAL DIARY*");
	System.out.println("\n\n\t**************************************************");
	System.out.println("\n\n\t HERE IS THE MAIN MENU");
	System.out.println("\n\t[1]\tADD RECORD");
	System.out.println("\n\t[2]\tVIEW RECORD");
	System.out.println("\n\t[3]\tEDIT RECORD");
	System.out.println("\n\t[4]\tDELETE RECORD");
	System.out.println("\n\t[5]\tEDIT PASSWORD");
	System.out.println("\n\t[6]\tEXIT");

	System.out.println("\n\tENTER YOUR CHOICE:");
	int choice = Integer.parseInt(br.readLine());
	
	switch(choice)
		{
		case 1:
			addrecord();
			break;
		case 2:
			viewrecord();
			break;
		case 3:
			editrecord();
			break;
		case 4:
			deleterecord();
			break;
		case 5:
			editpassword();
			break;	
		case 6:
			System.out.println("\n\nTHANKS FOR USING SOFTWARE BY\nAYUSHRASTOGI\nAYUSHSAXENA\nGURSIMRAN KAUR SONDI");
			return;
			
		default :
			System.out.println("\n\nYOU ENTERED WRONG CHOICE\n PLEASE TRY AGAIN");
			System.out.println("\npress any key");
			//getch();
		} //switch
	
	} //while
	
	}// main function 

public static int password()
{
return 0;
}


public static void addrecord()
{

}



public static void viewrecord()
{
}



public static void editrecord()
{
}



public static void deleterecord()
{
}



public static void editpassword()
{
}


} //class