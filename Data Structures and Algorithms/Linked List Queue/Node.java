package llistqueue;

/**
 * 
 * This defines a single node used in a Singly Linked List.
 * M Madden, M Schukat, 2005 - 2015
 *
 */
public class Node 
{
   // Instance variables:
   private Object element;
   private Node next;

   /** Creates a node with null references to its element and next node. */
   public Node() {
     this(null, null);
   }

   /** Creates a node with the given element and next node. */
   public Node(Object e, Node n) {
     element = e;
     next = n;
   }
   
   // Accessor methods:
   public Object getElement() {
     return element;
   }
   public Node getNext() {
     return next;
   }

   // Modifier methods:
   public void setElement(Object newElem) {
     element = newElem;
   }
   public void setNext(Node newNext) {
     next = newNext;
   }
}

