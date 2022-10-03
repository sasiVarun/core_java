package test;

public class Greater implements IComparable{
	
	public int compare(int x, int y) {
		if(x>y) return x;
		else return y;
	}

}