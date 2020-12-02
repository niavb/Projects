package projects15;

public class MyPoint_Test {

	public static void main(String[] args) {
		MyPoint A = new MyPoint(2, 3);
		MyPoint B = new MyPoint(4, 5);
		System.out.println(MyPoint.Distance(A, B));
		System.out.println(A.Distance(4, 5));
		System.out.println(B.Distance(2, 3));
		System.out.println(A.Distance(B));
		
		

	}

}
