package projects17;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shop shop = new Shop();
		shop.name = "FashionDays";
		
		Brand gucci = new Brand();
		gucci.name = "Gucci";
		Brand prada = new Brand();
		prada.name = "Prada";
		
		Clothes clothing1 = new Clothes();
		clothing1.brand = gucci;
		clothing1.type = "Gucci Skirt";
		Clothes clothing2 = new Clothes();
		clothing2.brand = prada;
		clothing2.type = "Prada Jeans";
		
		shop.clothes = new ArrayList<Clothes> (Arrays.asList(clothing1, clothing2));
		
		System.out.println("Clothes in: " + shop.name);
		for (Clothes clothes : shop.clothes) {
		    System.out.println(clothes.type +" "+ clothes.brand.name);
		}

	}

}
