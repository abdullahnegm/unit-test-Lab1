package vehicle.hal;

public class Temp {
	
	public static int iTemp1, iTemp2;
	public static int iReadT1() {
		System.out.println("Temp.iReadT1");
		return iTemp1;
	}
	
	public static int iReadT2() {
		System.out.println("Temp.iReadT2");
		return iTemp2;
	}
}
