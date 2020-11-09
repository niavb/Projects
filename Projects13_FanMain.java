package projects13;

public class FanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Íàïèøåòå òåñòîâà ïðîãðàìà, êîÿòî ñúçäàâà äâà îáåêòà îò êëàñà Fan. 
//		Çàäàéòå ìàêñèìàëíà ñêîðîñò, ðàäèóñ 10, öâÿò æúëò, è âêëþ÷åòå ïúðâèÿ îáåêò. 
//		Çàäàéòå ñðåäíà ñêîðîñò, ðàäèóñ 5, öâÿò ñèí è èçêëþ÷åòå âòîðèÿ îáåêò. 
//		Èçâåäåòå îáåêòèòå â êîíçîëàòà, êàòî èçâèêàòå ìåòîäà toString.

		
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
