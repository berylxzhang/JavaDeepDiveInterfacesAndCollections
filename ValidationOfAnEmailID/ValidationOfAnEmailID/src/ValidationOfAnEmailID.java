import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
	
public class ValidationOfAnEmailID {
	
	public static void main(String args[]) {
	      List emails = new ArrayList();
	      emails.add("sairamkrishna@tutorialspoint.com");
	      emails.add("kittuprasad700@gmail.com");
	      emails.add("sairamkrishna_mammahe%google-india.com");
	      emails.add("sairam.krishna@gmail-indai.com");
	      emails.add("sai#@youtube.co.in");
	      emails.add("kittu@domaincom");
	      emails.add("kittu#gmail.com");
	      emails.add("@pindom.com");
	      
	      
	      //validity of an email address
	      String regex = "^(.+)@(.+)$";
	      Pattern pattern = Pattern.compile(regex);
	      
	      for (Object email : emails) {
	         Matcher matcher = pattern.matcher((CharSequence) email);
	         System.out.println(email + " : " + matcher.matches());
	      } 
	      System.out.println("\n");
	      //Exact match of a certain user
	      String regex1 = "kittu";
//	      String regex1 = "\\Bsa|sa\\B";
	      Pattern pattern1= Pattern.compile(regex1);
	      
	      
	      
	      for (Object email : emails) {
	         Matcher matcher1 = pattern1.matcher((CharSequence) email);
	         System.out.println(email + " : " + matcher1.find());
//	         while (matcher1.find())
//	         {
//	             System.out.print("Start index: " + matcher1.start());
//	             System.out.print(" End index: " + matcher1.end() + " ");
//	             System.out.println(matcher1.group());
//	         }
	      } 
	   }
	
}
