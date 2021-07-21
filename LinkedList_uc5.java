package LinkedList_Problems;
import java.util.LinkedList;

public class LinkedList_uc5 {
	public static void main(String[] args) {
	
		LinkedList<Integer> LinkList = new LinkedList<Integer>();

		LinkList.add(56);
		LinkList.add(70);
		LinkList.add(1, 30);

		
		System.out.println("Initiall LinkedList  " + LinkList);

	
		System.out.println("Deleting element from the LinkedList = " + LinkList.pop());

	
		System.out.println("Final LinkedList : " + LinkList);
	}

}


