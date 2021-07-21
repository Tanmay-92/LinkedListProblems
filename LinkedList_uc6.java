package LinkedList_Problems;
import java.util.LinkedList;
public class LinkedList_uc6 {
	
	
	public static void main(String[] args) {
		LinkedList<Integer> LinkList = new LinkedList<Integer>();

		
		LinkList.add(56);
		LinkList.add(70);
		LinkList.add(1, 30);

		System.out.println("Initial LinkedList  " + LinkList);

		System.out.println("Removing the last element in the LinkedList : " + LinkList.removeLast());

		System.out.println("Final LinkedList : " + LinkList);
	}

}
