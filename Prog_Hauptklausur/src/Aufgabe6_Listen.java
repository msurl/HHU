public class Aufgabe6_Listen {
	
    /*
     *  a) Wenn Datenstruktur dynamisch sein soll, da ein Array nach Übergabe von x Parametern statisch ist.
     * Werte können verändert werden, nur länge ist statisch.
     * b) kenne immer nur den nachfolger
     */ 
	
    public class LinkedList {
        public Node head = null;

        public void insertatEnd(Node nd) {
        	Node current = head;
        	

        	while(current.next != null){
        		current = current.next;
        	}
        		Node newNode = nd;
        		newNode.next = null; // der nachfolger des neuen nodes g
        		current.next = newNode;
        	
        }
    }


    public class Node {


        public int  element;
        public Node next; //Klasse hat objekt von sich selbst als "next"
    }
    }


//~ Formatted by Jindent --- http://www.jindent.com
