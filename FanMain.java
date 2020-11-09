package projects13;

public class FanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Напишете тестова програма, която създава два обекта от класа Fan. 
//		Задайте максимална скорост, радиус 10, цвят жълт, и включете първия обект. 
//		Задайте средна скорост, радиус 5, цвят син и изключете втория обект. 
//		Изведете обектите в конзолата, като извикате метода toString.

		
		Fan fan1 = new Fan();
		Fan fan2 = new Fan();
		
		fan1.setSpeed(fan1.FAST);
		fan1.setRadius(10);
		fan1.setColor("Yellow");
		fan1.setSwitchedOn(true);
		System.out.println(fan1.toString());
		
		fan2.setSpeed(fan1.MEDIUM);
		fan2.setSwitchedOn(false);
		System.out.println(fan2.toString());

	}

}
