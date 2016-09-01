//program to enter id name and salaray and print them
import java.io.*;
class Ayush2
{
public static void main(String []ar)ThrowsIOException
{
 InputstreamReader isr=new InputstreamReader(System.in);
 BufferReader br=new BufferReader(isr);
 System.out.println("enter the id name and salary of an employee: ");
 int id=Integer.parseInt(br.readLine());
 string name=br.readLine();
 double sal=Double.parseInt(readLine());
 System.out.println("the id is:"+id);
 System.out.println("the name is:"+name);
 System.out.println("the salary is:"+sal);
}
}