package projects16;

public class Course {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	
	public Course(String courseName) {
		this.setCourseName(courseName);
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		for(int i=0; i < 100 ; i++) {
			if(students[i]==null) {
				students[i] = student;
				break;
			}else {
				continue;
			}
		}
	}
	
	public void dropStudent(String student) {
		int index = 0;
		for(int i = 0; i < getNumberOfStudents(); i++) {
			if (students[i] == student) {
	            index = i;
	            break;
	        }
		}
		for(int i = index; i < getNumberOfStudents()-1; i++){    
            students[i] = students[i+1];  
        }  
	    students[getNumberOfStudents()-1]=null;
		
	}

	public int getNumberOfStudents() {
		numberOfStudents=0;
		for(int i=0; i < 100 ; i++) {
			if(students[i]!=null) {
				numberOfStudents++;
			}
		}
		return numberOfStudents;
	}

	public String[] getStudents() {
		return students;
	}

	
	

}
