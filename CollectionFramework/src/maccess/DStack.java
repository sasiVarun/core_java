package maccess;
import java.util.*;
public class DStack {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		st.push(21);
		st.push(28);
		st.push(32);
		
		System.out.println(st.toString());
		System.out.println(st.peek());
	}
}
