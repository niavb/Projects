package projects10;

public class TV_Test {

	public static void main(String[] args) {
		TV sony = new TV();
		sony.turnOn();
		sony.setChannel(82);
		sony.setVolume(5);
		sony.channelUp();
		sony.channelDown();
		sony.volumeUp();
		sony.volumeDown();
		sony.turnOff();
		

	}

}
