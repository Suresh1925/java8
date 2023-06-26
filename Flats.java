package Java8;

public class Flats implements Apartments{
	public int noOfFloors() {
		
		return 6;
	}
	public boolean isFurnished() {
		return true;
	}

	public int budget() {
		return 1500000;
	}
	public static String builderName() {
		return "CasaGrand";
	}
}
