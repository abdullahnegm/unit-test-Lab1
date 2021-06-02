package vehicle.test;

import vehicle.app.State;
import vehicle.hal.Temp;

public class Main_Test {

	public static void main(String[] args) {
		State s = new State();
		Temp.iTemp1 = 50;
		System.out.println(s.bValidateHighPerformance());
		Temp.iTemp2 = 51;
		System.out.println(s.bValidateHighPerformance());
	}

}
