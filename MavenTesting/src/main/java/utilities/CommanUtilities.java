package utilities;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class CommanUtilities {
	
	
	public static String getRandomString(int length) {
		String Chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
	    StringBuilder sb = new StringBuilder();
	    Random random = new Random();
	    for (int i = 0; i < length; i++) {
	        sb.append(Chars.charAt(random.nextInt(Chars.length())));
	    }
	    return sb.toString();
	}
	
	public static String getRandomEmail() {
		
		String email = "TestUser"+getRandomString(5)+"@yopmail.com";
	    return email;
	}

	public static Timestamp getCurrentTimeStamp() { 
		
			Date date = new Date();
			Timestamp timestamp =    new Timestamp(date.getTime());

	        return timestamp;
	}
	
	public static void getCurrentTime() {
		
		   final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss"); 
	        System.out.println(sdf.format(getCurrentTimeStamp()));
	}
	public static void getCurrentDate() {
		
		   final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
	        System.out.println(sdf.format(getCurrentTimeStamp()));
	}
	
	
}
