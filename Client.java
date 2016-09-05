import java.io.*;
import java.net.*;
class Client
{
	public static void main(String []ar)throws IOException
	{
	Socket s=new Socket("169.254.28.216",8080);
	BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
	BufferedReader kb=new BufferedReader(new InputStreamReader(System.in));
	DataOutputStream dos=new DataOutputStream(s.getOutputStream());
	String str,str2;
	while(!(str=kb.readLine()).equals("bye"))
	{	
	dos.writeBytes(str+"\n");
	str2 = br.readLine();
	System.out.println("sent by server: "+str);
	}
	kb.close();
	br.close();
	dos.close();
	s.close();
	}
}