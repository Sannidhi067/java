import java.util.*;

interface mystackinterface
{
void push(int a);
int pop();
boolean isempty();
}


class fixedstack implements mystackinterface
{
int  top;
int st[]; 

fixedstack()
{
top=-1;
st=new int[10];
}


public boolean isempty()
{
if (top==-1)
return true;
else
return false;
}


public void push(int a)
{
if(top!=9)
{
st[++top] =a;
System.out.println(a+" Added to FIXED LENGTH STACK");
}
else
System.out.println("Fixed Length Stack full");
}


public int pop()
{
return st[top--];
}
}




class dynamictack implements mystackinterface
{
int top; ArrayList st; 

dynamictack()
{
top=-1;
st=new ArrayList();
}


public boolean isempty()
{
if (top==-1)
return true;
else
return false;
}


public void push(int a)
{
top++;
st.add(a);
}


public int pop()
{
Integer ob=(Integer)st.remove(top--);
return ob.intValue();
}
}




public class mystackimpl
{
public static void main(String[] args)
{
mystackinterface fstk=new fixedstack();
mystackinterface dstk=new dynamictack();

   for(int i=0;i<15;i++)
fstk.push(i);

for(int i=0;i<15;i++)
if(!fstk.isempty())
System.out.println("Top Element of Fixed Length Stack : "+fstk.pop());
else
System.out.println("FIXED LENGTH STACK IS EMPTY");

for(int i=0;i<15;i++)
{
dstk.push(i);
System.out.println(i+" Added to Dynamic LENGTH STACK");
}

for (int i = 0; i < 15; i++)
if(!dstk.isempty())
System.out.println("Top Element of Dynamic Length Stack : "+dstk.pop());
else
System.out.println("Dynamic LENGTH STACK IS EMPTY");
}
}
