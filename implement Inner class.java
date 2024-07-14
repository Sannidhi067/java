class Outer
{
int x=100; int y=10; void test()
{
Inner ob1=new Inner();
ob1.display();
}
class Inner
{
int z; Inner()
{
y=90;
z=60;
}
 
void display()
{
 


System.out.println("Display : x = " +x);
 
System.out.println("Display : y =" +y); System.out.println("Display : z = " +z);
}
}//Inner class closes here
 
void show()
{
      System.out.println("Display : x = " +x);

System.out.println("Display : y = " +y);
//   System.out.println("Display : z = " +z);
}
}//outer class closes here


class Q1b
{
public static void main(String args[])
{
Outer ob1=new Outer();
ob1.test();
       ob1.show();
}
}
