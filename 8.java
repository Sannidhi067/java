class Account
{
int bal=500;
void deposit(int amt)
{
bal+=amt;
}






void withdraw(int amt)
{
if ((bal-amt)<=500)
{
try
     {
        throw new LessBalanceException(amt);
    }catch (LessBalanceException e1)
     {  
     }
 }
else
bal-=amt;
}
}




class LessBalanceException extends Exception
{

LessBalanceException(int amt)
{
System.out.println("Withdrawing of "+amt+"  not possible");
}
}





public class Q3 {
public static void main(String[] args)
{
Account ob1=new Account(); 
Account ob2=new Account(); 
ob1.deposit(200); 
ob2.deposit(200);
ob2.withdraw(300);
ob2.withdraw(100);
System.out.println("Current Balance for ob1 = "+ob1.bal); 
System.out.println("Current Balance for ob2 = "+ob2.bal);
}
}

