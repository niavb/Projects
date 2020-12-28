package inventory;

public class CD extends Product {
	private String artist;
	private int numberOfSongs;
	private String label;
	
	public CD(int number, String name, int qty, double price, String artist, int numberOfSongs, String label) {
		super(number, name, qty, price);
		this.setArtist(artist);
		this.setLabel(label);
		this.setNumberOfSongs(numberOfSongs);
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getNumberOfSongs() {
		return numberOfSongs;
	}

	public void setNumberOfSongs(int numberOfSongs) {
		this.numberOfSongs = numberOfSongs;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
	public String toString()
	{
	     return "\n\nItem Number      : " + super.getItemNumber() 
	   			+ "\nName             : " + super.getName() 
	   			+ "\nArtist           : " + getArtist()
	   			+ "\nSongs on Album   : " + getNumberOfSongs()
	   			+ "\nRecord label     : " + getLabel()
	   			+ "\nQuantity in stock: " + super.getQtyInStock() 
	   			+ "\nPrice            : " + super.getPrice()
	   			+ "\nStock Value      : " + getInventoryValue()
	   			+ "\nProduct Status   : " + (super.getActive()?"Active":"Discontinued");
	}

}
