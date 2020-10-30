import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ParserToPrintComments {
	public static void main(String[] args) throws IOException {
		removeComment();
	}

	static void removeComment() throws IOException {
		try {
			BufferedReader br = new BufferedReader(
					new FileReader(
							"C:/Users/vivedula/workspace_Tech_Practice/Tech_Practice/src/SimpleTest.java"));
			String line;
			int counter = 0;
			while ((line = br.readLine()) != null) {
				if (line.contains("/*") && line.contains("*/")
						|| line.contains("//")) {

					System.out
							.println(line
									.replaceAll(
											"(?:/\\*(?:[^*]|(?:\\*+[^*/]))*\\*+/)|(?://.*)",
											""));
					counter++;
				} else if (line.contains("/*") || line.contains("*")
						|| line.contains("*/")) {
					counter++;
					continue;
				} else
					System.out.println(line);
			}
			System.out.println("Number of lines that contain comments are :"
					+ counter);
			br.close();
		}

		catch (IOException e) {
			System.out.println("OOPS! File could not read!");
		}
	}
}
