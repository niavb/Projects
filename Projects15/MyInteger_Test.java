package projects15;

public class MyInteger_Test {

	public static void main(String[] args) {
		MyInteger i = new MyInteger(6);
		MyInteger g = new MyInteger(6);
		System.out.println(i.getValue());
		System.out.println(i.equals(17));
		System.out.println(i.isEven());
		System.out.println(i.isOdd());
		System.out.println();
		System.out.println(MyInteger.isPrime(5));
		System.out.println(MyInteger.isEven(5));
		System.out.println(MyInteger.isOdd(5));
		System.out.println();
		System.out.println(MyInteger.isPrime(i));
		System.out.println(MyInteger.isEven(i));
		System.out.println(MyInteger.isOdd(i));
		System.out.println();
		System.out.println(i.equals(g));

	}

}
