
public class Lab {
	
	public static void stringTimes(String str, int n) {
		for(int i = 0; i < n; i++) {
			System.out.print(str);
		}
	}
	
	public static void love6(int num1, int num2) {
		System.out.println(num1 == 6 || num2 == 6 || num1 + num2 == 6);
	}
	
	public static void specialEleven(int num1) {
		System.out.println(num1 % 11 == 0 || (num1 - 1) % 11 == 0 );
	}
	
	public static void deerPlay(int temp, boolean isSummer) {
		System.out.println(temp > 60 && temp < 90 || isSummer && temp > 60 && temp < 100);
	}
	
	public static void caughtSpeeding(int speed, boolean isBirth) {
		int noTicket = (isBirth) ? 65 : 60;
		
		int bigTicket = (isBirth) ? 85 : 80;
		
		
		System.out.println((speed > noTicket) ?  (speed > bigTicket) ? 2 : 1 : 0);
	}
	
	public static void cigarParty(int number, boolean isWeekend) {
		System.out.println(isWeekend && number > 40 || number > 40 && number < 60);
	}
	
	
	public static void main(String[] args) {
		

	}

}
