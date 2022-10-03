package maccess;
import java.util.*;
import java.util.Map.Entry;
public class DMap {
	public static void main(String[] args) {
		Map<Integer,String> mp = new HashMap<>();
		mp.put(100, "Sam");
		mp.put(101, "David");
		mp.put(102, "Rahul");
		mp.put(103, "Bala");
		
		Set set = mp.entrySet();
		Iterator it = set.iterator();
		
//		while(it.hasNext()) {
//			Map.Entry entry = (Entry) it.next();
//			System.out.println(entry.getKey() + " " + entry.getValue());
//		}
		
		/*
		 * for(Entry<Integer,String> entry: mp.entrySet()) {
		 * System.out.println(entry.getKey() + " " + entry.getValue()); }
		 */
		
		System.out.println(mp.toString());
		System.out.println("-----------------------------------");
		mp.entrySet().iterator().forEachRemaining(System.out::println);
		System.out.println("-----------------------------------");
		mp.entrySet().iterator().forEachRemaining(E -> System.out.println(E.getKey() + "--->" + E.getValue()));
		System.out.println("-----------------------------------");
		mp.entrySet().stream().forEach(e -> System.out.println(e.getKey() + "--->" + e.getValue()));
		System.out.println("-----------------------------------");
		mp.entrySet().stream().forEach(System.out::println);
	}

}
