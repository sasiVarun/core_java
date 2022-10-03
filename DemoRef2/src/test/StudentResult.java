package test;

public class StudentResult {
	public String result;
	public float per;
	

	public void calcualte(int totMarks, int p) {

		per = (float) totMarks / 6; // TypeCasting

		if (p == 1) {
			result = "Fail";
		} else if (per >= 70 && per <= 100) {
			result = "Distinction";
		} else if (per >= 60 && per < 70) {
			result = "First Class";
		} else if (per >= 50 && per < 60) {
			result = "Second Class";
		} else if (per >= 35 && per < 50) {
			result = "Second Class";
		} else {
			result = "Fail";
		}
	}

	public void getStudentResult() {
		System.out.println("===== Student Result ======");
		System.out.println("Percentage: " + per + "%");
		System.out.printf("Result: " + result);
	}

}
