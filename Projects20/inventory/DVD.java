package inventory;

public class DVD extends Product {
	private int lenght;
	private int ageRating;
	private String filmStudio;
	
	public DVD(int number, String name, int qty, double price, int lenght, int ageRating, String filmStudio) {
		super(number, name, qty, price);
		this.setLenght(lenght);
		this.setAgeRating(ageRating);
		this.setFilmStudio(filmStudio);
	}

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public int getAgeRating() {
		return ageRating;
	}

	public void setAgeRating(int ageRating) {
		this.ageRating = ageRating;
	}

	public String getFilmStudio() {
		return filmStudio;
	}

	public void setFilmStudio(String filmStudio) {
		this.filmStudio = filmStudio;
	}
	
	public double restockingFee()
    {
        return super.getPrice() * 0.05;
    }
	
	public double getInventoryValue()
    {
      return (super.getPrice() + restockingFee()) * super.getQtyInStock();
    }
	
	public String toString()
	{
	     return "\n\nItem Number      : " + super.getItemNumber() 
	   			+ "\nName             : " + super.getName() 
	   			+ "\nMovie Lenght     : " + getLenght()
	   			+ "\nAge Raing        : " + getAgeRating()
	   			+ "\nFilm Studio      : " + getFilmStudio()
	   			+ "\nQuantity in stock: " + super.getQtyInStock() 
	   			+ "\nPrice            : " + super.getPrice()
	   			+ "\nStock Value      : " + getInventoryValue()
	   			+ "\nProduct Status   : " + (super.getActive()?"Active":"Discontinued");
	}

}
