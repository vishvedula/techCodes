/*
 * Java code to create a Ransom note from given NewsPaper strings
 */

public class StringTokenizerExample {
	
	public static void main(String args[]){
		String str1 = "Do you have a pencil";
		String str2 = "have Do pencil";
		
		isPresent(str1, str2);
	}

	private static void isPresent(String str1, String str2){
		 String[] second = str2.split(" ");
		 boolean flag = false;
		try {
			if (str1.length() > str2.length()) {
				for(int i=0; i<second.length; i++){
					if(str1.contains(second[i])){
						flag = true; 
						continue;
					} else {
						flag = false;
						break;
					}
				}
			} else {
				System.out.println("The second String is lengthier than the first");
			}

			if (flag) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		} catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
}
