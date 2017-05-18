import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String args[]) {
		List<String> listEmails = new ArrayList();
		listEmails.add("user@domain.com");
		listEmails.add("user@domain.co.in");
		listEmails.add("user1@domain.com");
		listEmails.add("user.name@domain.com");
		listEmails.add("user#@domain.co.in");
		listEmails.add("user@domaincom");

		// Invalid emails
		listEmails.add("user#domain.com");
		listEmails.add("@yahoo.com");

		// Have regex created
		String regex = "^(.+)@(.+)$";

		Pattern pattern = Pattern.compile(regex);

		for (String email : listEmails) {
			Matcher matcher = pattern.matcher(email);
			System.out.println(email + " : " + matcher.matches());
		}
	}
}
