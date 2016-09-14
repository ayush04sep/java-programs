import java,io,*;
class Fileproperty
{
	public static void main(String []ar)throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter the file name: ");
	String file =br.readLine();
	File f=new File(file);
	if(f.exists())
	{
	System.out.println("file name:"+f.getName());
	System.out.println("folder name:"+f.isDirectory());
	System.out.println("file path:"+f.getPath());
	System.out.println("file check:"+f.isfile());
	System.out.println("file length:"+f.Length());	
	}
	else
	System.out.println("invalid file or folder name ");
	}
}
