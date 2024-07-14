import java.lang.*; import java.io.*; import java.util.*;

class common
{
boolean flag=false;
String str;

public synchronized void produce() throws Exception
{
if(flag==false)
{
Scanner sc=new Scanner(System.in); System.out.println("enter the string"); str=sc.next();
flag=true;
notify();
}
else
wait();
 }

public synchronized void consume() throws Exception
{
if(flag==true)
{
System.out.println("the produced string by producer is : "+str);
flag=false;
notify();
} 
else

}
}


 

wait(); 




class producer extends Thread
{
common c;
producer(common c)
   {
    this.c=c;
     }

public void run()
{
try
{
c.produce();
}catch(Exception e){}
}
}

class consumer extends Thread
{
common c;
consumer(common c)
{    this.c=c;  }
public void run()
{
try
{ c.consume();  }
catch(Exception e){}
}
}


public class pc
{
public static void main(String args[]) throws Exception
{
common c=new  common(); producer p=new producer(c); consumer co=new consumer(c); p.start();
co.start();
}
}


// Enumeration Program

public class DayOfWeek{
    public enum Day 
  {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY 
  }
    Day day;
    public DayOfWeek(Day day) 
   {
    this.day = day;
    System.out.println(day);
    }






    public boolean isWorkday()
{  
        if ((day == Day.MONDAY)||(Day.TUESDAY==day)||(day==Day.WEDNESDAY) || 
             (day==Day.THURSDAY) || (day==Day.FRIDAY)) 
        return true;
        else
        return false;
    }

    public static void main(String[] args) 
  {
        DayOfWeek firstDay = new DayOfWeek(Day.FRIDAY);
        boolean a =firstDay.isWorkday();
        System.out.println("returned value is "+ a);
        DayOfWeek sixthDay = new DayOfWeek(Day.SUNDAY);
        boolean b=sixthDay.isWorkday();
        System.out.println("returned value is "+ b);
      }
  }
