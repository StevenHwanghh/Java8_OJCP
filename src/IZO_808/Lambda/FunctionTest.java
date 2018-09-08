package IZO_808.Lambda;

import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {
		// Lambda express can write expression
		Function<Integer, Double> milesToKMs = (input)->input*1.6;
		// or statement
		Function<Integer, Double> kMsToMiles = (input)->{return input/1.6;};
		
		int miles = 3;
		double kMsfromMiles = milesToKMs.apply(miles);
		System.out.println(miles+" Miles equals "+kMsfromMiles+" Kilomoters.");
		
		int kms = 96;
		double milesFromKms = kMsToMiles.apply(kms);
		System.out.println(kms+" KilomotersMiles equals "+milesFromKms+" miles");

	}

}
