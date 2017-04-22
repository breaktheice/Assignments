import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

public class MidElement {

	public static void main(String args[]){
		List<Integer> myList = new LinkedList<>();
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(5);
		myList.add(6);
		myList.add(7);
		myList.add(6);
		myList.add(9);

		System.out.println(getMidElement(myList));
		
	}
	
	public static Integer getMidElement(List<Integer> myList){
		int count = (myList.size() + 1) / 2;
		Iterator<Integer> itr = myList.iterator();
		Integer middle = 0;
		while(count!=0){
			middle = itr.next();
			count--;
		}
		return middle;
	}
	
}
