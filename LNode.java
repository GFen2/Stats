package garyfenton;

public class LNode {
	
	int data;
	LNode next;
	
	public LNode(int data) {
		this.data = data;
		
		next = null;
	}
	
	public int getData(){
		return data;
	}

}
