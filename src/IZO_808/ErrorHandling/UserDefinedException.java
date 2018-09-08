package IZO_808.ErrorHandling;

public class UserDefinedException {

	public static void main(String[] args) {
		UserDefinedException test = new UserDefinedException();
		String input = "Capitalized";
		try {
			test.capitalize(input);
		} catch (NullPointerException e) {
			e.toString();
		} catch( AlreadyCapitalException e) {
			e.printStackTrace();
		}
	}
	
	public String capitalize(String input) throws AlreadyCapitalException, NullPointerException {
		if(input==null) {
			throw new NullPointerException("You passed a null String");
		}
		Character firstChar = input.charAt(0);
		if(Character.isUpperCase(firstChar)) {
			throw new AlreadyCapitalException();
		}
		
		return firstChar.toString().toUpperCase()+input.substring(1);
	}

}


class AlreadyCapitalException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public String toString() {
		return "Input has already capitalized";
	}
	
}