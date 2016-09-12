import java.io.*;
class Fileprop2
{
	public static void main(String []ar)throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String file;
	System.out.println("enter the file name: ");
	file= br.readLine();
	File f=new File(file);
	System.out.println();
	if(f.exists())
	{
	String ar[]=f.lis(); //extract filefrom folder
	System.out.print("totalfiles:"+arr.length());
	for(Sring str:arr) //for each loop
	System.out.println(str);
	/*System.out.println("file name:"+f.getname());
	System.out.println("file path:"+f.getpath());
	System.out.println("file length:"+f.lenght());
	System.out.println("file check:"+f.isFile());
	System.out.println("folder check:"+f.isDirectory());
	}*/
	else
	System.out.println("Invalid file name or path");
	}
}