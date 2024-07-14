import java.util.*;
class Q7
{
public static void main(String args[]) 
{ 
LinkedList ll = new LinkedList();
ll.add("F"); ll.add("B"); ll.add("D"); ll.add("E"); ll.add("C"); ll.addLast("Z"); ll.addFirst("A"); ll.add(1, "A2");
System.out.println("Original contents of linked list: " + ll);
System.out.println("Index of first element " + ll.indexOf("A"));

ll.remove("F");
ll.remove(2);
System.out.println("Contents of linked list after deletion: " + ll);

ll.removeFirst();
ll.removeLast();
System.out.println("linked list after deleting first and last: " + ll);

// get and set a value 
Object val = ll.get(2); ll.set(2, "omega");
System.out.println("linked List after change: " + ll);
}
}
