package com.tech.practicePrograms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class ArrayList_Separation {

	public static void main(String args[]) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(540437,697932,573775,709746,244720,244720,595019,644115,244720,244720,734039,244720,561788,244720, 305878,630638,557471,244720,620050,620050,620050,628203,620050,620050,709752,709751,620050,617343,556205,734052, 643919,543470,543470,761114,543470,608570,543470,543470,697918,650101,771462,602938,561786,612205,687088,663176, 602938,643925,602938,602938,694766,612187,602938,602938,628226,689168,666321,654055,602938,573757,722403,229258,286028, 595025,229258,229258,
				229258,643414,689153,229258,624354,675029,557483,624355,659944,576868,544151,608584,557484,780775,644115,244720,244720,734039,244720,561788,244720, 305878,630638,557471,244720,620050,620050,620050,628203,620050,620050,709752,709751,620050,617343,556205,734052, 643919,543470,543470,761114,543470,608570,543470,543470,697918,650101,771462,602938,561786,612205,687088,663176, 602938,643925,602938,
				602938,694766,612187,602938,602938,628226,689168,666321,654055,602938,573757,722403,229258,286028, 595025,229258,229258));
		
		int size = 100; 
		List<List<Integer>> r = split(list, size);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static  List<List<Integer>> split(List<Integer> list, int sizeOfEachList) {
	    if (list == null) {
	        throw new NullPointerException("The list parameter is null.");
	    }
	    if (sizeOfEachList <= 0) {
	        throw new IllegalArgumentException(
	                "The number of lists parameter must be more than 0.");
	    }
	    
	    int inputListSize = list.size();
	    int noOfSubLists = (int) Math.ceil((double)inputListSize /(double) sizeOfEachList);

	    List<List<Integer>> finalList = new ArrayList(noOfSubLists);

	    int remainingElements = inputListSize;
	    int noOfElementsDone = 0;
	    for (int i = 0; i < noOfSubLists; i++) {
	    	remainingElements = inputListSize - noOfElementsDone;
	    	
	    	if(remainingElements > sizeOfEachList){
	    		finalList.add(list.subList(i*sizeOfEachList, (i+1)*sizeOfEachList));
	    		noOfElementsDone = noOfElementsDone + sizeOfEachList;
	    	}else {
	    			finalList.add(list.subList(i*sizeOfEachList, inputListSize));
		    		noOfElementsDone = noOfElementsDone + remainingElements;
	    		}
	    		
	    	}
	   System.out.println("finalList" + finalList);
	    return finalList;
	}
	
}

