package projects19;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person one = new Person("James", "0896774791", "Street 11", "idk@gmail.com");
		Student student = new Student("Anna", "08888888", "Street 12", "idk2@gmail.com", Student.FRESHMAN);
		Employee employee = new Employee("Anakin", "022222222", "Street 13", "idk3@gmail.com", "Office 23", 500);
		Faculty faculty = new Faculty("Yoda", "03333333", "Street 14", "idk4@gmail.com", "Office 44", 200, 4, "Sekretar");
		Staff staff = new Staff("Mozart", "04444444", "Street 15", "idk5@gmail.com", "Office 55", 200, "chef");
		System.out.println(one.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());
				

	}

}
