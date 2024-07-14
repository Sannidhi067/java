import java.io.*;
public class q8
{
public static void main(String[] args)
{
try{
int count=0;
  FileInputStream fis=new FileInputStream("/abc.txt");
   int avail=fis.available();
   byte[] b=new byte[avail]; 
   int done=fis.read(b);     System.out.println("File Contents"); for(byte a:b)
{
Char  i=(char)a; System.out.print((char)a+"");
}
FileOutputStream fos=new FileOutputstream(“/xyz.txt”);
fos.write(b);
}
catch(Exception e){}
}
}
