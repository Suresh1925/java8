package Java8;

public interface Apartments {
	public int noOfFloors();
	public boolean isFurnished();
	public static String builderName() {
		
		return "VIP Constructions";
	}
public default int budget() {
	return 1200000;
}
}
