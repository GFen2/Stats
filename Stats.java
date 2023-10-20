package garyfenton;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;

public class Stats {

	public static String text;
	public static void main(String[]args) throws IOException {
	
		
		JFileChooser j = new JFileChooser();
		j.showSaveDialog(null);
	
		File str = j.getSelectedFile(); //converts chosen file to File str
		readUsingFileReader(str); //converts File str to string
		String[] arr = readUsingFileReader(str).split(","); //creates an array from the input values separated by commas
		assert arr.length>0: "empty file";
		int[] arr2= new int [arr.length];
		int length = arr.length;
		double stdev = 0;
		
		for(int i= 0; i < arr.length;i++) {
			if(arr[i].matches("[1-999]") == false) {
				System.out.println(i + " is not a recognized input"); //inputs bounded by 1-999
			}
			arr2[i] = Integer.parseInt(arr[i]); //parses the string inputs to int values
			
			
		}
		
//---------------------------------------------------------
		LinkedList LL = new LinkedList();
		
		LNode head= new LNode(arr2[0]); //designates head
		
		for (int i = 1; i < arr.length; i++) {
			LL.insert(head, arr2[i]); //fills Linked List with values from int array
		}
		
		double mean = LL.add(head, 0)/length; //calcs mean
		stdev = (LL.Calcstdev(head, stdev, mean)/length); //calcs stdev
		System.out.println("The mean is " + mean + " and the stdev is " + stdev);
		
		
				
		
		
	}
	
	private static String readUsingFileReader(File str)
	        throws IOException
	    {
			
	        FileReader fr = new FileReader(str);
	        BufferedReader br = new BufferedReader(fr);
	        String line;
	       
	        while ((line = br.readLine()) != null) {
	         
	            text = line;
	           
	        }
	        br.close();
	        fr.close();
	        return text;
	    }
	 
	

}
