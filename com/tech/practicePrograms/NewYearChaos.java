import java.util.ArrayList;
import java.util.List;



public class NewYearChaos {
	//1,2,3,4,5
	//2,1,5,4,3
	
	//Output: 3 bribes given --> 2 has given to 1
	// 5 has given to 4 and 3
	
	@SuppressWarnings("serial")
	public static void main(String args[]){
		List<Integer> aList = new ArrayList<Integer>(){{
			add(1);
			add(2);
			add(3);
			add(4);
			add(5);
		}};
		
		/*List<Integer> bList = new ArrayList<Integer>(){{
			add(3);
			add(4);
			add(1);
			add(5);
			add(2);
		}};*/
		
		List<Integer> bList = new ArrayList<Integer>(){{
			add(5);
			add(3);
			add(4);
			add(1);
			add(2);
		}};
		
		minimumBribes(aList,bList);
		
	}
	
	@SuppressWarnings("rawtypes")
	private static void minimumBribes(List a, List b){
		int minBribe=0;
		boolean moreBribe = false;
		int aLength = a.size();
		
		for(int i=0; i<aLength; ){
			for(int j=0; j<aLength; j++){
				int counter= 0;
				if(a.get(i)==b.get(j)){
					a.remove(i);
					b.remove(j);
					aLength = a.size();
					break;
				}else{
					minBribe+=++counter;
				}
			}
		}
		
		if(moreBribe){
			System.out.println("Too chaotic");
		} else{
			System.out.println("The minimum number of bibes are: "+minBribe);
		}
		
	}

}
