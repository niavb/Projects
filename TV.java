package projects10;

public class TV {
	public int channel;
	public int volumeLevel;
	public boolean on;
	
	public TV(){
		channel = 1;
		volumeLevel = 0;
		on = false;
	}
	
	public void turnOn(){
		on = true;
		System.out.println("The TV is on.");
	}
	
	public void turnOff(){
		on = false;
		System.out.println("The TV is off.");
	}
	
	public void setChannel(int newChannel){
		if(!on){
			System.out.println("The TV is off.");
			return;
		}
		channel = newChannel;
		System.out.println("The channel is set to " + newChannel);
	}

}
