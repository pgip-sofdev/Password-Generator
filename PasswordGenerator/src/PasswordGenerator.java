import java.util.*;


public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int length = 12;
		System.out.println(password(length));
		
	}
		static char[] password(int len)
		{
			System.out.println("Create password using random ()");
			System.out.println("The new password is:  ");
			
		String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Lower_chars = "abcdefghijklmnopqrstuvwxyz";
		String Numbers = "0123456789";
		String Symbols = "!@#$%^&*?<>";
		
		String values = Capital_chars + Lower_chars + Numbers + Symbols ;
		
		Random rndm_method = new Random ();
		
		char[] password = new char [len];
		
		for (int i = 0; i < len; i ++)
		{
			
			password[i] = values.charAt(rndm_method.nextInt(values.length()));
		
		}
		
		return password;
		}
}
