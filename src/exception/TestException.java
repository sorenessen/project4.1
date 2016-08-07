package exception;

public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 10;
		// try...catch allows the following message to be printed if there's an error or an exception.
		try {
		int result = number/5;
		System.out.println(result);
	}	catch(Exception ex){
			System.out.println("You can not divide a number by zero! Please fix your statement...");
	}
	}
}
