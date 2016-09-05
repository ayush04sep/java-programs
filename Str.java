import java.io.*;
class Str
{
public static void main(String []ar)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter any string- yes or no");
String s=br.readLine();
switch(s)
{
case "yes": {System.out.println("choice: yes");
	break;}
case "no": System.out.println("choice : no");
}
}

}