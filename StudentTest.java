package projects11;

import java.util.Scanner;

public class StudentTest {
	
	public static boolean hasStipendia(Student A) {
		boolean hasStipendia = false;
		if(A.uspeh >= 5.50) {
			hasStipendia = true;
		}
		return hasStipendia;
	}
	
	public static void studentsWithStipendia(Student[] students) {
		System.out.println("��������� ��� ��������� ��: ");
		for(int i=0; i < students.length; i++) {
			if(hasStipendia(students[i])) {
				System.out.println(students[i].name);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student[] students = new Student[5];
		
		for(int i=0; i<5; i++) {
			students[i] = new Student();
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("�������� ���/�����: ");
			students[i].StudentData(sc.next(), sc.nextDouble());
		}
		
		studentsWithStipendia(students);
		
		sc.close();

	}

}
