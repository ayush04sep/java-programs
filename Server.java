import java.io.*;
import java.net.*;
class Client
{
	public staic void main(String []ar)throws IOException
	{
	Socket s=new Socket("local host",444);
	BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
	BufferedReader kb=new BufferedReader(new InputStreamReader(System.in));
	DataOutputStream dos=new DataOutputStream(s.getOutputStream());
	String str,str2;
	while(!(str=kb.readline().equals("bye"))
	{	
	dos.writeByte(str+"\n");
	str2 = br.readLine();
	System.out.println(()"snet by server: "+str);
	}
	kb.close();
	br.close();
	dos.close();
	s.close();
	}
}