package IZO_808.Fundamental;

public class PrimitiveConversionTest {

	public static void main(String[] args) {
		long a=9876543210L;
		// When narrowing conversion is happened, explicit conversion should be assigned. 
		// Otherwise, there will be a compiler error.
		int b=(int)a;
		System.out.println(a);
		System.out.printf(Long.toBinaryString(a)+'\n');

		System.out.println(b);
		System.out.printf(Integer.toBinaryString(b)+'\n');
		
		int c=-4;
		System.out.println(Integer.toBinaryString(c));
		System.out.println(Integer.toBinaryString(c>>1));
		System.out.println(Integer.toBinaryString(c>>>32));
	}

}
