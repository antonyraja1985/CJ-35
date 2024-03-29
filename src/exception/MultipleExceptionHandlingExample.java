package exception;

public class MultipleExceptionHandlingExample {

	public static void div(int a, int b) {

		int c = a / b;

		System.out.println(c);

	}

	public static void mul(int a, int b) {

		int c = a * b;

		System.out.println(c);

	}

	public static void changeUpperCase(String name) {

		System.out.println(name.toUpperCase());
	}

	public static void main(String[] args) {

		try {
			div(10, 10);
			changeUpperCase(null);

			String name = "janani";

			System.out.println(name.charAt(5));
			
			int[] numbers= {4,5,6};
			
			System.out.println(numbers[5]);

		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// System.out.println(e);
		} catch (NullPointerException e) {
			e.printStackTrace();

		} catch (Exception e) {
			System.out.println("====================");
			e.printStackTrace();
		}

		mul(10, 10);

	}

}
