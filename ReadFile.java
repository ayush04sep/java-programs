import java.io.*;
class FileTrnsfr
{
	public static void main(string []ar)throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String src,dst;
	src=br.readLine();
	FileInputStream fis=new FileInputStream(src);
	dst=br.readLine();
	FileOutputStream fos=new FileOutputStream(dst);
	int a;
	while((a=fis.read())!=-1)
	fos.write(a);
	System.out.println("operation completed ");
	fis.close();
	fos.close();
	br.close();
	}
}