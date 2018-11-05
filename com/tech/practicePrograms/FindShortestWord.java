import java.util.StringTokenizer;


public class FindShortestWord {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findShort("bitcoin take over the world maybe who knows perhaps"));
	}

	private static int findShort(String str){
		
		StringTokenizer tokenizer = new StringTokenizer(str);
		int tokens = tokenizer.countTokens();
		System.out.println(tokens);
		int shortestPath = Integer.MAX_VALUE;
		
			while(tokenizer.hasMoreTokens()){
				int length = tokenizer.nextToken().length();
				if(length < shortestPath){
					shortestPath = length;
				}
			}
			
		
		return shortestPath;
		
	}
}
