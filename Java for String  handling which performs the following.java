// i)

public class StringBuf
{
    public static void main(String args[ ] )
    {
        StringBuffer buffer1 = new StringBuffer( ) ;
        StringBuffer buffer2 = new StringBuffer(50) ;
        StringBuffer buffer3 = new StringBuffer("hello") ;
        System.out.println("buffer1 capacity: " + buffer1.capacity()); 
        System.out.println("buffer2 capacity: " + buffer2.capacity()); 
        System.out.println("buffer3 capacity: " + buffer3.capacity()); 

        System.out.println("\nbuffer1 length: " + buffer1.length()); 
        System.out.println("buffer2 length: " + buffer2.length()); 
        System.out.println("buffer3 length: " + buffer3.length()); 
        buffer3.ensureCapacity(150);
        System.out.println("After modifying buffer3 capacity: " + buffer3.capacity()); 
    }
}



// ii)	And  iii) 



import java.util.Scanner;
class Two_a
{
   public static void main(String args[])
   {
      String original, reverse = "appnd”;
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a string to reverse : ");
      original = in.nextLine();
      int length = original.length();
      for ( int i = length - 1 ; i >= 0 ; i-- )
       reverse = reverse + original.charAt(i);
       System.out.println("Reverse of entered string is: "+reverse);
       System.out.println("String in Upper case: "+reverse.toUpperCase());
       System.out.println("Enter a string to appends: ");
       appnd = in.nextLine();
       System.out.println("After Appending: "+reverse.toUpperCase().concat(appnd));
   }
}
