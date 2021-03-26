package loan_1;

// if Validators extends exception then this also becomes exception
public class Validators extends Exception{

	Validators(String s) {
		super(s);
		//throws EXcEPTION<<<
	}

	
	//^ is starting of the regex expression and $ is ending of that 
	public static void isValidEmail(String email) throws Validators {
		String regex = "^(.+)@(.+)$";
		if (!email.matches(regex)) {
			throw new Validators("Invaild Email, try again :(");
		} else {
			System.out.println("Email Verified");
		}
	}

	public static void isValidAadhar(String Aadhar) throws Validators {
		String regex = "^[2-9]{1}[0-9]{3}[0-9]{4}[0-9]{4}$";
		
		if (!String.valueOf(Aadhar).matches(regex)) {
			throw new Validators("-->##Invaild Aadhar_!!, try again :(");
		} else {
			System.out.println("-->##Aadhar Verified_!!");
		}
	}

	public static void isValidPhone(String Phone) throws Validators {
		String regex = "^[0-9]{10}$";
		if (!Phone.matches(regex)) {
			throw new Validators("-->##Invalid Phone number");
		} else {
			System.out.println("Phone number Verified");
		}
	}

	public static void isValidPAN(String PAN) throws Validators {
		String regex = "[a-zA-Z]{5}[0-9]{4}[a-zA-Z]{1}";
		if (!PAN.matches(regex)) {
			throw new Validators("-->##Invalid PAN, try again :( ");
		} else {
			System.out.println("-->##PAN Verified");
		}
	}
	
	
}
