package maccess;
import java.util.*;
public class DSet2 {
	public static void main(String[] args) {
		HashSet<String> st = new HashSet<>();
		st.add("Sasi");
		st.add("Chinna");
		st.add("Maddi");
		st.add("Varun");		
		
		Iterator<String> it = st.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
				
	}
}
