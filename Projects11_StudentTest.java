package projects11;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student[] students = new Student[5];
		
		for(int i=0; i<5; i++) {
			System.out.println("Въведете име/успех: ");
			String name = sc.nextLine();
			double uspeh = sc.nextDouble();
			sc.nextLine();
			students[i] = new Student(name, uspeh);
		}
		
		studentsWithStipendia(students);
		
		sc.close();

	}
	
	public static boolean hasStipendia(Student student) {
		return student.uspeh >= 5.50;
	}
	
	public static void studentsWithStipendia(Student students[]) {
		System.out.println("Учениците със стипендия са: ");
		for(int i=0; i < students.length; i++) {
			if(hasStipendia(students[i])) {
				System.out.println(students[i].name);
			}
		}
	}

}
