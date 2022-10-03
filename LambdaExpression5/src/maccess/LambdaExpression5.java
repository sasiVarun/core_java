package maccess;
import java.io.PrintStream;
import java.util.*;
import java.util.function.Consumer;
public class LambdaExpression5 {

	public static void main(String[] args) {
		Integer a[] = {12,13,14,15,16};//Integer Array
		System.out.println("===Display using forEachRemaining()===");
		Spliterator<Integer> sp = Arrays.spliterator(a); //Factory Method
		sp.forEachRemaining((k) -> {
			System.out.print(k + " ");
		});//Passing Lambda Expression as Method Argument to forEachRemaining method
		/*
		 * Consumer con = (k)-> System.out.print(k+" "); sp.forEachRemaining(con); //above sp.forEachRemainign is equvalent to this
		 */		
	}

}