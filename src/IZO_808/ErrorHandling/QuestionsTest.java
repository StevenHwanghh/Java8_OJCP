package IZO_808.ErrorHandling;

public class QuestionsTest {

	public static void main(String[] args) {

        try {

            int count = Integer.parseInt(args[0]);

        } catch (NumberFormatException e) {

            System.err.println("Error: Not a number");

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}


