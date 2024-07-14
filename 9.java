import java.util.Scanner;

class ExcQueue extends Exception 
{
     ExcQueue(String s) 
    {
         super(s);
     }
  }

class Queue
 {
     int front,rear;
      int q[ ]=new int[10];

     Queue() 
    {
         rear=-1;
         front=-1;
      }

    void enqueue(int n) throws ExcQueue 
    {
            if (rear==9) throw new ExcQueue("Queue is full");
            rear++;
            q[rear]=n;
          if (front==-1)   front=0;
    }

int dequeue() throws ExcQueue 
{
       if (front==-1) throw new ExcQueue("Queue is empty");
       int temp=q[front];
        if (front==rear)
              front=rear=-1;
        else
               front++;
       return(temp);
     }
} //Class closes here


  class UseQueue
 {
       public static void main(String args[ ]) 
      {
            Queue a=new Queue();
            try 
          {
              a.enqueue(5);
              a.enqueue(20);
             }
             catch (ExcQueue e) 
            {
                System.out.println(e.getMessage());
           }


             try 
            {
                 System.out.println(a.dequeue());
                 System.out.println(a.dequeue());
                 System.out.println(a.dequeue());
              }
              catch(ExcQueue e) 
            {
                  System.out.println(e.getMessage());
            }
      }
}

