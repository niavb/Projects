package projects15;

public class Time {
	private int hours;
	private int min;
	private int sec;
	
	public Time() {
		setSec((int) (System.currentTimeMillis() / 1000) % 60) ;
		setMin((int) ((System.currentTimeMillis() / (1000*60)) % 60));
		setHours((int) ((System.currentTimeMillis() / (1000*60*60)) % 24));
	}
	
	public Time(int millis) {
		setSec((millis / 1000) % 60) ;
		setMin((millis / (1000*60)) % 60);
		setHours((millis / (1000*60*60)) % 24);
	}
	
	public Time(int hour, int min, int sec) {
		this.setHours(hour);
		this.setMin(min);
		this.setSec(sec);
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getSec() {
		return sec;
	}

	public void setSec(int sec) {
		this.sec = sec;
	}
	
	public void setTime(int millis) {
		setSec((millis / 1000) % 60) ;
		setMin((millis / (1000*60)) % 60);
		setHours((millis / (1000*60*60)) % 24);
	}
	

}
