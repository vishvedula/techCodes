/**
 * Julius Caesar protected his confidential information by encrypting it using a cipher. 
 * Caesar's cipher shifts each letter by a number of letters. If the shift takes you past the end of the alphabet, 
 * just rotate back to the front of the alphabet. In the case of a rotation by 3, w, x, y and z would map to z, a, b and c.

Original alphabet:      abcdefghijklmnopqrstuvwxyz
Alphabet rotated +3:    defghijklmnopqrstuvwxyzabc

Sample Input:

11
middle-Outz
2

Sample Output:

okffng-Qwvb

Explanation-->

Original alphabet:      abcdefghijklmnopqrstuvwxyz
Alphabet rotated +2:    cdefghijklmnopqrstuvwxyzab

m -> o
i -> k
d -> f
d -> f
l -> n
e -> g
-    -
O -> Q
u -> w
t -> v
z -> b


 * @author vivedula
 *
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CaesarCipher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
		caesarCipher("middle-Outz");
	}

	private static String caesarCipher(String str){
		Map<Integer,Character> map = new HashMap<Integer,Character>();
		map.put(0,'a');
		map.put(1,'b');
		map.put(2,'c');
		map.put(3,'d');
		map.put(4,'e');
		map.put(5,'f');
		map.put(6,'g');
		map.put(7,'h');
		map.put(8,'i');
		map.put(9,'j');
		map.put(10,'k');
		map.put(11,'l');
		map.put(12,'m');
		map.put(13,'n');
		map.put(14,'o');
		map.put(15,'p');
		map.put(16,'q');
		map.put(17,'r');
		map.put(18,'s');
		map.put(19,'t');
		map.put(20,'u');
		map.put(21,'v');
		map.put(22,'w');
		map.put(23,'x');
		map.put(24,'y');
		map.put(25,'z');
		System.out.println("Input string is: "+str);
		char[] array = str.toCharArray();
		//char input = 'p';
		int oldIndex = 0;
		int sampleIndex = 3;
		Set<Entry<Integer,Character>> entrySet = map.entrySet();
		//System.out.println(map.entrySet());
		StringBuilder strBuilder = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			char input = array[i];
			if (Character.isLetter(input)) {
				
			for (Entry<Integer, Character> entry : entrySet) {
				
					if (entry.getValue() == Character.toLowerCase(input)) {
						oldIndex = entry.getKey();
						break;
					}
			}	
				    // Check to change the newIndex in a circular manner
					int newIndex = oldIndex + sampleIndex;
					if(newIndex > 25){
						newIndex= newIndex-25-1;
					}
					

					if (Character.isLowerCase(input))
						strBuilder.append(Character.toLowerCase(map
								.get(newIndex)));
					else
						strBuilder.append(Character.toUpperCase(map
								.get(newIndex)));
				
			} else {
				strBuilder.append(array[i]);
			}
		}
		System.out.println(strBuilder.toString());
		return strBuilder.toString();
	}
	
}

//cdefghijklmnopqrstuvwxyzab
