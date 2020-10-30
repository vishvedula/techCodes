import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Sorting(1.0) *revision

To read a list of numbers from a text file, sort them create another text file and put them there.
*/

public class TransferNumbersOneFileToAnother {

	public static void main(String args[]) throws IOException {
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:/Users/vivedula/Desktop/NumbresTest.txt"));
			BufferedWriter bw1 = new BufferedWriter(new FileWriter("C:/Users/vivedula/Desktop/NumbresTest1.txt"));
			List<Integer> aList = new ArrayList<Integer>();
			String currentLine = null;
			int swap = 0;
			while (null != (currentLine = br.readLine())) {
				if (isPrimitive(currentLine)) {
					aList.add(Integer.valueOf(currentLine));
				}
			}
			System.out.println(aList);
			 int[] ret = new int[aList.size()];
			    for (int i=0; i < ret.length; i++)
			    {
			        ret[i] = aList.get(i).intValue();
			    }
			
			
			for (int i = 0; i < ret.length; i++) {

				for (int j = 0; j < ret.length - i - 1; j++) {
					if (ret[j] > ret[j+ 1]) /* For descending order use < */
					{
						swap = ret[j];
						ret[j] = ret[j + 1];
						ret[j + 1] = swap;
						
					}
					
				}
				bw1.write(Integer.toString(ret[i]));
				bw1.write("\n");
			
			}
			bw1.close();

		} catch (FileNotFoundException e)

		{
			e.printStackTrace();
		}

	}

	private static boolean isPrimitive(String currentLine) {
		boolean status = true;
		if (currentLine.length() < 1)
			return false;
		for (int i = 0; i < currentLine.length(); i++) {
			char c = currentLine.charAt(i);
			if (Character.isDigit(c) || c == '.') {

			} else {
				status = false;
				break;
			}
		}
		return status;
	}
}
