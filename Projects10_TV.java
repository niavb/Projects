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
		
		if(channel<1||channel>120) {
			System.out.println("There is no such channel.");
			return;
		}
		
		System.out.println("The channel is set to " + channel);
	}
	
	public void setVolume(int newVolumeLevel){
		if(!on){
			System.out.println("The TV is off.");
			return;
		}
		
		volumeLevel = newVolumeLevel;
		
		if(volumeLevel<1||volumeLevel>7) {
			System.out.println("There is no such volume level.");
			return;
		}
		
		System.out.println("The volume level is set to " + volumeLevel);
	}
	
	public void channelUp() {
		if(!on){
			System.out.println("The TV is off.");
			return;
		}
		
		channel += 1;
		
		if(channel<1||channel>120) {
			System.out.println("There is no such channel.");
			return;
		}
		
		System.out.println("The channel is set to " + channel);
	}
	
	public void channelDown() {
		if(!on){
			System.out.println("The TV is off.");
			return;
		}
		
		channel -= 1;
		
		if(channel<1||channel>120) {
			System.out.println("There is no such channel.");
			return;
		}
		
		System.out.println("The channel is set to " + channel);
	}
	
	public void volumeUp() {
		if(!on){
			System.out.println("The TV is off.");
			return;
		}
		
		volumeLevel += 1;
		
		if(volumeLevel<1||volumeLevel>7) {
			System.out.println("There is no such volume level.");
			return;
		}
		
		System.out.println("The volume level is set to " + volumeLevel);
	}
	
	public void volumeDown() {
		if(!on){
			System.out.println("The TV is off.");
			return;
		}
		
		volumeLevel -= 1;
		
		if(volumeLevel<1||volumeLevel>7) {
			System.out.println("There is no such volume level.");
			return;
		}
		
		System.out.println("The volume level is set to " + volumeLevel);
	}

}
