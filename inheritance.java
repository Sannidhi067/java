class Parent
{
int x; 
Parent(int a)
{
x=a;
}

void displayx()
{
System.out.println("\n Value of i : " +x);
}
}


class Child extends Parent
{
int y;
Child(int a,int b)
{
super(a);
y=b;
}
void displayxy()
{
System.out.println("\n Value of a : " +x); 

System.out.println("\n Value of b : " +y);
}
}

class Inheritance
{
public static void main(String args[])
{
Parent ob1=new Parent(10); 
Child  ob2=new Child(20,30);
System.out.println("\n Contents of Parent or Super Class Object : ");
ob1.displayx();
System.out.println("\n Contents of Child Class Object : ");
ob2.displayxy();
}
}
