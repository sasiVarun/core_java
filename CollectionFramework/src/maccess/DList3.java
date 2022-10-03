package maccess;
import java.util.Iterator;
import java.util.Vector;
public class DList3 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.addElement(new Integer(21));
		v.addElement(new Integer(28));
		v.addElement(new Integer(02));
		
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
//		System.out.println(v.toString());
//		System.out.println("First ELement: "+ v.firstElement());
//		System.out.println("Last ELement: "+ v.lastElement());
//		System.out.println("Element At index 1:" + v.elementAt(1));
//		v.insertElementAt(new Integer(500), 2);
//		System.out.println(v.toString());
//		v.setElementAt(new Integer(6), 2);
//		System.out.println(v.toString());
//		v.forEach(System.out::println);
	}

}
