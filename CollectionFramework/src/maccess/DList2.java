package maccess;
import java.util.*;
public class DList2 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>(); // AraayList object holding Unlimited Integer Objects
		
		al.add(new Integer(21));
		al.add(new Integer(28));
		al.add(new Integer(02));
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		
//		System.out.println(al.toString());
//		al.add(3, 9);
//		System.out.println(al.toString());
//		al.remove(4);
//		System.out.println(al.toString());
//		al.add(10);
//		al.containsAll(al);
		
	}
}
