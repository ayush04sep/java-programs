import java.io.*;
class Newdir
{
	public static void main(String []ar)throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter the file name: ");
	String file=br.readLine();
	File f=new File(file);
	if(f.exists())
		System.out.println("file name already exist");
	else
	{
		f.mkdir();
	//String pth=f.getPath();
	//System.out.println("path is : "+pth);
	
	File f1=new File(f.getName());
	String name=f1.getName(); 
	//System.out.println("file name is : "+name);
	String fpath=file+"\\"+name+".txt";
	FileOutputStream fos=new FileOutputStream(fpath);
	System.out.println("enter the text content u want to write in file(press @ for exit): ");
	char ch; int count=0;
	DataInputStream dis=new DataInputStream(System.in);
		while((ch=(char)dis.read())!='@')
		{
		fos.write((char)ch);
		if(ch!=' ')
		count++;
		}
	System.out.println("operation complete");
	System.out.println("number of character in file is: "+count);
	}
	fos.close();
	br.close();
	dis.close();
	}
}