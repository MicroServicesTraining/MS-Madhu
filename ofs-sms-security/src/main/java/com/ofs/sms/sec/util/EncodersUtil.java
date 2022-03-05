/**
 * 
 */
package com.ofs.sms.sec.util;

/**
 * @author Lalitha
 *
 */
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

/**
 * @author USER
 *
 */
public class EncodersUtil {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String pwd = "abcd";
		
		String encodedPwd = "";
		PasswordEncoder noopPasswordEncoder = NoOpPasswordEncoder.getInstance();
		
		encodedPwd = noopPasswordEncoder.encode(pwd);
		
		System.out.println("NoopPassword encoding ::: " + encodedPwd);
		
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		encodedPwd = bCryptPasswordEncoder.encode("1234");
		System.out.println("BCryptPasswordEncoder encoding ::: " + encodedPwd);
		
		Pbkdf2PasswordEncoder pbkdf2PasswordEncoder = new Pbkdf2PasswordEncoder();
		encodedPwd = pbkdf2PasswordEncoder.encode(pwd);
		System.out.println("Pbkdf2PasswordEncoder encoding ::: " + encodedPwd);
		
		StandardPasswordEncoder standardPasswordEncoder = new StandardPasswordEncoder();
		encodedPwd = standardPasswordEncoder.encode(pwd);
		System.out.println("StandardPasswordEncoder encoding ::: " + encodedPwd);
				
	}

}