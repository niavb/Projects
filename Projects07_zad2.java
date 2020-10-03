package projects07;

public class Projects07_zad2 {

	public static void main(String[] args) {
		double uniTuition = 10000;
		
		for(int i=0; i<10; i++) {
			uniTuition = uniTuition + (6.00/100)*uniTuition;
			System.out.println("Tuition after " + (i+1) + " years: " + Math.ceil(uniTuition));
		}
		
		
		double totalTuition = 0;
		
		for(int i=0; i<4; i++) {
			uniTuition = uniTuition + (6.00/100)*uniTuition;
			totalTuition += uniTuition;
		}
		
		System.out.println("The total cost of four years’ worth of tuition after the tenth year: " + Math.ceil(totalTuition));
		

	}

}
