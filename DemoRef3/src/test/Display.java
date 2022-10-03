package test;

public class Display {
	public Product p = null; //Instance Variable
	
	public Display(Product p) {
		this.p = p;
	}
	
	public void disp() {//Without_Parameter
		p.getProduct(); 
	}

}
