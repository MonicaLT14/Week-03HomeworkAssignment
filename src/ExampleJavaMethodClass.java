
public class ExampleJavaMethodClass {

	public static void main(String[] args) {
		
		int firstNumber = 3;

		int secondNumber = 7;

		sumTwoNumsReturnResult(firstNumber,secondNumber);

		int result = 0;

		result = sumTwoNumsReturnResult(firstNumber,secondNumber);

		System.out.println("The sum is: " + result);
	}
	public static int sumTwoNumsReturnResult (int number1, int number2) {

		int sum = 0;

		sum = number1 + number2;

		return sum;

		}
}
