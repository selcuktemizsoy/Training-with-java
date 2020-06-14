
public class NarcissisticNumbers {

	public static void main(String[] args) {
			
		int number = 8208;
		int result = number;
		String value = number + "";
		int length = String.valueOf(value).length();
		int count = 0;
		
		for (int i = length; i > 0; i--) {
			int pow = (int)Math.pow(10, i - 1);
			int temp =  number / pow;
			number = number % pow;
			
			count += Math.pow(temp, length);
			
		}
		String isNarsist =(count == result) ? "Narcissistic Numbers" : "Not Narcissistic Numbers";
		System.out.println("Your number is " + result + " and your number is " + isNarsist);
		
	}

}
