import java.io.*;
class FileRead
{
	public static void main(String []ar)throws IOException
	{
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	//FileOutputStream fos = new FileOutputStream("e:\\java programs\\ayush.txt",true);
	string file;
	System.out.println("enter the file name: ");
	file= br.readLine();
	FileInputStream fis = new FileInputStream(file);
	int a;
	while((a = fis.read())!=-1)
	{
	System.out.print((char)a);
	System.out.println();
	System.out.println("file reading completed");
	}
	//System.out.println("writing operation finished");
	fis.close();
	br.close();
	}
}