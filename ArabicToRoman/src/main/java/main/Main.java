package main;

/**
 * The main class. Nothing needs to be changed here!
 * 
 * @author Torben Scheffel, ISP, Universitaet zu Luebeck
 */
public class Main {

	public static void main(String[] args) {
		
		// converts the input
		int arabicNumber = Integer.parseInt(args[0]);
		
		Roman roman = new Roman();
		
		// outputs the Roman number
		System.out.println(roman.toRoman(arabicNumber).toString());
	}

}
