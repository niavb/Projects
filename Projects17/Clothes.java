package projects17;

import java.util.ArrayList;
import java.util.Arrays;

public class Clothes {
	String type;
	Brand brand;
	Shop shop;
	ArrayList<Size> size;
	
	Clothes(){
		size = new ArrayList<Size> (Arrays.asList(
				new Size(this, "S"),
				new Size(this, "M"),
				new Size(this, "L")));
	}
	
}
