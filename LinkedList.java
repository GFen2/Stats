package garyfenton;
import java.util.*;
public class LinkedList {
LNode head;
LNode next;
int total = 0;
	public LinkedList() {
		head = null;
	}

//--------------------------------------------------------
	//inserts node given head and int data
	public void insert(LNode head, int data) {
		LNode node = new LNode(data);
		if(head == null) {
			head = node;
			head.next = null;
			
		}
		else { 
           
            LNode last = head; 
            while (last.next != null) { 
                last = last.next; 
            } 
   
           
            last.next = node; 
		}
	}
	//sums the nodes
	public double add(LNode head, double total) {
		
		if (head == null) {
		    return total;
		    
		    }
		    else {
		    
		    total = total + head.getData();
		 
		    return (add(head.next, total)); 
		    }
		
		
	}
	
	
	//finds squared difference of xi
	public double Calcstdev(LNode head, double error, double mean) 
	{
		
	    if (head == null) {
	    	 
	    return error; 
	    }
	    else {
	    error += Math.pow((head.getData()-mean), 2);
	    
	 
	    return(Calcstdev(head.next, error, mean)); 
	    }
	} 
}